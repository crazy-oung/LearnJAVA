package codeReview;

public class PolyTest {
	
    public static void main(String[] args) {
    	//객체 생성
        Parent parent = new Parent();
        Child child = new Child();
        
        parent = child;	// 다형성 : 부모타입변수 = 자식객체        
        
        child = (Child)parent;
        // parent.subMethod();
        // Child클래스 안에있는 메소드는 부모클래스에서 호출 불가
        
        child.superMethod();
        // System.out.println(parent.a);	private라서 접근이 불가
        System.out.println(parent.b);	// 자기 자신은 접근 가능.
        System.out.println(parent.c);
        // System.out.println(parent.x); 	x는 private라서 접근 불가
        // System.out.println(parent.y);	-> 부모타입은 자식타입에 접근 불가 
        // System.out.println(parent.z);	-> 부모타입은 자식타입에 접근 불가 

    }
}
	//a, b, c, superMethod
    class Parent { 
    	// 필드 생성 초기화
        private int a = 1;
        protected int b = 2;
        public int c = 3;
        
        //부모 클래스의 메소드임을 알리는 문장을 출력해주는 메소드
        public void superMethod() {
            System.out.println("superMethod");
        }
    }
    
    // superMethod(a, b, c), x, y, z
    class Child extends Parent { 
    	// 필드 생성 초기화
        private int x = 4;
        protected int y = 5;
        public int z = 6;
        
        //자식 클래스의 메소드임을 알리는 문장을 출력해주는 메소드
        public void subMethod() {
            System.out.println("subMethod");
        }
    }