package test.di03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 
 *                                      Board - 인터페이스
 *                                        |
 * BoardController <--(생성자로주입)    BoardImplDao - 글등록/삭제/수정/조회
 * 
 * 컨트롤러를 메인메소드에서 사용해 보세요
 */
public class TestQuiz {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/di03/di03.xml");
		
		BoardController bc = (BoardController) ac.getBean("controller");
		bc.service();
	}
}
