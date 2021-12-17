package com.controller;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	public String saveUser(UserBean user, Model model) {

		System.out.println(user.getFirstName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		model.addAttribute("user", user);
		return "Home"; //
	}

	@GetMapping("/upload")
	public String upload() {
		return "UploadFile";
	}

	@PostMapping("/savefile")
	public String saveFile(@RequestParam("profile") MultipartFile file) {

		System.out.println(file.getOriginalFilename());

		String masterPath = "d:\\abc\\";

		try {
			File myFile = new File(masterPath, file.getOriginalFilename());
			myFile.createNewFile();
			byte b[] = file.getBytes();
			FileUtils.writeByteArrayToFile(myFile, b);
			System.out.println("file uploading.....done....");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "UploadFile";

	}

}
