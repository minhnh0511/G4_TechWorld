/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Brand {
    private int brandId;
    private String brandName;
    private String image;

    public Brand() {
    }

    public Brand(int brandId, String brandName, String image) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.image = image;
    }

    public Brand(String brandName, String image) {
        this.brandName = brandName;
        this.image = image;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
