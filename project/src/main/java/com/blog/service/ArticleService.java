package com.blog.service;

import com.blog.pojo.Article;

import java.util.List;

public interface ArticleService {
	//添加Article
	int addArticle(Article article);
	//修改Article
	int updateArticle(Article article);
	//删除Article
	int deleteArticle(long id);
	//查询Article
	List<Article> queryArticleByUser(long id);
	//按标题模糊查询
	List<Article> queryArticleByTitle(String articleTitle);
}
