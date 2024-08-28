package quiz.di07.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import test.vo.MboardVo;

public class JdbcDao {
	private JdbcTemplate jdbcTemplate;
	
	public JdbcDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(MboardVo vo) {
		String sql = "insert into mboard values (mboard_seq.nextval, ?, ?, ?, sysdate)";
		int n = jdbcTemplate.update(sql, vo.getWriter(), vo.getTitle(), vo.getContent());
		return n;
	}
	
	public int delete(int num) {
		String sql = "delete from mboard where num=?";
		int n = jdbcTemplate.update(sql, num);
		return n;
	}
	
	public int update(MboardVo vo) {
		String sql = "update mboard set writer=?, title=?, content=? where num=?";
		int n = jdbcTemplate.update(sql, vo.getWriter(), vo.getTitle(), vo.getContent(), vo.getNum());
		return n;
	}
	
	public List<MboardVo> selectAll() {
		RowMapper<MboardVo> rowMapper = new RowMapper<MboardVo>() {
			
			@Override
			public MboardVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				MboardVo vo = new MboardVo();
				vo.setNum(rs.getInt("num"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setRegdate(rs.getDate("regdate"));
				return vo;
			}
		};
		List<MboardVo> list = jdbcTemplate.query("select * from mboard", rowMapper);
		return list;
	}
	
	public MboardVo select(int num) {
		String sql = "select * from mboard where num=?";
		RowMapper<MboardVo> rowMapper = new RowMapper<MboardVo>() {
			
			@Override
			public MboardVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				MboardVo vo = new MboardVo();
				vo.setNum(rs.getInt("num"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setRegdate(rs.getDate("regdate"));
				return vo;
			}
		};
		return jdbcTemplate.queryForObject(sql, rowMapper, num);
	}

}
