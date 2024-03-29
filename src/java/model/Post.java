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
public class Post {
    private int postId;
    private String postTitle;
    private String content;
    private Date time;
    private int blogId;
    private int userId;

    public Post() {
    }

    public Post(int postId, String postTitle, String content, Date time, int blogId, int userId) {
        this.postId = postId;
        this.postTitle = postTitle;
        this.content = content;
        this.time = time;
        this.blogId = blogId;
        this.userId = userId;
    }

    public Post(String postTitle, String content, Date time, int blogId, int userId) {
        this.postTitle = postTitle;
        this.content = content;
        this.time = time;
        this.blogId = blogId;
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    
}
