package test.di07.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import test.vo.MembersVo;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/di07/jdbc/di07.xml");
		JdbcDao dao = (JdbcDao) ac.getBean("dao");
//		int n = dao.insert(new MembersVo(20, "김자바", "010", "서울", null));
//		System.out.println(n + "명의 회원등록");
//		int n = dao.insert(new MembersVo(17, "kdkd", "010", "seoul", null));
//		int n1 = dao.delete(7);
//		System.out.println(n+"명 회원등록");
//		dao.selectAll().stream().forEach(mem-> System.out.println(mem));
		
		try {
			MembersVo vo = dao.select(200);
			System.out.println("검색된 회원:" + vo);
		} catch (EmptyResultDataAccessException e) {
			System.out.println(e.getMessage());
			System.out.println("검색된 회원이 없어요...");
		}
		
	}

}
