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
    private int quatity;

    public OrderDetail() {
    }

    public OrderDetail(int orderId, int productId, int quatity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quatity = quatity;
    }

    public OrderDetail(int productId, int quatity) {
        this.productId = productId;
        this.quatity = quatity;
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

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

}
