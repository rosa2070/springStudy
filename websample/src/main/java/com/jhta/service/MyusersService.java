package com.jhta.service;

import java.util.List;

import com.jhta.dao.MyusersDao;

import test.vo.MyusersVo;

public class MyusersService {
	private MyusersDao myusersDao;
	public MyusersService(MyusersDao dao) {
		this.myusersDao = dao;
	}
	public int insert(MyusersVo vo) {
		return myusersDao.insert(vo);
	}
	public int update(MyusersVo vo) {
		return myusersDao.update(vo);
	}
	public int delete(String username) {
		return myusersDao.delete(username);
	}
	public MyusersVo select(String username) {
		return myusersDao.selectOne(username);
	}
	public List<MyusersVo> selectAll() {
		return myusersDao.selectList();
	}

}
