package com.blog.pojo;

import org.springframework.stereotype.Component;

@Component
public class ArticleType {

  private long articleTypeId;
  private String articleTypeName;

  public ArticleType() {
  }

  public ArticleType(String articleTypeName) {
    this.articleTypeName = articleTypeName;
  }

  public long getArticleTypeId() {
    return articleTypeId;
  }

  public void setArticleTypeId(long articleTypeId) {
    this.articleTypeId = articleTypeId;
  }


  public String getArticleTypeName() {
    return articleTypeName;
  }

  public void setArticleTypeName(String articleTypeName) {
    this.articleTypeName = articleTypeName;
  }

}
