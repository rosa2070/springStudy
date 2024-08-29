package com.jhta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.dao.MembersDao;

import test.mybatis.MembersMapper;
import test.vo.MembersVo;

@Service
public class MembersService {
	@Autowired private MembersMapper mapper;
	public int insert(MembersVo vo) {
		return mapper.insert(vo);
	}
	
	public int update(MembersVo vo) {
		return mapper.update(vo);
	}
	public int delete(int num) {
		return mapper.delete(num);
	}
	public MembersVo select(int num) {
		return mapper.select(num);
	}
	public List<MembersVo> selectAll() {
		return mapper.selectAll();
	}

}
