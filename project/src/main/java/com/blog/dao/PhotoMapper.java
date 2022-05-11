package com.blog.dao;

import com.blog.pojo.Photo;

public interface PhotoMapper {
	//添加photo
	int addPhoto(Photo photo);
	//修改photo
	int updatePhoto(Photo photo);
	//删除photo
	int deletePhoto(long id);
	//查询photo
	Photo queryPhotoById(long id);
}
