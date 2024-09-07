package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/welcome")
	public ModelAndView mvcdemo() {
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("springdemo");
		return mvc;
		
	}

}
