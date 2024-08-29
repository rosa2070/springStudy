package test.mybatis;

import java.util.List;

import test.vo.MembersVo;

//MembersMapper.xml과 같은 이름의 패키지에 같은 이름의 인터페이스를 만든다.
public interface MembersMapper {
	//MembersMapper.xml파일의 id속성과 같은 이름으로 메소드를 만든다.
	int insert(MembersVo vo);
	int update(MembersVo vo);
	int delete(int num);
	MembersVo select(int num);
	List<MembersVo> selectAll();
}
