package com.jhta.board.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jhta.board.dto.BoardDto;
import com.jhta.board.service.BoardService;
import com.jhta.board.util.PageUtil;

@Controller
public class ListController {
	@Autowired private BoardService service;
	
	@RequestMapping("/board/list")
	public String list(@RequestParam(value="pageNum", defaultValue = "1") int pageNum,
						String field, String keyword, Model model) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("field", field);
		map.put("keyword", keyword);
		
		int totalRowCount = service.count(map);
		PageUtil pu = new PageUtil(pageNum, 5, 10, totalRowCount);
		int startRow = pu.getStartRow();//시작행 번호
		int endRow = pu.getEndRow(); //끝행 번호
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		List<BoardDto> list = service.list(map);
		model.addAttribute("field", field);
		model.addAttribute("keyword", keyword);
		model.addAttribute("list", list);
		model.addAttribute("pu", pu);
		
//		System.out.println(pu.getStartPageNum());
//		System.out.println(pu.getEndPageNum());
//		System.out.println(pageNum);
//		System.out.println(totalRowCount);
//		System.out.println(pu.getTotalPageCount());
		return "board/list";
		
		
		
		
	}

}
