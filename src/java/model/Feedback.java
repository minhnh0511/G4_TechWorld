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
public class Feedback {
    private int feedbackId;
    private int userId;
    private int productId;
    private String content;
    private int ratedStar;
    private Date time;


    public Feedback() {
    }

    public Feedback(int feedbackId, int userId, int productId, String content, int ratedStar, Date time) {
        this.feedbackId = feedbackId;
        this.userId = userId;
        this.productId = productId;
        this.content = content;
        this.ratedStar = ratedStar;
        this.time = time;
    }

    public Feedback(int userId, int productId, String content, int ratedStar, Date time) {
        this.userId = userId;
        this.productId = productId;
        this.content = content;
        this.ratedStar = ratedStar;
        this.time = time;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRatedStar() {
        return ratedStar;
    }

    public void setRatedStar(int ratedStar) {
        this.ratedStar = ratedStar;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    

}
