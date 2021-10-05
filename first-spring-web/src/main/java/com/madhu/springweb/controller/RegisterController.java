package com.madhu.springweb.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.madhu.springweb.backend.UserServiceImpl;
import com.madhu.springweb.model.User;


@Controller
public class RegisterController {
	
	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(value = "/registerProcess")
	public ModelAndView registerProcess(HttpServletResponse response,
			@Valid @ModelAttribute("user") User user, BindingResult br) throws IOException {
		
		// validate fields
		if(br.hasErrors()) {
			ModelAndView mav1 = new ModelAndView("register");
			mav1.addObject("user", user);
			return mav1;
		}
		
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", user);
		mav.addObject("displayMessage", "true");

		userService.createUser(user);

		return mav;	
	}
	
}
