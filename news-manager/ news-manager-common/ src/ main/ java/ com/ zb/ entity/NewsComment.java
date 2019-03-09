package com.zb.entity;

import java.io.Serializable;

public class NewsComment implements Serializable {
    //卢克肖
    //琼斯
    //阿什利杨
    //鸭爸爸
    private Integer commentId; //INT PRIMARY KEY AUTO_INCREMENT,#评论编号
    private String commentContent;// VARCHAR(30) NOT NULL, #评论内容
    private String commentAuthor;// VARCHAR(30), #评论人
    private String commentCreateDate;// VARCHAR(30) NOT NULL, #评论时间
    private Integer newsId;// INT NOT NULL #新闻编号

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public String getCommentCreateDate() {
        return commentCreateDate;
    }

    public void setCommentCreateDate(String commentCreateDate) {
        this.commentCreateDate = commentCreateDate;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }
}
