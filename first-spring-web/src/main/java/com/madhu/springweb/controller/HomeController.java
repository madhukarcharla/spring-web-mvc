package com.madhu.springweb.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.madhu.springweb.model.User;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView homePage(HttpServletResponse response) throws IOException{
		
		
		 ModelAndView mav = new ModelAndView("home");
		 mav.addObject("user", new User());
		 return mav;
		    
	}
	
	@RequestMapping(value="/RegisterOrLogIn", params = "register", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletResponse response, @ModelAttribute("user") User user) throws IOException{
		 ModelAndView mav = new ModelAndView("register");
		 mav.addObject("user", user);
		 return mav;
	}
		 
	@RequestMapping(value="/RegisterOrLogIn", params = "login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletResponse response, @ModelAttribute("user") User user) throws IOException{
	ModelAndView mav = new ModelAndView("login");
	mav.addObject("user", user);
	return mav;
	}

		    
	
}
