package codeReview;

public class IfForTest {
	
	//사용할 배열 생성
	static int[] arNum = {7,9,1,4,5};
	
	public static void main(String[] args) {
		// for문에 쓸 변수 선언
		int out, in;
		//객체 생성
		IfForTest t = new IfForTest();
		
		for(out=arNum.length-1;out>0;out--) {
			for(in=0;in<out;in++) {
				if(arNum[in] > arNum[in+1]) {
					// 스왑(앞뒤 바꾸기)
					t.swap(in, in+1);
				}
			}
			
		}
		// 결과 출력
		t.display();		
	}
	
	//0번과 1번의 값을 바꾸어 주는 메소드
	//매개변수 두개 정수형. 보이드 리턴타입
	void swap(int one, int two) {
		// 임시 변수에 one번 의 데이터를 저장해놓음
		int temp=arNum[one];
		// one번에 two번의 데이터를 저장
		arNum[one] = arNum[two];
		// 잠시 저장해놓았던 값 가져와서 다시 저장.
		arNum[two] = temp;
		
		// swap 완료 .,!
	}
	
	// 결과를 보여주는 메소드
	void display() {
		for(int index=0;index<arNum.length;index++){
			System.out.println(arNum[index]);
		}
	}
	
}
