package acc.deta;

//Parent와 같은 폴더(패키지) 내에 존재 
public class Child extends Parent {

	/// 생성자 내에서 부모 속성(맴버변수)에 접근해보자. 
	public Child() {
		this.publicName = "이종석";  //-- 접근가능
		this.defaultName = "이종석";  //-- 접근가능
		this.protectedName = "이종석";  //-- 접근가능
		
	}
	
	/*public static void main(String[] args) {
		 *  부모클래스의 private 변수/메서드는 자식에 상속되지 않는다. 
            this.privateName = "이종석"; <- 접근 불가능 	
	}*/

}
