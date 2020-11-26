package com.javatpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
	public ModelAndView displayWelcome() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Hello Spring Boot");
		mav.setViewName("index");
		return mav;
	}
}
