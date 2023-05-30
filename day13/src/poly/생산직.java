package poly;

public class 생산직 extends 사람 {
	
	String part; //일하는 파트
	
	생산직(String name, String part) {
		
	this.name = name; //부모클래스
		this.part = part;
	}
	
	@Override
	public void 일하다() {
		System.out.println(name + " 님은 " + part + " 실행");
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
