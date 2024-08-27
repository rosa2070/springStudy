package test.di03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value="controller")
public class BoardController {
	@Autowired
	private Board board;
	
	public BoardController(Board board) {
		this.board = board;
	}
	
	public void service() {
		board.insert("테스트");
		board.delete("테스트");
		board.update("테스트");
		board.select("테스트");
	}
}
