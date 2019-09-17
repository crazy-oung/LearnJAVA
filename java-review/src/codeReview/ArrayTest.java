package codeReview;

// 다차원 배열 예제 
public interface ArrayTest {
	public static void main(String[] args) {
		//2차원 배열 생성 
		int ar[][] = new int[3][];
		int value = 0;
		
		// 0번에 
		ar[0] = new int[2];	// 0번 줄은 두개
		ar[1] = new int[3];	// 1번 줄은 3개
		ar[2] = new int[4];	// 2번 줄은 4개
		
		//모양:
		// [0]: 00	
		// [1]: 000
		// [2]: 0000
		
		for (int out = 0; out < ar.length; out++) {
			for (int in = 0; in < ar[out].length; in++) {
				ar[out][in] = ++value;	// (0,0) = 1; (0,1) = 2 ...
			}
		}
		
		try {
			// 출력
			for (int out = 0; out < ar.length; out++) {
				for (int in = 0; in < ar[out].length; in++) {
					System.out.println(ar[out][in]); 
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {	// 배열 크기 탈출시 배열 크기 예외 발생 하므로 잡아서 넘겨줌
			System.out.println("ArrayIndexOutOfBoundsException Occured!");
		}
	}
}
