/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.*;
import java.sql.Date;

/**
 *
 * @author admin
 */
public class Product {
    private int productID;
    private String productName;
    private int categoryId;
    private int brandId;
    private String image;
    private int quantityInStock;
    private double price;
    private double discount;
    private int soldQuantity;
    private String description;
    private boolean status;
    private Date updatedDate;

    public Product() {
    }

    public Product(int productID, String productName, int categoryId, int brandId, String image, int quantityInStock, double price, double discount, int soldQuantity, String description, boolean status, Date updatedDate) {
        this.productID = productID;
        this.productName = productName;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.image = image;
        this.quantityInStock = quantityInStock;
        this.price = price;
        this.discount = discount;
        this.soldQuantity = soldQuantity;
        this.description = description;
        this.status = status;
        this.updatedDate = updatedDate;
    }

    public Product(String productName, int categoryId, int brandId, String image, int quantityInStock, double price, double discount, int soldQuantity, String description, boolean status, Date updatedDate) {
        this.productName = productName;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.image = image;
        this.quantityInStock = quantityInStock;
        this.price = price;
        this.discount = discount;
        this.soldQuantity = soldQuantity;
        this.description = description;
        this.status = status;
        this.updatedDate = updatedDate;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    
}
