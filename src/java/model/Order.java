/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class Order {
    private int orderId;
    private Date orderDate;
    private String shipAddress;
    private int deliveryId;
    private int userId;
    private int state;

    public Order() {
    }

    public Order(int orderId, Date orderDate, String shipAddress, int deliveryId, int userId, int state) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.shipAddress = shipAddress;
        this.deliveryId = deliveryId;
        this.userId = userId;
        this.state = state;
    }

    public Order(Date orderDate, String shipAddress, int deliveryId, int userId, int state) {
        this.orderDate = orderDate;
        this.shipAddress = shipAddress;
        this.deliveryId = deliveryId;
        this.userId = userId;
        this.state = state;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    
    
}
