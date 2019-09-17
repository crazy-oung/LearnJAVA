package codeReview;

import java.io.*;

public class IOTest {
	public final static String FILENAME="test.txt";
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		try{			
			//FileInputStream객체 생성 . FILENAME과 같은 파일의 데이터를 불러와 저장한다.
			fis = new FileInputStream(FILENAME);
			// fis에 데이터가 읽혀질 때 까지만 출력.
//			do {
//				// 문자단위로 출력. 다음글자를 읽어옴.
//				System.out.println((char)fis.read());
//			}while(fis.read() != -1);  다음 글자 읽음. 여기서 문제 발생!!! 한 글자를 건너뛰게 된다. 이이를 고치려면
			
			int tmp = 0;
			while((tmp=fis.read()) != -1) {
				System.out.println((char)tmp);
			}	// 이 렇게 써야 한다.
			
		}catch(Exception e) {
			//FileNotFoundException 발생시 출력
			System.out.println("Exception 발생");
		} finally {
			try {
				//FileInputStream을 닫아준다. 메모리 할당 해제.
				fis.close();
			}catch (Exception e) {
				//FileInputStream 을 닫는데에 예외 발생시 출력
				System.out.println("file.close 예외발생");
			}
		}
	}

}
