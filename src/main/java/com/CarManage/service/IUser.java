package com.CarManage.service;

import com.CarManage.entitys.User;
import com.github.pagehelper.PageInfo;

public interface IUser {
	public boolean isUser(User user);
	
	public PageInfo<User> allUsersInfo(int currentPage, int pageSize);
}
