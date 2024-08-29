package com.jhta.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.dao.MyUsersDao;

import test.vo.MyUsers;

@Service
public class MyUsersService {
	@Autowired private MyUsersDao dao;
	public void setDao(MyUsersDao dao) {
		this.dao = dao;
	}
	public int insert(MyUsers users) {
		return dao.insert(users);
	}
	public boolean isMember(HashMap<String, String> map) {
		MyUsers users = dao.isMember(map);
		if (users==null) {
			return false;
		} else {
			return true;
		}
	}

}
