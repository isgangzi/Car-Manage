package com.CarManage.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CarManage.entitys.User;
import com.CarManage.service.IUser;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(value="/admin")
public class UserInfoController {
	
	@Autowired
	private IUser iUser;
	
		@GetMapping(value="userInfo")
		public String messageList(@RequestParam(value="currentPage",defaultValue = "1") int currentPage,
				@RequestParam(value="pageSize",defaultValue = "5") int pageSize,HttpServletRequest request){
			PageInfo<User> pageInfo = iUser.allUsersInfo(currentPage, pageSize);
			request.setAttribute("userInfo", pageInfo);
			return "userInfo";
		}
}
