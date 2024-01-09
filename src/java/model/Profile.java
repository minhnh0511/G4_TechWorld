/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Profile {
    private int userId;
    private boolean gender;
    private String phone;
    private String address;
    private String image;

    public Profile() {
    }

    public Profile(int userId, boolean gender, String phone, String address, String image) {
        this.userId = userId;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.image = image;
    }

    public Profile(boolean gender, String phone, String address, String image) {
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.image = image;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    
}
