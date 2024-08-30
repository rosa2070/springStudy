package com.jhta.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jhta.board.service.BoardService;

@Controller
public class DetailController {
	@Autowired BoardService service;
	
	@GetMapping("/board/detail")
	public String detail(int num, Model model) {
		model.addAttribute("vo", service.detail(num));
		model.addAttribute("prev", service.prev(num));
		model.addAttribute("next", service.next(num));
		return "board/detail";
	}
}
