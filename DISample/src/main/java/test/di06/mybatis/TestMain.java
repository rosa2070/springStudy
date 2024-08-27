package test.di06.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.vo.MembersVo;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/di06/mybatis/di06.xml");
		MybatisDao dao = (MybatisDao) ac.getBean("dao");
//		int n = dao.insert(new MembersVo(20, "김자바", "010", "서울", null));
//		System.out.println(n + "명의 회원등록");
		int n = dao.update(new MembersVo(3, "kimjava", "010", "seaul", null));
		int n1 = dao.delete(7);
		System.out.println(n1+"명 회원삭제");
		dao.selectAll().stream().forEach(mem-> System.out.println(mem));
		
		
		
	}

}
