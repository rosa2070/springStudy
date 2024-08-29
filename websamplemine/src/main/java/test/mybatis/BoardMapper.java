package test.mybatis;

import test.vo.BoardVo;

//BoardMapper.xml과 같은 이름의 패키지에 같은 이름의 인터페이스를 만든다.
public interface BoardMapper {
	//BoardMapper.xml 파일의 id 속성과 같은 이름으로 메소드를 만든다.
	int insert(BoardVo vo);
}
