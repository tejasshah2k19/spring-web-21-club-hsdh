package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.UserBean;

@Controller
public class SessionController {

	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public String login() {
		return "Login";
	}

//	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
	@PostMapping("/authenticate")
	public String authenticate(UserBean user) {
		//
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return "Home";
	}
}
