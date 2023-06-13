package day17;
import java.util.*;

public class GernericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		//list.add("1");//
		//list.add("a");//
		list.add(1);
		list.add(20);
		
		for(Integer o : list) {
			System.out.println(o);
		}
		
		Map<String, Integer> pointMap = new HashMap<String, Integer>();
		pointMap.put("name", 1);
		
		List<Map<String, Integer>> dataList
		     = new ArrayList<Map<String, Integer>>();
		
		
		

	}

}
