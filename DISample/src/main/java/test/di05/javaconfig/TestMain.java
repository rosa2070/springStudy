package test.di05.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// 자바설정파일에서 스프링빈 객체 만들기
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		//메소드이름이 스프링빈객체의 name이 된다.
		Person pp = (Person) ac.getBean("person");
		System.out.println(pp.getName() + "," + pp.getAge());
		MembersDao dao = (MembersDao)ac.getBean("memDao");
		dao.select("홍길동");
		MembersController controller = (MembersController) ac.getBean("controller");
		controller.service();
	}

}
