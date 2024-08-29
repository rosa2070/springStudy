package com.jhta.controller;

import java.net.http.HttpRequest;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jhta.service.MembersService;
import com.jhta.service.MyUsersService;

@Controller
public class LoginController {
		@Autowired private MyUsersService service;

		@GetMapping("/login")
		public String loginForm() {
			return "myusers/login";
		}
		@PostMapping("/login")
		public String login(String username, String password, HttpServletRequest request, Model model) {
			HashMap<String, String> map = new HashMap<>();
			map.put("username", username);
			map.put("password", password);
			boolean result = service.isMember(map);
			if (result) { //회원인 경우(아이디와 비밀번호가 일치하는 경우) -> 세션에 값 저장 후 home으로 이동
				HttpSession session = request.getSession(); // 세션 객체 얻어오기(세션이 없으면 새롭게 생성해줌)
				session.setAttribute("username", username); // 세션에 사용자 아이디 저장하기
				return "redirect:/";
			} else {
				model.addAttribute("errMsg", "아이디 또는 비밀번호가 맞지 않아요");
				return "myusers/login";//아이디 또는 비밀번호가 일치하지 않는 경우 -> 로그인페이지로 다시 이동 (그냥 쓰는 건 forward 방식)
			}
		}
		
		@GetMapping("/logout")
		public String logout(HttpServletRequest request) {
			HttpSession session = request.getSession(false);//새로운 세션은 만들지 못하도록
			if (session != null) {
				session.invalidate(); // 세션영역 무효화
			}
			return "redirect:/";
		}
}
