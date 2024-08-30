package com.jhta.board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.board.dto.BoardDto;

import data.mybatis.mapper.BoardMapper;

@Service
public class BoardService {
	@Autowired
	private BoardMapper mapper;
	
	public int insert(BoardDto dto) {
		return mapper.insert(dto);
	}
	
	public List<BoardDto> list(HashMap<String, Object> map) {
		return mapper.list(map);
	}
	
	public int count(HashMap<String, Object> map) {
		return mapper.count(map);
	}
	
	public int addHit(int num) {
		return mapper.addHit(num);
	}
	public BoardDto detail(int num) {
		return mapper.detail(num);
	}
	public BoardDto prev(int num) {
		return mapper.prev(num);
	}
	
	public BoardDto next(int num) {
		return mapper.next(num);
	}
}
