package com.jhta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {
	
	@GetMapping("/fortune")
	public ModelAndView fortune(int day) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("showFortune"); //뷰이름 지정
		if(day==1) {
			mv.addObject("result", "오늘의 운세:동쪽으로 가면 귀인을 만나리~");
		} else if (day==2) {
			mv.addObject("result", "내일의 운세:서쪽으로 가면 귀인을 만나리~");
		}
		return mv;
	}
}
