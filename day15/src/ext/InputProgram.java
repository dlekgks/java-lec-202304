package ext;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputProgram {
	
	void haakhaak() throws NotValidNumberException {
		throw new NotValidNumberException("하악하악");
		/*
		 * throw를 통해서 Exception을 실제로 발생시키는 코드가 있는 경우에는
		 * 이미 발생이 되었기 때문에 try- catch를 통한 예외처리를 하거아
		 * throws를 통한 위임(남한테 미루기)를 하거나
		 * 둘중 하나를 꼭 해야함.
		 */
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name = "";
		int age = 0;
		
		System.out.print("이름을 입력해주세요 :");
		name = input.next();
		
		//예외가 발생할 수 있는 곳
		try {
		System.out.print("나이를 입력해주세요 :");
		
		if(age > 100) {
			throw new NotValidNumberException("숫자는 100이하여야 합니다.");
		}
		
		age = input.nextInt(); //여기서 Exception을 던지면
		} catch(NullPointerException e2) { //여기서 catch하겠다.
			System.out.print("NullPointerException");
		} catch(Exception ex) { 
		    System.out.print("Exception 다잡아");
		    System.out.print("예외메세지 :" + ex.getMessage());
		} finally {
			System.out.print("finally 구문 실행");
		}
			/* catch(Exception ex) { //모든 Exception의 아버지 클래스 여기서 catch한다.
		}
			System.out.print("Exception 다잡아");
		}*/
		
		
		
		System.out.print("저는" + name + "이고요, 나이는" + age + "입니다.");

	}

}
