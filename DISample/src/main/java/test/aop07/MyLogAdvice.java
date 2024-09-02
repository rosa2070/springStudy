package test.aop07;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class MyLogAdvice {
	// 포인트컷 메소드 - 리턴형이 void여야 하며 어노테이션으로 포인트컷을 설정한다.
	@Pointcut("execution(* test.aop01..*(..))")
	public void pointCut() {}
	
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		////////////////// 메소드 실행전에 수행할 작업 /////////////////////////////
		Object[] args = joinPoint.getArgs();//전달된 파라미터
		String methodName = joinPoint.getSignature().getName();//호출된 메소드이름
		
		System.out.println(methodName + "<< 메소드로 전달된 파라미터값들 >>");
		for(int i=0; i<args.length; i++) {
			System.out.println(i + ":" + args[i]);
		}
		
		/////////////////////////////////////////////////////////////////////		
		Object result = joinPoint.proceed(); //수행할 메소드 호출
		////////////////// 메소드 실행후에 수행할 작업 /////////////////////////////
		System.out.println(methodName + "메소드 실행 후 리턴된 값:" + result);
		
		/////////////////////////////////////////////////////////////////////	
		return result;
	}
	

}
