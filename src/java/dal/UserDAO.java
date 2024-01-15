/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Role;

/**
 *
 * @author izayo
 */
public class UserDAO {
    public boolean isValidUser(HttpServletRequest request, String username, String password){
        try (Connection connection = new DBContext().getConnection();
              PreparedStatement preparedStatement = connection.prepareStatement("Select * from account where username = ? and password = ?")){
              preparedStatement.setString(1,username);
              preparedStatement.setString(2,password);
              try (ResultSet resultSet = preparedStatement.executeQuery()) {
                  if(resultSet.next()) {
                      int userId = resultSet.getInt("user_id");
                      
                      //Get role for the user 
                      
                      Role role = new Role();
                      List<Role> roles = role.getRolesByUserId(userId);
                      
                  HttpSession session = request.getSession();
                  session.setAttribute("username",username);
                  session.setAttribute("roles", roles);
                  }
                  }
    }  
        catch (SQLException e ) {
        e.printStackTrace();
        return false;
    }
        return false;
    
    } 
}
