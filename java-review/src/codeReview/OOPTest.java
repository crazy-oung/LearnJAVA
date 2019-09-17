package codeReview;

public class OOPTest {
	
    public static void main(String[] args) {
    	// 서브클래스 객채 생성 동시에 초기화
        Sub sub = new Sub("admin", 30);
    }
}

//슈퍼클래스 생성
class Super {
	
	// 이름, 나이 변수 생성
    String name;
    int age;
    
    //기본 생성자
    Super(){
        // this.name = "";
        // this.age = 0;
    }
    // 매개변수 두개를 받는 기본 생성자: 슈퍼 클래스의 name, age에 값을 넣는 생성자
    // 문자열 변수 한개, 정수형 변수 한개
    Super(String str, int val) {
        this.name = str;
        this.age = val;
    }
}

// 슈퍼 클래스를 상속받는 서브 클래스 생성
class Sub extends Super {
	
	// 매개변수 두개를 받는 기본 생성자: 슈퍼 클래스의 name, age에 값을 넣는 생성자
    // 문자열 변수 한개, 정수형 변수 한개
    Sub(String str, int val) {
        // super(str, val);
        if(name.equals("")) {	//이름이 입력이 되지 않을 시 게스트로 초기화
            name = "guest";
        }
        if(age < 1 || age > 200) {	// 나이가 말도 안되는 숫자가 들어오면 0으로 초기화
            age = 0;
        }
        System.out.println("이름 : " + name + "/나이:" + age); // ==> 에러발생
        // super(str, val); 선언시 결과 ==> 이름 : admin / 나이 : 30
        // 자식클래스에서 부모 클래스의 변수를 불러와 사용할 때는 부모 클래스의 이름을 반드시 명시해 주어야 한다.
        // ex) super.name = "guest"; 
    }
}
