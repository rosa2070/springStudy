package test.aop07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.aop01.MembersDao;

//전달되는 파라미터와 리턴값을 출력하는 어드바이스를 어노테이션 기반으로 만들고 적용해 보세요.
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/aop07/aop7.xml");
		MembersDao dao = (MembersDao) ac.getBean("dao");
		dao.insert("홍길동1");
		dao.update("홍길동2");
		dao.delete("홍길동3");
		dao.select("홍길동4");
	}

}
