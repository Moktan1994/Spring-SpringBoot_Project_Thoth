package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hellomvc() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("NewFile");
		return mv;
	}

}
