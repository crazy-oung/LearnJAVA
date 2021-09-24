package week2.assignments.report;

public class Ex1csetest {
	
}


/**
 * 1장 연습문제 
 * “csetest.java”라는 파일에 다음이 같은 내용이 들어있다. 
 * 이 코드에서 문법 오류가 있는 부분과 문법 오류는 아니지만 잘못된 부분을 모두 찾고, 오류가 없이 실행할 수 있도록 수정하시오.
 * - 아래는 연습문제에서 주어진 예시 코드
 */


// 파일명은 csetest.java

public class CSE {
	private String title;

	public void setTitle(String _title) {
		title = _title;
	}

	public String getTitle() {
		return title;
	}
}

public class CSETest {
	public static void main() {

		CSE cse = new CSE();
		System.out.println(cse.getTitle());
	}
}
