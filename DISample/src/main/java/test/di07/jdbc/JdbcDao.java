package test.di07.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import test.vo.MembersVo;

public class JdbcDao {
	private JdbcTemplate jdbcTemplate;
	
	public JdbcDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(MembersVo vo) {
		String sql = "insert into members values (?, ?, ?, ?, sysdate)";
		int n = jdbcTemplate.update(sql, vo.getNum(), vo.getName(), vo.getPhone(), vo.getAddr());
		return n;
	}
	
	public int delete(int num) {
		String sql = "delete from members where num=?";
		int n = jdbcTemplate.update(sql, num);
		return n;
	}
	
	//update 메소드 만들기
	public int update(MembersVo vo) {
		String sql = "update members set name=?, phone=?, addr=? where num=?";
		int n = jdbcTemplate.update(sql, vo.getName(), vo.getPhone(), vo.getAddr(), vo.getNum());
		return n;
	}
	
	public List<MembersVo> selectAll() {
		RowMapper<MembersVo> rowMapper = new RowMapper<MembersVo>() {
			@Override
			public MembersVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				MembersVo vo = new MembersVo();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddr(rs.getString("addr"));
				vo.setRegdate(rs.getDate("regdate"));
				return vo;
			}
		};
		List<MembersVo> list = jdbcTemplate.query("select * from members", rowMapper);
		return list;
	}
	
	public MembersVo select(int num) {
		String sql = "select * from members where num=?";
		RowMapper<MembersVo> rowMapper = new RowMapper<MembersVo>() {
			@Override
			public MembersVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				MembersVo vo = new MembersVo();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddr(rs.getString("addr"));
				vo.setRegdate(rs.getDate("regdate"));
				return vo;
			}
		};
		return jdbcTemplate.queryForObject(sql, rowMapper, num);
	}
}
