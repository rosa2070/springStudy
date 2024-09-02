package test.aop06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.aop03.UserDao;
import test.aop03.UserDaoImpl;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/aop06/aop6.xml");
		UserDao dao = (UserDao) ac.getBean("dao");
		dao.insert("홍길동1");
		dao.update("홍길동2");
		dao.delete("홍길동3");
		dao.select("홍길동4");
	}

}
