package com.blog.dao;


import com.blog.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ArticleMapper {
	//添加Article
	int addArticle(Article article);
	//修改Article
	int updateArticle(Article article);
	//删除Article
	int deleteArticle(@PathVariable(value = "articleId") long id);
	//查询Article
	List<Article> queryArticleByUser(@PathVariable(value = "userId") long id);
	//按标题模糊查询
	List<Article> queryArticleByTitle(String articleTitle);

}
