package day17;

public class GenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentA<String, Integer> stdA
		= new StudentA<String, Integer>();
		
		stdA.set("name", 100);
		
		System.out.println(stdA.getKey());
		stdA.isObject(new String("a"));
		stdA.<Integer>isObject(1);
		
		 Genesis<? extends Gen2> genesis = new Genesis<Gen2>();
		 genesis.getObj();
		 
		 Genesis<? super Gen2>  genesis2 = new Genesis<Gen1>();
		 genesis2.getObj();

	}

}

//
class StudentA <K,V>{
	
	K key;
	V value;
	
	void set(K key, V value) {
		this.key = key;
	    this.value = value;
	}
	
	K getKey() { return this.key; }
	V getValue() { return this.value; }
	
	public <T> boolean isObject(T t1) {
		System.out.println(t1.toString());
		 return false;
	}
	
}


class Gen1 {void sayMyName() {}}
class Gen2 extends Gen1 {}
class Gen3 extends Gen2 {}

class Genesis<T> {
	T obj;
	T getObj( ) {
		return this.obj;
	}
	
}