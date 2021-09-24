
package week1.assignments.code;

import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

/*
============================================================================
Name        : Baseball.java
Author      : Dayoung Han
Version     : 한국기술교육대학교 컴퓨터공학부 자바프로그래밍
Copyright   : 2021년도 2학기 과제1
Description : 숫자 야구 게임
 - 주어진 C 소스를 자바로 바꾸세요.
 - 자바에서 main 메소드를 포함하는 클래스를 정의하고
 - 필요한 모든 메소드를 static 메소드로 정의하여 구현하시오.
============================================================================
*/


public class Baseball {
	
	/**
	 * @author dayounghan
	 * 
	 * 1장에서 배운 내용을 바탕으로 부족한 것은 인터넷, 교재 등을 참고하여 첨부된 C 소스를 자바로 바꾸세요. 이때 주석에
	 * 제시된 힌트를 적극 활용하세요. 또 객체지향으로 다시 설계하여 구현하는 것이 아니라 기계적으로 자바로 바꾸는 것입니다.
	 * 객체지향으로 설계하는 것은 3장 학습 후 과제로 다시 요구할 예정입니다. 주어진 C 소스에는 5개의 함수가 주어져 있습니다.
	 * 가장 간단하게는 자바 클래스를 하나 정의하고, 이 클래스에 C 소스에 있는 함수에 대응되는 자바 static 메소드를 5개
	 * 추가(main 포함)하면 됩니다.
	 * 
	 */
	
	static Scanner sc = new Scanner(System.in);

	/**
	 * 메인 실행부
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		do {
			playGame();
		} while (!done());

	}
	
	/**
	 * 게임을 시작하는 메소드 
	 */
	public static void playGame() {

		// 자동으로 0으로 모두 초기화
		int[] bat = new int[3];
		int[] ball = new int[3];

		int result;
		int out = 0;

		pitch(ball);

		while (true) {
			System.out.print("[0-9]까지 숫자 3개를 입력하시오: ");
			
		
			bat[0] = sc.nextInt();
			bat[1] = sc.nextInt();
			bat[2] = sc.nextInt();

			result = compare(ball, bat);

			if (result == 1) {
				System.out.println("사용자 승");
				break;
			} else if (result == -1) {
				++out;
				System.out.println("OUT: " + out);

				if (out == 3) {
					System.out.println("컴퓨터 승");
					break;
				}
			} 

		}
	}
	
	
	/**
	 *  ball 배열에 랜덤으로 값을 할당하는 메소드
	 * @param ball
	 */
	public static void pitch(int ball[]) {
		int[] flag = new int[10];
	
		for (int i = 0; i < 3; i++) {
			while (true) {
				ThreadLocalRandom rand = ThreadLocalRandom.current();
				ball[i] = rand.nextInt(10);

				if (flag[ball[i]] == 0) {
					flag[ball[i]] = 1;
					break;
				}
			}
		}
	}
	

	/**
	 * 게임 중 각 입력 값을 비교해 결과를 수형으로 반환
	 * - 사용자 승: 1, 컴퓨터 승: -1 
	 * @param ball
	 * @param bat
	 * @return
	 */
	public static int compare(int[] ball, int[] bat) {

		int[] flag = new int[10];
		int scount = 0;
		int bcount = 0;

		
		// 값이 존재하는 플래그 배열을 1로 설정 
		for (int i = 0; i < 3; i++) {
			flag[ball[i]] = 1;
		}
		
		for (int i = 0; i < 3; i++) {
			if (ball[i] == bat[i]) {
				++scount;
			} else if (flag[bat[i]] == 1) {
				++bcount;
			}
			
		}

		if (scount == 3)
			return 1;
		else if (scount == 0 && bcount == 0)
			return -1;
		else {
			System.out.printf("S: %d, B: %d\n", scount, bcount);
			return 0;
		}

	}

	

	/**
	 * 게임 완료후 새게임을 할 건지 묻는 메소드 
	 * - 새게임 할 것인지 물은 후 
	 * - 문자를 입력 받아 처리 
	 * - y 가 아닌 다른 문자를 입력 할 시 n을 입력 받은 것으로 간주 
	 * @return
	 */
	public static boolean done() {
		System.out.print("새 게임(y/n)? ");
		// 버퍼 값 초기화 
		sc.nextLine();
		while (true) {
			String s = sc.nextLine().strip().toLowerCase();
			if (s.charAt(0) == 'y' || s.charAt(0) == 'n' ) {
				return s.charAt(0) == 'n'; // 소문자로 변경 후 일치 하는지 확인 : 반환 값은 boolean 타입 
			} 
		}
		// 새게임 여부를 묻는 다른 방식 
//		return (sc.nextLine().strip().toLowerCase().equals("y")); 
	}

}
