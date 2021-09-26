/**
 * 
 */
package week3.assignments.code;

import java.util.Scanner;

/**
 * @author dayounghan
 *
 */
public class Game {
	
	/**
	 * 게임을 시작하는 메소드
	 */
	public static void playGame() {

		Ball ball = new Ball();
		Bat bat = new Bat();

		int result;
		int out = 0;

		ball.pitch();

		while (true) {
			
			bat.setList();
			result = Game.compare(ball.getList(), bat.getList());

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
	 * 게임 중 각 입력 값을 비교해 결과를 수형으로 반환 
	 * - 사용자 승: 1, 컴퓨터 승: -1
	 * 
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
	 * 
	 * @return boolean 새게임 여부
	 */
	public static boolean done() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("새 게임(y/n)? ");
		
//		while (true) {
//			String s = sc.nextLine().strip().toLowerCase();
//			if (s.charAt(0) == 'y' || s.charAt(0) == 'n') {
//				return s.charAt(0) == 'n'; // 소문자로 변경 후 일치 하는지 확인 : 반환 값은 boolean 타입
//			}
//		}
		
		// 새게임 여부를 따져 참 거짓 값 반환 
		return (sc.nextLine().strip().toLowerCase().equals("y")); 
	}
	

}
