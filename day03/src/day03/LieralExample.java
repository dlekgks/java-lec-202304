package day03;

/*
 * 이름 : 이종석
 * 사는곳 : 금천구
 * 직장: 서울시 금천구
 * 안녕하세요
 */
public class LieralExample {

	public static void main(String[] args) {
	
		//상수
		double pi = 3.14;
		pi = 3.15; // 오류가 나지않음 (pi는 변수니까)
		
		final double PI = 3.14;
		//ㅖㅑ = 3.15; <-- 불변인 상수를 중간에 수정하고자 하면 컴파일 에러
		
		final double MAX_AGE;
		MAX_AGE = 10; //오류는 아니지만 지양
		
		//리터럴은 \n,\t, \" 등 문자열을 출력/저장하고 싶을 때 사용하는
		//규칙 (escape sequence)
	System.out.print("이름 : 이종석\n");
	System.out.print("사는곳 : 금천구\n");
	System.out.print("직장 : 서울시 금천구\n");
	System.out.print("\"안녕하세요\"");
	}

}
