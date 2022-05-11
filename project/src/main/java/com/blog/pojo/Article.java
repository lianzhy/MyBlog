package com.blog.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Article {

  private long articleId;
  private long articleTypeId;
  private String articleTitle;
  private String articleContent;
  private Date articleUploadTime;
  private long articleViews;
  private long userId;

  public Article() {
  }

  public Article(long articleTypeId, String articleTitle, String articleContent, Date articleUploadTime, long articleViews, long userId) {
    this.articleTypeId = articleTypeId;
    this.articleTitle = articleTitle;
    this.articleContent = articleContent;
    this.articleUploadTime = articleUploadTime;
    this.articleViews = articleViews;
    this.userId = userId;
  }

  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }


  public long getArticleTypeId() {
    return articleTypeId;
  }

  public void setArticleTypeId(long articleTypeId) {
    this.articleTypeId = articleTypeId;
  }


  public String getArticleTitle() {
    return articleTitle;
  }

  public void setArticleTitle(String articleTitle) {
    this.articleTitle = articleTitle;
  }


  public String getArticleContent() {
    return articleContent;
  }

  public void setArticleContent(String articleContent) {
    this.articleContent = articleContent;
  }


  public Date getArticleUploadTime() {
    return articleUploadTime;
  }

  public void setArticleUploadTime(java.sql.Date articleUploadTime) {
    this.articleUploadTime = articleUploadTime;
  }


  public long getArticleViews() {
    return articleViews;
  }

  public void setArticleViews(long articleViews) {
    this.articleViews = articleViews;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
