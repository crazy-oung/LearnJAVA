package codeReview;

public class OopEx4 {
    public static void main(String[] args) {
        Test t1 = Test.getInstance(); // Test 클래스를 참조하여 getInstance()메서드를 호출하고 그 참조값을 t1에 대입합니다.
        // static 이라서 new 를 이용하여 객체를 생성할 필요 없이 바로 호출이 가능하다!!!
        
        Test t2 = Test.getInstance(); // Test 클래스를 참조하여 getInstance()메서드를 호출하고 그 참조값을 t2에 대입합니다.
        
        t1.setX(5); // t1 을 참조하여 setX() 메서드에 5를 대입하고 호출합니다.
        t2.setX(10); // t2 를 참조하여 setX() 메서드에 10을 대입하고 호출합니다.
        System.out.println(t1.getX());
        System.out.println(t2.getX());
    }

 
   static class Test {
	    private static Test t;	// static은 모든 객체에서 접근이 가능함을 뜻하는데  일반 클래스에서 필드가 static이 될 수 없음. 클래스 자체가 모든 객체에서 접근 불가이기 때문에 에러.
	    // 그러므로 에러 해결을 하기 위해서는 클래스 앞에 static을 붙인다.
	    
	    
	    
	    
	    
	    
	    
	    private int x;
	 
	    private Test() { }
		 
		public static Test getInstance() {	// static은 모든 객체에서 접근이 가능함을 뜻하는데  일반 클래스에서 필드가 static이 될 수 없음. 클래스 자체가 모든 객체에서 접근 불가이기 때문에 에러.
			if (t == null) {
			    t = new Test();
			}
			return t;
		}
	 
	    public int getX() {
	        return x;
	    }
		 
	    public void setX(int x) {
	        this.x = x;
	    }
    
	}
}
