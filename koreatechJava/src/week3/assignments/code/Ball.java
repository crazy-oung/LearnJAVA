package week3.assignments.code;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Ball 클래스
 * @author dayounghan
 *
 */
public class Ball {
	
	private int[] list;
	
	
	/**	
	 * Ball 배열을 초기화 
	 */
	public Ball() {
		list = new int[3];
	}
	
	// private 변수 list의 데이터를 반환 
	public int[] getList () {
		return list;
	}

	/**
	 * ball list에 랜덤으로 값을 할당하는 메소드
	 * 
	 */
	public void pitch() {
		int[] flag = new int[10];

		for (int i = 0; i < 3; i++) {
			while (true) {
				ThreadLocalRandom rand = ThreadLocalRandom.current();
				list[i] = rand.nextInt(10);

				if (flag[list[i]] == 0) {
					flag[list[i]] = 1;
					break;
				}
			}
		}
		
	}

}
