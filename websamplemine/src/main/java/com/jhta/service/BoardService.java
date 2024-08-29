package com.jhta.service;

import org.springframework.beans.factory.annotation.Autowired;

import test.mybatis.BoardMapper;
import test.vo.BoardVo;

public class BoardService {
	@Autowired private BoardMapper mapper;
	public int insert(BoardVo vo) {
		return mapper.insert(vo);
	}
	

}
