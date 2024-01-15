/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import dal.*;
import java.util.ArrayList;
import java.util.List;
import model.Category;

/**
 *
 * @author Mira1311
 * 
 */
public class CategoryDAO extends DAO{
    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();
        xSql = "select * from category";
        try{
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int category_id;
            String category_name, description, image;
            Category category;
            while(rs.next()) {
                category_id = rs.getInt("category_id");
                category_name = rs.getString("category_name");
                description = rs.getString("description");
                image = rs.getString("image");
                category = new Category(category_id, category_name, description, image);
                categories.add(category);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return categories;
    }
    
    /*
    public static void main(String[] args) {
        CategoryDAO dao = new CategoryDAO();
        List<Category> cs = dao.getAllCategories();
        for(Category c : cs) {
            System.out.println(c.getCategoryName());
        }
    }
    */
}
