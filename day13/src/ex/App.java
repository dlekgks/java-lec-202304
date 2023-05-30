package ex;
/*
 * 실행시킬
 */

public class App {

	public static void main(String[] args) {
		Parent parent = new Parent("name 인자");
		Child child = new Child(); //뉴 클래스 생성자
		
		parent.밥먹다(); // Parent 객체의 밥먹다() 를 호출
		child.밥먹다(); // child 객체의 밥먹다()를 호출
		child.부모님밥먹다();

	}

}
