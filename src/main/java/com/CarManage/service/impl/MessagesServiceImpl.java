package com.CarManage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.CarManage.dao.CarMessageMapper;
import com.CarManage.entitys.CarMessage;
import com.CarManage.service.IMessages;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
public class MessagesServiceImpl implements IMessages{

		@Autowired
		private CarMessageMapper carMessageMapper;

		@Override
		public PageInfo<CarMessage> findItemByPage(int currentPage, int pageSize) {
	        PageHelper.startPage(currentPage, pageSize);
	        List<CarMessage> allMessages = carMessageMapper.findAll();   
	        PageInfo<CarMessage> pageInfo = new PageInfo<>(allMessages);
	        return pageInfo;
		}
	
}
