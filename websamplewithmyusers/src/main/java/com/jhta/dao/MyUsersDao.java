package com.jhta.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import test.vo.MyUsers;

@Repository
public class MyUsersDao {
	@Autowired private SqlSession sqlSession;
	private final String NAMESPACE = "test.mybatis.MyUsersMapper";
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public int insert(MyUsers users) {
		return sqlSession.insert(NAMESPACE + ".insert", users);
	}
	public MyUsers isMember(HashMap<String, String> map) {
		return sqlSession.selectOne(NAMESPACE + ".isMember", map);
	}

}
