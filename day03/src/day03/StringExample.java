package day03;

public class StringExample {

	public static void main(String[] args) {
		
		//참조 데이터 타입
		// 1. 클래스(객체) 입니다.
		// 2. 변수공간에 실제 값이 아닌 reference (시작 주소 참조)
		// 대표적으로 String
		
		char alpha = '이'; //문자는 싱글 퀘테이션
		String name = "이종석"; // 문자'열'은 더블 퀘테이션
		int intalpha = alpha;
		
		System.out.println(alpha + "=" + intalpha);

		System.out.println("내 이름은" + name + "입니다.");
		

	}

}
