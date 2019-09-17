package codeReview;

//캡슐화 예제
public class Player {
	// 보안을 위해 캡슐화 한다. 변수들을 private으로 선언 
    private static int nextId = 1;
    private int id;
    //기본 생성자
    public Player() {
        id = nextId++;
    }
    //private 변수에 값을 넣어주기 위해 get, set 메소드를 사용
    
    
    protected int getId() {
        return id;
    }
    
    private void setId(int id) {
        this.id = id;
    }
}
 
