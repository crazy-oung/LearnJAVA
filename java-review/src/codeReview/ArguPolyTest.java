package codeReview;

public class ArguPolyTest {
    public static void main(String[] args) {
    	//Person 배열 (참조타입이므로 주소 값을 가진다.)
        Person[] persons = new Person[2];
        persons[0] = new Dancer(); // 춤춘다
        persons[1] = new Actor(); // 연기한다
        
        for(int i = 0; i < persons.length; i++) {
        	// 객체의 play 메소드 실행.
            persons[i].play();
            // 출력
            persons[i].display();
        }
    }
}

// 추상 클래스 Person 
abstract class Person {
    String str;
    // 추상 메소드 play 선언
    abstract void play();
    //str 값 출력하는 메소드
    void display() {
        System.out.println(str);
    }
}

//Person클래스 상속받는 Dancer
class Dancer extends Person { 
	
	// 어노테이션을 통해 오버라이딩 한 것임을 알려준다.
    @Override
    protected void play() {	//댄서는 춤춘다.
        str = "춤춘다";
    }
}

//Person클래스 상속받는 Actor
class Actor extends Person { 
	
	// 어노테이션을 통해 오버라이딩 한 것임을 알려준다.
    @Override
    protected void play() {	// 배우는 연기한다
        str = "연기한다";
    }
}
