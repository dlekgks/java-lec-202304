package day03;

public class CharExample {

	public static void main(String[] args) {
       
		char alpha = 97;
		byte x = 127;
		
		float f = 1.0f;
		
		//10; //-- 정수의 기본 값은 int
		//1.0; //-- 실수릐 기본형은 double
		System.out.println(alpha);
		
		char alpha2 = 65;
		int ascii = 0;
		
		for(int i = 0; i < 26; i++) {
			alpha = (char) (alpha2);
			ascii = alpha2;
			System.out.println("문자 : " + (alpha2+i) + "는 ASCII CODE"
			+ ascii + "입니다.");
				
		}
	}

}
