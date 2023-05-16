package day08;
// lotto 6/45
// lotto 6/x
// java  ArrayLottoExample 1000
//(1~1000까지의 숫자중 6개를 선택하는 로또 프로그램을 만듭니다.)

// 2번 X/Y 예를 들면 java  ArrayLottoExample 10 100
// 1-100까지의 수에서 10개를 뽑아서 출력하기. 

public class ArrayLottoExample {

	public static void main(String[] args) {
		
		
		if(args.length == 0 || args.length > 2) {
			System.out.println
			("사용법 : java ArrayLottoExample <뽑을수> <최대숫자>");
			return;
		}
		int pickCount = Integer.parseInt(args[0]);
		//--사용법 통과 후 진행하는 곳
		int maxNum = Integer.parseInt(args[1]); //최대숫자 (ex : lotto 6/100, 6/200
		               //사용자가 입력한 값을 넣는 변수
	    int[] lotto = new int[pickCount]; //로또 숫자는 6개니까
		
		//--로또번호 방에 넣기
		for(int x=0; x < lotto.length; x++) {
			int num = (int)(Math.random() * maxNum) + 1;
			lotto[x] = num;
			}
		
		//--로또번호 출력하기
		System.out.println("생성된 로또번호");
		for(int x = 0; x < lotto.length; x++ ) {
			System.out.println(lotto[x] + "\t")	;
		}
		System.out.println("\n프로그램을 종료합니다.");
	}

}
