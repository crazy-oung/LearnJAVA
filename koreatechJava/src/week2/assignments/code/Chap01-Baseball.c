/*
 ============================================================================
 Name        : baseball.c
 Author      : 김상진
 Version     : 한국기술교육대학교 컴퓨터공학부 자바프로그래밍
 Copyright   : 2020년도 2학기 과제1
 Description : 숫자 야구 게임
  - 주어진 C 소스를 자바로 바꾸세요.
  - 자바에서 main 메소드를 포함하는 클래스를 정의하고
  - 필요한 모든 메소드를 static 메소드로 정의하여 구현하시오.
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <time.h>

/*
 * Java에서 난수는 ThreadLocalRandom.current() 객체를 이용함 (다른 방법도 있음)
 * 이를 위해 다음 import문이 필요함
 * import java.util.concurrent.ThreadLocalRandom;
 *
 * 사용 방법은 다음과 같음 nextInt(n)이면 0부터 n-1까지 정수 중 랜덤값 하나를 생성하여 반환함
 * ball[i] = ThreadLocalRandom.current().nextInt(10); // 0~9
*/
void pitch(int ball[]){
	int flag[10] = {0};
	int i=0;
	for(i=0; i<3; i++){
		while(1){
			ball[i] = rand()%10;
			if(flag[ball[i]]==0){
				flag[ball[i]]=1;
				break;
			}
		}
	}
}

/*
 * 자바에서는 int compare(int[] ball, int[] bat) 형태로 정의
 */
int compare(int ball[], int bat[]){
	int flag[10]={0};
	int scount = 0;
	int bcount = 0;
	int i;
	for(i=0; i<3; i++) flag[ball[i]] = 1;
	for(i=0; i<3; i++){
		if(ball[i]==bat[i]) ++scount;
		else if(flag[bat[i]]==1) ++bcount;
	}
	if(scount==3)
		return 1;
	else if(scount==0&&bcount==0) return -1;
	else{
		printf("S: %d, B: %d\n", scount, bcount);
		return 0;
	}
}

/*
 * Java 배열
 * int[] bat = new int[3]; 자동으로 0으로 모두 초기화
 *
 * 자바에서 타자 값 입력
 * for(int i=0; i<3; i++) bat[i] = in.nextInt();
 */
void playGame(){
	int bat[3];
	int ball[3];
	int result;
	int out = 0;
	pitch(ball);
	while(1){
		printf("[0-9]까지 숫자 3개를 입력하시오: ");
		scanf("%d %d %d", &bat[0], &bat[1], &bat[2]);
		result = compare(ball,bat);
		if(result==1){
			printf("사용자 승\n");
			break;
		}
		else if(result==-1){
			++out;
			printf("OUT: %d\n", out);
			if(out==3){
				printf("컴퓨터 승\n");
				break;
			}
		}
	}
}

/*
 * Java
 * boolean done()
 * getchar -> in.nextLine를 이용하여 문자열 입력 후 문자열 비교
 * 예) String s = in.nextLine(); s = s.toLowerCase(); if(s.equals("n"))
 */
int done(){
	char c;
	printf("새 게임(y/n)? ");
	while(1){
		c = getchar();
		if(c!='\n') break;
	}
	return (tolower(c)=='n');
}


int main(void) {
	srand(time(NULL));
	do{
		playGame();
	}while(!done());
	return EXIT_SUCCESS;
}
