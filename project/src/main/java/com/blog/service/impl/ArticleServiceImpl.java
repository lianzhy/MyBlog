package com.blog.service.impl;

import com.blog.dao.ArticleMapper;
import com.blog.pojo.Article;
import com.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleMapper articleMapper;

	@Override
	public int addArticle(Article article) {
		return 0;
	}

	@Override
	public int updateArticle(Article article) {
		return 0;
	}

	@Override
	public int deleteArticle(long id) {
		return 0;
	}

	@Override
	public List<Article> queryArticleByUser(long id) {
		return null;
	}

	@Override
	public List<Article> queryArticleByTitle(String articleTitle) {
		return null;
	}
}
