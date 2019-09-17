package codeReview;
 
//변수 접근 예제
public class InnerTest {
	//퍼블릭 변수 
    public int a = 1;
    public int b = 2;
    
    public void outerMethod(final int c) {
    	// 필드 생성
        int d = 3;
        // 확인	
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
		// System.out.println(d);
        // -> 다 출력됨. 퍼블릭 변수는 제한 없이 접근 가능하며 자신의 필드도 접근이 가능하다.
		
        class Inner {
            void innerMethod(int e) {
            /* 접근 가능한 변수들? */
			// System.out.println(a);
			// System.out.println(b);
			// System.out.println(c);
			// System.out.println(d);
			// System.out.println(e);
            // 자기 자신의 필드 , 매개변수는 접근 가능. 위에서 출력된 a b c d 접근 가능하며 e 까지해서 
            // a, b, c, d, e 가 접근이 가능하다.
            }
            
           
        }
        
    }
    
    public static void main(String[] args) {
    	InnerTest i = new InnerTest();
//    	i.outerMethod(4);    	
		
	}
}