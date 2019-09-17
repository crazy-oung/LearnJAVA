package codeReview;

public class ExceptionTest {
	
	//결과를 저장할 문자열 변수 선언 초시화
    static String result = "1";
    
    public static void main(String[] args) {
        method(0);
        System.out.println(result);
    }
    
    public static void method(int x) {
        try {	// 오류 발생시 발생된 오류에 따라 catch 문으로 이동.
        	
        	// x를 x로 나눈 값을 x에 저장
            x /= x;
            
        } catch(ArithmeticException e) { // ArithmeticException == 산술오류(0으로 나눴을경우)
        	
            result += "2"; // result에 문자열 2를 뒤에 붙여 저장 .. => result = "12"
            
        } catch(Exception e) { // 위에 정의 되지 않은 예외발생 시
        	
            result += "3"; // 예외 발생x result = "12"
            
        } finally {	// 트라이-캐치 절 실행시 무조건 마지막에 실행되는 파이널리절.
        	
            result += "4"; // result = "124"
        }
        
        // 최종적으로 5추가.
        result += "5"; // result = "1245"
    }
}