package com.zb.entity;

import java.io.Serializable;

public class NewsDetail implements Serializable {
    private Integer id;// INT PRIMARY KEY AUTO_INCREMENT,#新闻编号
    private String title;// VARCHAR(30) NOT NULL, #新闻标题
    private String summary;// VARCHAR(30), #新闻摘要
    private String author;// VARCHAR(30), #作者
    private String createDate;// VARCHAR(30) NOT NULL #创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
