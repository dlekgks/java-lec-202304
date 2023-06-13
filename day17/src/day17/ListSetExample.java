package day17;
import java.util.*;

public class ListSetExample {

	public static void main(String[] args) {
		// 1.List
		//a.리스트 생성
		List list = new ArrayList();
		
		//b.리스트에 값넣기
		list.add(9);
		for(int i = 8; i > 0; i --) {
			list.add(i);
		}
		
		//c.리스트값 확인
		System.out.println(list);
		list.add(3, 100);//3번방에 100을 넣고싶어요
		System.out.println(list);
		
		//d.리스트에서 값을 꺼내는 방법
		//d1.for()문을 사용
		//d2.향상된 for()문
		//d3.iterator
		//d4.stream api
		
		//d1
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
		
		//d2
		for(Object o : list) {
			System.out.print(o);
		}
		
		//d3 iterator
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());//값을 꺼내고 포인터 한칸 이동
			it.remove();
		}
		
		System.out.println("");
		System.out.println(list);
		
		
		//z. list 비우기
		list.clear();
		System.out.println(list);

	}

}
