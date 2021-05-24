package ex05_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class J2021_0422_02_Map {

	public static void main(String[] args) {
		
		//맵 : Key , Value
		//순서가 없다 (index없다)
		//key 중복 안된고 , Value 중복허용
		
//		HashMap<Integer, String> hmap = new HashMap<>();
//		hmap.put(1,"one");
//		hmap.put(2,"two");
//		hmap.put(3,"three");
//		
//		System.out.println(hmap);
//		System.out.println(hmap.get(2));
		
		//실습) 학생들의 나이 (key :이름, value:나이)
		
//		HashMap<String,Integer> hmap = new TreeMap<>();
//		HashMap<String,Integer> hmap = new HashMap<>();
		
//		Map<String,Integer> hmap = new TreeMap<>();
		Map<String,Integer> hmap = new HashMap<>();
		
		hmap.put("홍길동", 25);
		hmap.put("강호동", 40);
		hmap.put("홍", 25);
		hmap.put("홍", 45);
		hmap.put("홍", 44);
		
		
		System.out.println(hmap);
		System.out.println(hmap.get("홍"));
		
		
		
	}

}
