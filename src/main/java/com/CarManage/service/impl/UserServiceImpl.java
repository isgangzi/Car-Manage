package com.CarManage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarManage.dao.UserMapper;
import com.CarManage.entitys.User;
import com.CarManage.service.IUser;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserServiceImpl implements IUser{

	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean isUser(User user) {
		List<User> list = userMapper.selectByUserName(user);
		if (list!=null &&list.size()!=0) {
			return  true;
		}else{
			return false;
		}
	}

	@Override
	public PageInfo<User> allUsersInfo(int currentPage, int pageSize) {
		PageHelper.startPage( currentPage,  pageSize);
		List<User> list = 	userMapper.findAllUser();
		PageInfo<User> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
	
	
}
