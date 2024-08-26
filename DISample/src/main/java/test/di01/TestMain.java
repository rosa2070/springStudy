package test.di01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		//스프링이 di01.xml에 설정된 bean객체들을 생성해 줌
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/di01/di01.xml");
		//스프링이 생성해준 Bean객체 꺼내오기
		Person p = (Person) ac.getBean("person");
		System.out.println("이름:" + p.getName());
		System.out.println("나이:" + p.getAge());

		MembersController controller = (MembersController) ac.getBean("membersController");
		System.out.println("controller:" + controller.hashCode());
		controller.service();
		
		//스프링에서는 객체를 싱글톤객체로 만들어줌
		MembersController controller1 = (MembersController) ac.getBean("membersController");
		System.out.println("controller1:" + controller.hashCode());
		controller.service();
		System.out.println("----------------------------------------------");
		
		MembersController controller2 = (MembersController) ac.getBean("controller");
		controller2.service();
		
		
		
	}

}
