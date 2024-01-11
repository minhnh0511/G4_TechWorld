/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Brand;

/**
 *
 * @author admin
 */
public class BrandDAO extends DAO{
    public List<Brand> getAllBrands() {
        List<Brand> brands = new ArrayList<>();
        xSql = "select * from brand";
        try{
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int brand_id;
            String brand_name,image;
            Brand brand;
            while(rs.next()) {
                brand_id = rs.getInt("brand_id");
                brand_name = rs.getString("brand_name");
                image = rs.getString("image");
                brand = new Brand(brand_id, brand_name,image);
                brands.add(brand);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return brands;
    }
    
}
