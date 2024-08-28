package com.jhta.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test.vo.MembersVo;

public class MembersDao {
	private SqlSession sqlSession;
	private final String NAMESPACE="test.mybatis.MembersMapper";
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public int insert(MembersVo vo) {
		return sqlSession.insert(NAMESPACE + ".insert", vo);
	}
	public int update(MembersVo vo) {
		return sqlSession.update(NAMESPACE + ".update", vo);
	}
	public int delete(int num) {
		return sqlSession.delete(NAMESPACE + ".delete", num);
	}
	public MembersVo selectOne(int num) {
		return sqlSession.selectOne(NAMESPACE + ".select", num);
	}
	public List<MembersVo> selectList() {
		return sqlSession.selectList(NAMESPACE + ".selectAll");
	}
}
