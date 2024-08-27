package test.di02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/di02/di02.xml");
		
		MemberController mc = (MemberController) ac.getBean("controller");
		mc.service();
		
	}

}
