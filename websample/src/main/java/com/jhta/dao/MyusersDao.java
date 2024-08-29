package com.jhta.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test.vo.MyusersVo;

public class MyusersDao {
	private SqlSession sqlSession;
	private final String NAMESPACE = "test.mybatis.MyusersMapper";
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public int insert(MyusersVo vo) {
		return sqlSession.insert(NAMESPACE + ".insert", vo);
	}
	public int update(MyusersVo vo) {
		return sqlSession.update(NAMESPACE + ".update", vo);
	}
	public int delete(String username) {
		return sqlSession.delete(NAMESPACE + ".delete", username);
	}
	public MyusersVo selectOne(String username) {
		return sqlSession.selectOne(NAMESPACE + ".select", username);
	}
	public List<MyusersVo> selectList() {
		return sqlSession.selectList(NAMESPACE + ".selectAll");
	}
	

}
