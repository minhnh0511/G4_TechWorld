/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.*;
import dal.DBContext;
import model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Role {
    private int  roleId;
    private String roleName;

    public Role() {
    }

    public Role(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;  
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public List<Role> getRolesByUserId(int userId) {
        List<Role> roles = new ArrayList<>();

        try (Connection connection = new DBContext().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("Select a.username, r.role_name "+
             "FROM role r" +
             "JOIN user u ON r.role_id = u.role_id"+
             "JOIN account a ON u.user_id = a.user_id"+
             "WHERE a.username = ? AND a.password = ?");
            ) {

            preparedStatement.setInt(1, userId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Role role = new Role();
                    role.setRoleId(resultSet.getInt("RoleId"));
                    role.setRoleName(resultSet.getString("RoleName"));
                    roles.add(role);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return roles;
    }
}
