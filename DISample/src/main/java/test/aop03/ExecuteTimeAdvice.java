package test.aop03;

import org.aspectj.lang.ProceedingJoinPoint;

public class ExecuteTimeAdvice {
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
		
		// 메소드 실행 전 시간 기록
		long startTime = System.currentTimeMillis();
		
		//메소드(핵심로직) 실행
		Object result = joinPoint.proceed();
		
		// 메소드 실행 수 시간 기록
		long endTime = System.currentTimeMillis();
		
		//메소드 수행 시간 계산
		long executionTime = endTime - startTime;
		
		// 메소드 실행시간 출력
		System.out.println("메소드 실행 시간:" + executionTime/1000.0 + "초");
		
		//메소드의 반환값 반환
		return result;
	}

}
