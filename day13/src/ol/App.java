package ol;

public class App {

	public static void main(String[] args) {
		
		공군 airforce = new 공군();
		airforce.복무기간출력();
		airforce.일하다();//오버라이딩
		airforce.일하다("격납고");//오버로딩
		
		육군 army = new 육군();
		army.복무기간출력(); //오버라이딩 없이 부모객체의 복무기간이 출력


	}

}
