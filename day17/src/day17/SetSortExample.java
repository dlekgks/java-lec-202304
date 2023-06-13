package day17;
import java.util.*;

public class SetSortExample {

	public static void main(String[] args) {
		Set hashSet = new HashSet();
		hashSet.add(new Student("이종석", 30));
		hashSet.add(new Student("이종석", 20));
		System.out.println(hashSet.toString());

	}

}

class Student  { //extends Object 생략
	String name;
	int point;
	
	//생성자
	Student(String name, int point) {
		this.name = name;
	    this.point = point;
	}
	
	@Override
	public String toString() {
		return "(name=" + this.name +",point" + this.point +")";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals 호출");
		return true;
		
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode() 호출");
		return 10;
	}
	
}
