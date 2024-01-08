/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Product {
    private int productID;
    private String productName;
    private int categoryId;
    private int supplierId;
    private String picture;
    private int quantityInStock;
    private double price;
    private int soldQuantity;
    private String description;
    private boolean status;

    public Product() {
    }

    public Product(int productID, String productName, int categoryId, int supplierId, String picture, int quantityInStock, double price, int soldQuantity, String description, boolean status) {
        this.productID = productID;
        this.productName = productName;
        this.categoryId = categoryId;
        this.supplierId = supplierId;
        this.picture = picture;
        this.quantityInStock = quantityInStock;
        this.price = price;
        this.soldQuantity = soldQuantity;
        this.description = description;
        this.status = status;
    }

    public Product(String productName, int categoryId, int supplierId, String picture, int quantityInStock, double price, int soldQuantity, String description, boolean status) {
        this.productName = productName;
        this.categoryId = categoryId;
        this.supplierId = supplierId;
        this.picture = picture;
        this.quantityInStock = quantityInStock;
        this.price = price;
        this.soldQuantity = soldQuantity;
        this.description = description;
        this.status = status;
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

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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
    
    
}
