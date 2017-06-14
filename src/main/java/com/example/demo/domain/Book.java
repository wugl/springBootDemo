package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by qianlong on 16/10/2.
 */
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long bookId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = true)
    private String author;

    @Column(name = "create_time" ,nullable = true)
    private Date createTime;

    public Book(){}

    public Book(String title,String author,Date createTime){
        this.title = title;
        this.author = author;
        this.createTime = createTime;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}