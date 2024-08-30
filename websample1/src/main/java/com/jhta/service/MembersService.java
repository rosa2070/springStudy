package com.jhta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import test.mybatis.MemberPointMapper;
import test.mybatis.MembersMapper;
import test.vo.MembersVo;
import test.vo.PointVo;

@Service
public class MembersService {
	@Autowired private MembersMapper mapper;
	@Autowired private MemberPointMapper pMapper;
	
	@Transactional //메소드에 트랜잭션 설정하기
	public int insert(MembersVo vo) {
		mapper.insert(vo);
		pMapper.insert(new PointVo(0, vo.getNum(), 100));
		return 1;
	}
	
	public int update(MembersVo vo) {
		return mapper.update(vo);
	}
	public int delete(int num) {
		return mapper.delete(num);
	}
	public MembersVo select(int num) {
		return mapper.select(num);
	}
	public List<MembersVo> selectAll() {
		return mapper.selectAll();
	}

}
