package staticexample;

public class WebApp {

	public static void main(String[] args) {
		
		Counter counter  = new Counter();
		
		
		System.out.println(counter.dynamicCounter);
		counter.plusDynamicCounter();
		counter.plusDynamicCounter();
		counter.plusDynamicCounter();
		System.out.println(counter.dynamicCounter);
		//3을 출력
		
		Counter counter2  = new Counter();
		System.out.println(counter2.dynamicCounter);
		
		// static은 어디에 할당(Method Area)
		Counter.plusStaticCounter();
		Counter.plusStaticCounter();
		Counter.plusStaticCounter();
		System.out.println(counter2.dynamicCounter);
	}

}
