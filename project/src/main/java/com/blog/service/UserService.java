package com.blog.service;

import com.blog.pojo.User;

public interface UserService {
	//添加User
	int addUser(User user);
	//删除User
	int deleteUser(long id);
	//修改User
	int updateUser(User user);
	//查询User
	User queryUserByName(String username);
}
