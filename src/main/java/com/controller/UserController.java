package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.UserBean;

//Controller --controller 
//Repository  --dao -- db
//Service  
//Component ----

@Controller
public class UserController {

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String loadSignup() {
		return "Signup";
	}

//	@RequestMapping(value="/saveuser",method=RequestMethod.POST)
	@PostMapping("/saveuser")
	public String saveUser(UserBean user) {

		System.out.println(user.getFirstName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return "Home";
	}
}
