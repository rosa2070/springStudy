package test.di09.javaconfig.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JdbcAppConfig.class);
		JdbcDao dao = (JdbcDao) ac.getBean("dao");
		dao.selectAll().forEach(m -> System.out.println(m));
	}
}
