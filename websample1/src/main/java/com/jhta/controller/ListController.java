package com.jhta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jhta.service.MembersService;

@Controller
public class ListController {
	@Autowired
	private MembersService service;

	@GetMapping("/members/list")
	public String list(HttpServletRequest request, Model model) {
		model.addAttribute("list", service.selectAll());
		return "members/list";

	}
}
