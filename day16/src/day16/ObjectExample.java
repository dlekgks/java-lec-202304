package day16;

import java.lang.*;

public class ObjectExample { //extends Object 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "이종석";
		String s2 = "이종석";
		System.out.println("s1 == s2 = " + (s1 == s2));
		//상수 pool (String pool)
		System.out.println(s1.hashCode());//객체당
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1));//참조변수당
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("------------------------");
		
		String s3 = new String("이종석");
	    String s4 = new String("이종석");
	    System.out.println("s3 == s4 = " + (s3 == s4));
	    System.out.println(s3.hashCode());
	    System.out.println(s4.hashCode());
	    System.out.println(System.identityHashCode(s3));
	    System.out.println(System.identityHashCode(s4));
		
	    System.out.println("s3.equals(s4) = " + s3.equals(s4));
	    
	    Student std = new Student("이종석", 1);
	    System.out.println(std);
	    

	}

}

class Student {
	String name;
	int grade;
	
	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		
	}
	
		@Override
		public String toString() {
			return "ciass Student { name=" + name +", grade =" +grade+"}";
		}
	
}
