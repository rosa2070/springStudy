package test.di04.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain4 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/di04/anno/di04.xml");	
		MembersController mc = (MembersController)ac.getBean("membersController");
		mc.service();
	}

}
