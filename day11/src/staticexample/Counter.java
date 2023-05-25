package staticexample;


//웹 어플리케이션의 카운터
public class Counter {
	
	//static 키워드는
	//맴버변수, 매서드
	int dynamicCounter = 0; //인스턴스 변수(객체변수)
	static int staticCounter = 0; //정적변수

	public void plusDynamicCounter() {
		dynamicCounter ++;
	}
	public static void plusStaticCounter() {
		staticCounter ++;
	}

}
