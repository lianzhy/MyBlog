package com.blog.dao;


import com.blog.pojo.ArticleType;

public interface ArticleTypeMapper {
	//添加ArticleType
	int addArticleType(ArticleType articleType);
	//修改ArticleType
	int updateArticleType(ArticleType articleType);
	//删除ArticleType
	int deleteArticleType(long id);
	//查询ArticleType
	ArticleType queryArticleTypeById(long id);
}
