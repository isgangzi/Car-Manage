package com.CarManage.controller;



import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.CarManage.entitys.User;
import com.CarManage.service.IUser;

@Controller
public class LoginController {
		
	@Autowired
	private IUser userService;
	
		@GetMapping(value="/login")
		public String toLogin(){
			return "login";
		}
		
		@PostMapping(value="/index")
		public String toLogin(HttpServletRequest request, User user){
				if (userService.isUser(user)) {
					return "index";
				}else{
					request.setAttribute("msg", "账户名或密码或角色不正确！");
					return "login";
				}
		}

}
