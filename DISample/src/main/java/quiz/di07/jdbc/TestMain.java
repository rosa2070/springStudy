package quiz.di07.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import test.vo.MboardVo;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("quiz/di07/jdbc/di07.xml");
		JdbcDao dao = (JdbcDao) ac.getBean("dao");
//		int n = dao.insert(new MboardVo(0, "kkk", "hohoh", "heye", null));
//		System.out.println(n + "개의 게시물 등록");
//		int n = dao.delete(82);
		dao.selectAll().stream().forEach(board -> System.out.println(board));
		
		int n = dao.update(new MboardVo(83, "hohoho", "dmmm", "hehhe", null));
		try {
			MboardVo vo = dao.select(63);
			System.out.println("검색된 게시물: " + vo);
		} catch (EmptyResultDataAccessException e) {
			System.out.println(e.getMessage());
			System.out.println("검색된 게시물이 없어요...");
		}
	}

}
