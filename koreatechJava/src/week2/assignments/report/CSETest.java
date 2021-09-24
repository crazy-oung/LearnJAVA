package week2.assignments.report;

/**
 * 1장 연습문제 
 * “csetest.java”라는 파일에 다음이 같은 내용이 들어있다. 
 * 이 코드에서 문법 오류가 있는 부분과 문법 오류는 아니지만 잘못된 부분을 모두 찾고, 오류가 없이 실행할 수 있도록 수정하시오.
 *
 */


// 연습 문제 예시 코드
//public class CSE {
//	private String title;
//
//	public void setTitle(String _title) {
//		title = _title;
//	}
//
//	public void getTitle() {
//		return title;
//	}
//}
//
//public class CSETest {
//	public void main() {
//
//		CSE cse = new CSE();
//		System.out.println(cse.getTitle());
//	}
//}


/**
 * 하나의 자바 파일에서는 하나의 public class만 존재 할 수 있으므로 
 * public class CSE 에서 class CSE으로 수정한다.
 * @author dayounghan
 *
 */
class CSE {
	
	private String title;

	public void setTitle(String title) {

		// 주어진 코드에서는 받는 문자열 인자의 변수명으로 _title을 사용 하였는데 
		// 자바에서는 _을 사용하여 변수명을 짓지않으므로 title로 변경하고
		// this 키워드를 사용해 같은 클래스 내의 멤버변수에 접근 할 수 있다.
		this.title = title;
	}

	// 맴버변수 title는 문자열 String 타입인데 title getter에서는 
	// 반환 타입이 void로 명시 되어 있지 않다.
	// 이렇게 명시 하면 반환 타입이 맞지 않아 오류가 발생하므로 
	// 반환 타입을 String으로 변경하여 title 을 반환해주도록 한다.
	public String getTitle() {
		return title;
	}
}


/**
 * 파일명은 csetest인데 public class 이름이 CSETest으로 불일치 한다. 이것은 오류이다.
 * 따라서 파일명을 CSETest 로 바꾸거나 csetest로 클래스 명을 바꾸어야 하는데 
 * 보통 자바에서는 클래스 명은 파스칼 표기법을 사용하므로 
 * 파일명을 CSETest로 바꾸는 것이 좋다.
 * 
 * @author dayounghan
 *
 */
public class CSETest {
	
	/**
	 * 메인 메소드는 반드시 public, static 수식어를 붙여 주어야 한다. 
	 * - JVM은 private 메소드를 실행할 수 없으므로 
	 * 	 메인메소드를 바로 실행하기 위해서는 public 수식어가 필요하다. 
	 * - 또한 반드시 String 배열 타입의 매개변수를 하나 가져 프로그램을 실행할 때 
	 *   프로그램 인자를 받을 수 있게 하여야 한다.
	 * @param args
	 */
	public static void main(String[] args) {
		CSE cse = new CSE();
		
		// 객체선언 후 바로 getTitle 을 사용해도 오류는 발생하지 않지만 
		// 원하는 결과가 타이틀을 출력하는 것이라면 원하는 결과를 얻을 수 없다.
		// 객체 내의 title setter인 setTitle 메소드를 이용해 title을 원하는 값으로 초기화한 후 
		// getTitle 메소드를 이용해야 원하는 타이틀 값을 출력할 수 있다.
		cse.setTitle("CSE");
		System.out.println(cse.getTitle());
	}
}

