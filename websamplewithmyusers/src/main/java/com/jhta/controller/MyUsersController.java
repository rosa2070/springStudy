package com.jhta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jhta.service.MyUsersService;

import test.vo.MyUsers;

@Controller
public class MyUsersController {
	@Autowired private MyUsersService service;
	
	@GetMapping("/myusers/insert")
	public String insertForm() {
		return "myusers/insert";
	}
	
	@PostMapping("/myusers/insert")
	public ModelAndView insert(MyUsers users) {
		String code = "success";
		try {
			service.insert(users);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			code="error";
		}
		ModelAndView mv = new ModelAndView("members/result");
		mv.addObject("code", code);
		return mv;
	}
	

}
