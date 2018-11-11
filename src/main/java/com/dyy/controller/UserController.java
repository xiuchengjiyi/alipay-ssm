package com.dyy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dyy.pojo.User;
import com.dyy.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/list")
	public ModelAndView products() throws Exception {
		
		List<User> userList = userService.getUserList();
		
		ModelAndView model = new ModelAndView("user");
		model.addObject("userList", userList);
		
		return model;
	}
	
}
