/**
 * 
 */
package week3.assignments.code;

import java.util.Scanner;

/**
 * @author dayounghan
 *
 */
public class Bat {
	
	private int[] list;
	
	
	/**	
	 *  Bat 배열을 초기화 
	 */
	public Bat() {
		list = new int[3];
	}
	
	/**
	 * 입력받은 문자열을 바탕으로 
	 * @param input
	 */
	public void setList () {
		
		// 숫자 3개를 입력 받아
		Scanner sc = new Scanner(System.in);
		System.out.print("[0-9]까지 숫자 3개를 입력하시오: ");

		
		// 리스트에 할당 
		list[0] = sc.nextInt();
		list[1] = sc.nextInt();
		list[2] = sc.nextInt();
	}
	
	// private 변수 list의 데이터를 반환 
	public int[] getList () {
		return list;
	}

}
