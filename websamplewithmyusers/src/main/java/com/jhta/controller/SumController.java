package com.jhta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SumController {
	@PostMapping("/math/sum")
	public ModelAndView sum(int num1, int num2) {
		int num3 = num1 + num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("showResult");
		mv.addObject("num3", num3);
		return mv;
	}
}
