package week2.assignments.report;

import java.util.Scanner;

// 2.
// −1이 입력될 때까지 정수를 입력받아 입력받은 정수의 합과 평균을 출력하는 프로그램을 작성하시오. 
// 이 프로그램을 작성할 때 주의할 점은 무엇인지 프로그램 주석에 제시하시오.

public class Ex2Solve {
	public static void main(String[] args) {

		// 스캐너 선언
		Scanner in = new Scanner(System.in);

		// 마지막에 -1을 입력하면 -1을 더한 값까지 연산 하여 sum값이 유지 되므로
		// 초기값을 1로 설정하며 마지막 턴에서 -1이 누적 되지 않도록 한다.
		// 합계를 저장할 변수 sum
		int sum = 1;

		// 마지막 턴에서 -1 을 입력해 종료 하면 turn 도 같이 ++되므로 이를 방지 하기 위헤 -1을 입력한 턴은 미리
		// 제외해 둔 후 시작할 수 있도록 초기값을 -1로 설정한다.
		// 몇번 반복적으로 입력을 받았는지 셀 변수 turn
		int turn = -1;

		// 입력한 정수 값을 저장할 input 변수
		int input = 0;

		while (input != -1) {
			System.out.print("정수 입력: ");
			input = in.nextInt();
			sum += input;
			turn++;

			// 버퍼 비우기
			in.nextLine();
		}

		System.out.println("-1 을 입력 했습니다. 입력을 멈추고 평균을 계산합니다.");
		// 소수점이 존재할 경우 3째 자리 까지 출력 되도록 설
		System.out.println(
				"입력하신 정수의 합과 평균 값은 각각 " + sum + " 과 " + Math.round(((double) sum / turn) * 1000) / 1000.0 + "입니다.");
	}
}
