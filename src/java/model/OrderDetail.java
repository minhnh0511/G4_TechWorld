/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class OrderDetail {
    private int orderId;
    private int productId;
    private double unitPrice;
    private int quatity;
    private double discount;

    public OrderDetail() {
    }

    public OrderDetail(int orderId, int productId, double unitPrice, int quatity, double discount) {
        this.orderId = orderId;
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.quatity = quatity;
        this.discount = discount;
    }

    public OrderDetail(int productId, double unitPrice, int quatity, double discount) {
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.quatity = quatity;
        this.discount = discount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    
}
