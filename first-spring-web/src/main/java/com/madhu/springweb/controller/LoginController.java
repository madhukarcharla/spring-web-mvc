package com.madhu.springweb.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.madhu.springweb.model.User;

@Controller
public class LoginController {

	@Autowired
	private LoginValidator loginValidator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(loginValidator);
	}

	@RequestMapping(value = "/loginProcess")
	public ModelAndView registerProcess(HttpServletResponse response, @Valid @ModelAttribute("user") User user, BindingResult bindingResult)
			throws IOException {

		if (bindingResult.hasErrors()) {
			ModelAndView mav = new ModelAndView("login");
			mav.addObject("user", user);
			return mav;
		}

		ModelAndView mav = new ModelAndView("dashboard");
		mav.addObject("user", user);
		return mav;

	}

}