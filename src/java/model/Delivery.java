/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.*;

/**
 *
 * @author admin
 */
public class Delivery {
    private int delivery;
    private String companyName;

    public Delivery() {
    }

    public Delivery(int delivery, String companyName) {
        this.delivery = delivery;
        this.companyName = companyName;
    }

    public Delivery(String companyName) {
        this.companyName = companyName;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
