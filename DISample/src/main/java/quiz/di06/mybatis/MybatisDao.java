package quiz.di06.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test.vo.MboardVo;

public class MybatisDao {
	private SqlSession sqlSession;
	private final String NAMESPACE = "test.mybatis.MboardMapper";
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(MboardVo vo) {
		return sqlSession.insert(NAMESPACE + ".insert", vo);
	}
	
	public int update(MboardVo vo) {
		return sqlSession.update(NAMESPACE + ".update", vo);
	}
	
	public int delete(int num) {
		return sqlSession.delete(NAMESPACE + ".delete", num);
	}
	
	public MboardVo select(int num) {
		return sqlSession.selectOne(NAMESPACE + ".select", num);
	}
	
	public List<MboardVo> selectAll() {
		return sqlSession.selectList(NAMESPACE + ".selectAll");
	}
	
	

}
