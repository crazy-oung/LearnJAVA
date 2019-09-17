package codeReview;

public class OperatorTest {
	// private static 변수 선언 초기화.
    private static int result = 0;
    private static boolean flag = false;
    
    public static void main(String[] args) {
        setResult(10);
        display();
    }
    
    //flag의 값을 초기화 하는 메소드.
    // 정수형 매개변수 한개 , 리턴타입 void(없음)
    public static void setResult(int x) {
        flag = method1(x) || method2();
        // boolean || ==> 둘중 하나만 true여도 true
        // || 는 첫번째 피연산자가 조건에 맞다면 다음 피연산자를 검사하지않음
        // && 둘다 검사 단 첫 번째가 틀리면 다음 피연산자 검사 안함.
    }
    
    // 참 거짓을 판별 하는 메소드1: [ x가 0보다 크면 참 ]
    // 정수형 매개변수 한개 , 리턴타입 boolean(참/거짓)
    public static boolean method1(int x) {
    	// 반환 해줄 값 거짓으로 초기화
        boolean temp = false;
        // 조건 검사
        if(x > 0) { 
            result = x;
            temp = true;
        }        
        return temp; 	// result는 10이기 때문에 temp가 true로 리턴됨        
    }
    
    // 첫 피연산자가 참일 때 실행되는 참 거짓을 판별 하는 메소드2: 참일 때만 실행되므로 x는 0보다 작지 않는다. 곱을 해서 값을 저장한다.(0이 저장되지 않게 된다는 말이다)
    // 매개변수 없음 , 리턴타입 boolean(참/거짓)
    public static boolean method2() {
    	//result에 10을 곱한 값을 result에 저장
        result = result * 10;
        return true;	// method1(x)가 true로 리턴되서 검사 x
    }    
    
    // 출력해주는 메소드
    public static void display() {
    	//결과 출력
        System.out.print(result + " "); // 10
        //참겨짓 여부 출력
        System.out.println(flag); // true
    }
}