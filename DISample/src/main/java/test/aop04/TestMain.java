package test.aop04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.aop01.MembersDao;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/aop04/aop04.xml");
		MembersDao dao = (MembersDao) ac.getBean("dao");
		dao.insert("홍길동1");
		dao.update("홍길동2");
		dao.delete("홍길동3");
		dao.select("홍길동4");
	}

}
