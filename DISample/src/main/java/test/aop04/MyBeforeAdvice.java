package test.aop04;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//MethodBeforeAdvice 인터페이스를 상속받으면 메소드실행전에 동작되는 어드바이스가 됨
public class MyBeforeAdvice implements MethodBeforeAdvice {
	
	//메소드 실행전에 전달되는 파라미터 값 출력하기
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("[" + method.getName() + "]메소드 호출"); // 호출되는 메소드 이름 출력하기
		System.out.println("메소드로 전달된 파라미터-->");
		for(Object a : args) {
			System.out.println(a + " ");
		}
		System.out.println();
	}
	

}
