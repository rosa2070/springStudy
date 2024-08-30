package com.jhta.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhta.board.dto.BoardDto;
import com.jhta.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class InsertController {
	@Autowired private BoardService service;
	
	@GetMapping("/insert")
	public String insertForm() {
		return "board/insert";
	}
	
	@PostMapping("/insert")
	public String insert(BoardDto dto, Model model) {
		try {
			service.insert(dto);
			model.addAttribute("code", "success");
			return "board/result";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			model.addAttribute("code", "error");
			return "board/result";
		}
	}
}
