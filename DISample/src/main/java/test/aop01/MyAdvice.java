package test.aop01;

// 공통관심사항 - 어드바이스
public class MyAdvice {
    public void test1(){
        System.out.println("메소드 실행전에 동작됩니다.");
        
    }
    
    public void test2(){
        System.out.println("메소드 실행후에 동작됩니다.");
    }
}