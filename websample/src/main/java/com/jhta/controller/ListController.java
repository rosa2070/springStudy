package com.jhta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jhta.service.MembersService;

@Controller
public class ListController {
	@Autowired
	private MembersService service;
	
	@GetMapping("/members/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView("members/list");
		mv.addObject("list", service.selectAll());
		return mv;
		
		
	}
}
