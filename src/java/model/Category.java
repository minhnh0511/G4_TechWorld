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
    private String text;
    private String picture;

    public Category() {
    }

    public Category(int categoryId, String categoryName, String text, String picture) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.text = text;
        this.picture = picture;
    }

    public Category(String categoryName, String text, String picture) {
        this.categoryName = categoryName;
        this.text = text;
        this.picture = picture;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
