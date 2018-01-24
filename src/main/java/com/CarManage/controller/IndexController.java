package com.CarManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/admin")
public class IndexController {

	
	@RequestMapping(value={"/index","/"},method = RequestMethod.GET)
	public String toIndex(){
		return "index";
	}
	 
	@RequestMapping(value="/500")
	public String to500(){
		return "common/500";
	}
	
	@RequestMapping(value="/404")
	public String to404(){
		return "common/404";
	}
	
//	@GetMapping(value="/{page}")
//	public String abcd(@PathVariable String page){
//		return "common/404";
//	}
}
