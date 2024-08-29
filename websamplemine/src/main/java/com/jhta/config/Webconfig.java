package com.jhta.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//web.xml을 대신하는 자바설정클래스
public class Webconfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	//applicationContext 기능 -> RootConfig
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	//appServlet-servlet.xml -> ServletConfig
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}

	//디스패쳐 서블릿 매핑경로 설정
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	//필터 등록(인코딩필터)
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("utf-8");
		filter.setForceEncoding(true);
		return new Filter[] {filter};
	}


}
