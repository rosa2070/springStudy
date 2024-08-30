package data.mybatis.mapper;

import java.util.HashMap;
import java.util.List;

import com.jhta.board.dto.BoardDto;

public interface BoardMapper {
	int insert(BoardDto dto);
	int count(HashMap<String, Object> map);
	List<BoardDto> list(HashMap<String, Object> map);
	int addHit(int num);
	BoardDto detail(int num);
	BoardDto prev(int num);
	BoardDto next(int num);

}
