package com.CarManage.controller.admin;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CarManage.entitys.CarMessage;
import com.CarManage.service.IMessages;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(value="/admin")
public class MessageController {

	@Autowired
	private IMessages iMessages;
	
	@GetMapping(value="myMessage")
	public String messageList(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
            @RequestParam(value = "pageSize", defaultValue = "5") int pageSize, HttpServletRequest request){
		PageInfo<CarMessage> messageList = 	iMessages.findItemByPage(currentPage, pageSize);
		request.setAttribute("messageList", messageList);
		return "myMessage";
	}
}
