package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.NumberBean;

@Controller
public class NumbersController {

	@GetMapping("/input")
	public String loadInputJsp() {

		return "InputNumbers";
	}

//	@PostMapping("/addition")
//	public String addition(NumberBean num, Model model) {
//		//
//		int ans = num.getN1() + num.getN2();
//		model.addAttribute("ans", ans);
//		return "Ans";
//	}

	@PostMapping("/addition")
	public String addition(@RequestParam("n1") int x, @RequestParam("n2") int y, Model model) {
		//
		int ans = x + y;
		model.addAttribute("ans", ans);
		return "Ans";
	}
}
