package test.di05.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
	
	@Bean //스프링이 관리하는 빈 객체 만들기
	public Person person() {
		Person p = new Person("홍길동", 20);
		return p;
	}
	
	@Bean(name="memDao")   //스프링빈 객체에 이름 부여 -> 없으면 메소드이름이 스프링빈객체의 이름이 된다.
	public MembersDao dao() {
		return new MembersDao();
	}
	
	@Bean
	public MembersController controller() {
		MembersController controller = new MembersController(dao());
		return controller;
	}

}
