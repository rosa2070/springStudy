package com.jhta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.dao.MembersDao;

import test.vo.MembersVo;

@Service
public class MembersService {
	@Autowired private MembersDao dao;
	public MembersService(MembersDao dao) {
		this.dao = dao;
	}
	public int insert(MembersVo vo) {
		return dao.insert(vo);
	}
	
	public int update(MembersVo vo) {
		return dao.update(vo);
	}
	public int delete(int num) {
		return dao.delete(num);
	}
	public MembersVo select(int num) {
		return dao.selectOne(num);
	}
	public List<MembersVo> selectAll() {
		return dao.selectList();
	}

}
