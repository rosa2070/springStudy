package com.jhta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jhta.service.MembersService;

import test.vo.MembersVo;

@Controller
public class UpdateController {
	@Autowired
	private MembersService service;
	
	@GetMapping("/members/update")
	public ModelAndView updateForm(int num) {
		ModelAndView mv = new ModelAndView("members/update");
		mv.addObject("member", service.select(num));
		return mv;
	}
	
	@PostMapping("/members/update")
	public ModelAndView update(MembersVo vo) {
		System.out.println("vo:" + vo);
		String code = "success";
		try {
			service.update(vo);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			code = "error";
		}
		
		ModelAndView mv = new ModelAndView("members/result");
		mv.addObject("code", code);
		return mv;
		
	}
}
