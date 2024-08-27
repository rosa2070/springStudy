package test.di06.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test.vo.MembersVo;

//스프링에서는 SqlSession 라이프사이클(생성/종료)과 트랜잭션 처리를 스프링이 처리한다.
public class MybatisDao {
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
	
	public MembersVo select(int num) {
		return sqlSession.selectOne(NAMESPACE + ".select", num);
	}
	
	public List<MembersVo>  selectAll() {
		return sqlSession.selectList(NAMESPACE + ".selectAll");
	}

}
