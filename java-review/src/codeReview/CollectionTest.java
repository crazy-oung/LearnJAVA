package codeReview;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class CollectionTest {
    public static void main(String[] args) {
	    //리스트 타입에 변수 선언 어레이리스트 객체로 생성	(!!참조타입임.)
	    List<Singer> list = new ArrayList(); // 다형성
	    
	    // 값을 각각 받아 줄 것이므로 받은 데이터 개수 만큼 객체 생성
	    Singer singer1 = new Singer();    
	    Singer singer2 = new Singer();    
	    
	    // singer1의 name에 "admin" 저장 
	    singer1.setName("admin");
	    // singer1의 age에 30 저장
	    singer1.setAge(30); 
	    //리스트에 추가 : list는 singer1의 주소를 가진다.
	    list.add(singer1);
	    
	    // singer2의 name에 "guest" 저장 
	    singer2.setName("guest"); 
	    // singer2의 age에 32 저장
	    singer2.setAge(32); 
	    //리스트에 추가 : list는 singer2의 주소를 가진다.
	    list.add(singer2);
	    
	    // 자바의 iterator() 메소드: ResultSet rs, rs.next()와 같은 기능을 가진 메소드.
	    Iterator i = list.iterator();
	    // 순서대로 i를 Singer타입으로 변환 후 출력
	    while(i.hasNext()) {	// i 즉 list에 값이 있으면 실행.	    	
	        System.out.println( ((Singer)i.next()).getName() );	        
        }
    }
}
 

// 정보를 담는 클래스 만듬 캡슐화 
class Singer {
	
	// private으로 만든다.	
    private String name;
    private int age;
    
    //private 이므로 get, set을 사용해 접근/수정 할 수 있음
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
 
}