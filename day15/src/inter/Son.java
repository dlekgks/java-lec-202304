package inter;



public class Son implements Father01, Father02 {

	

	@Override

	public void sayMyName() {

		System.out.println("이름이름");

	}

	

	public void eat() {

		System.out.println("son이 먹는다");

	}

	

	public void Father01Eat() {

		//인터페이스 Father01의 default 메서드인 eat()을 호출하겠다

		Father01.super.eat();

	}

	

	

    public static void main(String[] args) {

		Son son = new Son();

		son.eat();

		son.Father01Eat();

	}



}