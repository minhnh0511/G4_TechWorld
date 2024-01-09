/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Category {
    private int categoryId;
    private String categoryName;
    private String description;
    private String image;

    public Category() {
    }

    public Category(int categoryId, String categoryName, String description, String image) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.image = image;
    }

    public Category(String categoryName, String description, String image) {
        this.categoryName = categoryName;
        this.description = description;
        this.image = image;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    
}
