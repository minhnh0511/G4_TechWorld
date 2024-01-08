/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Supplier {
    private int supplierId;
    private String companyName;
    private String contactName;
    private String address;
    private String phone;

    public Supplier() {
    }

    public Supplier(int supplierId, String companyName, String contactName, String address, String phone) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.address = address;
        this.phone = phone;
    }

    public Supplier(String companyName, String contactName, String address, String phone) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.address = address;
        this.phone = phone;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
