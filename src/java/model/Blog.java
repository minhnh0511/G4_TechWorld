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
public class Blog {
    private int blogId;
    private String title;
    private String content;
    private Date time;
    private int userId;

    public Blog() {
    }

    public Blog(int blogId, String title, String content, Date time, int userId) {
        this.blogId = blogId;
        this.title = title;
        this.content = content;
        this.time = time;
        this.userId = userId;
    }

    public Blog(String title, String content, Date time, int userId) {
        this.title = title;
        this.content = content;
        this.time = time;
        this.userId = userId;
    }


    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
}
