package week3.assignments.code;


/*
============================================================================
Name        : Baseball.java
Author      : 컴퓨터공학부 2019136156 한다영
Version     : 2021년도 2학기 과제3
Copyright   : 한국기술교육대학교 컴퓨터공학부 자바프로그래밍
Description : 숫자 야구 게임을 객체지향으로
 - MVC(Model-View-Controller) 패턴
 - 프로그래밍 원리, "separation of concerns"를 고려해 설계 및 구
 - 숫자야구게임 논리와 관련된 클래스와 사용자와 상호작용(입출력하는 부분)하는 클래스는 따로
============================================================================
*/

/**
 * @copyright 한국기술교육대학교 컴퓨터공학부 자바프로그래밍
 * @author dayounghan
 * @version 2021년도 2학기 
 * @file Baseball.java
 */
public class Baseball {

	/**
	 * @author dayounghan
	 * 
	 *         과제 1에서 제출한 숫자야구게임을 객체지향으로 설계하여 구현하세요. 프로그램을 개발할 때
	 *         MVC(Model-View-Controller)라는 패턴이 있습니다. 
	 *         이와 관련된 프로그래밍 원리가 "separation of concerns"입니다. 
	 *         즉, 관심이 다른 것은 분리해서 구현해야 한다는 것입니다.
	 *         이 간단한 프로그램을 만들 때에도 이 점을 고려하여 설계하고 구현해 주세요. 
	 *         최소 숫자야구게임 논리와 관련된 클래스와 사용자와 상호작용(입출력하는 부분)하는 클래스를 따로 만들어야 합니다.
	 * 
	 */

	
	/**
	 * 메인 실행부
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		do {
			Game.playGame();
		} while (Game.done());
		
		System.out.println("게임을 종료합니다...");
	}


}
