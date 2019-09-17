package codeReview;

// 변수 타입 예제 
public class ReferenceTest {
	
    public static void main(String[] args) {
    	//객체 생성
        ReferenceTest t = new ReferenceTest();
        
        int a = 20;        
        int  b[] = {100, 200, 300};	
       
        //b는 참조 타입 변수 이므로 주소값이 전달 됨.
        t.change(a,b);
       
        t.display(a,b);
        
    }
    
    //매개변수 a에 10을 더한값을 값을 a에 저장
    //매개변수 2개: 기본타입의 정수형 변수 a 와 참조타입의 정수형 배열 변수 b
    void change(int a, int b[]) {    	   
    	
    	//a에 10 더한값을 a에 저장
        a += 10; 		// this가 없어 ReferenceTest의 a의 값에는 변화가 없다.
        
        //b[1]에 10 더한값을 b[1]에 저장
        b[1] += 10; 	// 참조타입 즉 주소를 통해 받으므로 ReferenceTest의 b도 영향을 받게 된다.
    }
    
    //출력하는 메소드
    void display(int a, int b[]) {
    	//a를 b로 나눈다 라는 식을 출력.
        System.out.println(a + "/" + b[1]);        
    }
}