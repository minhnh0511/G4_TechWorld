/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Feedback {
    private int feedbackId;
    private int userId;
    private String content;
    private int ratedStar;

    public Feedback() {
    }

    public Feedback(int feedbackId, int userId, String content, int ratedStar) {
        this.feedbackId = feedbackId;
        this.userId = userId;
        this.content = content;
        this.ratedStar = ratedStar;
    }

    public Feedback(int userId, String content, int ratedStar) {
        this.userId = userId;
        this.content = content;
        this.ratedStar = ratedStar;
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

}
