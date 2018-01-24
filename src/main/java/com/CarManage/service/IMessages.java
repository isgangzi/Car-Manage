package com.CarManage.service;


import com.CarManage.entitys.CarMessage;
import com.github.pagehelper.PageInfo;

public interface IMessages {
	public PageInfo<CarMessage> findItemByPage(int currentPage,int pageSize);
}
