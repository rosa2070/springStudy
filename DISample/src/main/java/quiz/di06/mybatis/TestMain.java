package quiz.di06.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.vo.MboardVo;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("quiz/di06/mybatis/di06.xml");
		MybatisDao dao = (MybatisDao) ac.getBean("dao");
//		int n = dao.insert(new MboardVo(0, "mmm", "ㅋㅋㅋㅋ", "Please attend the meeting tomorrow.", null));
//		System.out.println(n + "개의 게시물 등록");
		int n = dao.update(new MboardVo(62, "mama", "dhhsfd", "hey", null));
//		int n1 = dao.delete(61);
//		System.out.println(n1 + "개의 게시물 삭제");
		System.out.println("---------게시물 한개 조회------------");
		System.out.println(dao.select(81));
		System.out.println("---------모든 게시물 조회-------------");
		dao.selectAll().stream().forEach(board -> System.out.println(board));
	
		
		
	}

}
