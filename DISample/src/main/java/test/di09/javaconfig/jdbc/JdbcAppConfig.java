package test.di09.javaconfig.jdbc;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcAppConfig {
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("c##java");
		ds.setPassword("c##java");
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() throws Exception {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}
	
	@Bean(name="dao")
	public JdbcDao jdbcDao() throws Exception {
		JdbcDao jdbcDao = new JdbcDao(jdbcTemplate());
		return jdbcDao;		
	}
	
	
	

}
