package day16;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		
		List list = new ArrayList(); //new List();  
		//Set list new HashSet(); 향상된 for문에만 사용가능
				//set/list 건 가변배열이기 때문에 일부만 다르고
				//기본적인 작업은 모두 동일하다.
		
		//집어넣기
		list.add(10);
		list.add(20);
		//list.add(new String("이종석"));
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(2);
		
		System.out.println(list);
		//System.out.println(list.toString());
		
		
		System.out.println("list.size() = " + list.size());
		
		System.out.println("list[0] = " + list.get(0));
		
		for(int i = 0; i < list.size(); i ++) {
			System.out.println("lis["+i+"] = " + list.get(0));
		}
		
		System.out.println("===============");
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		Set hashSet = new HashSet();
		hashSet.add(10);
		hashSet.add(20);
		//hashSet.add(new String("이종석"));
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(2);
		
		System.out.println("------------------------");
		System.out.println(list);
		System.out.println(hashSet);
	}


}
