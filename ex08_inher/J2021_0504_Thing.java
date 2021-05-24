package ex08_inher;

import java.util.HashMap;
import java.util.Map;

class Thing{
	String name;
	int no;
}

class Note extends Thing{
	private String name ="노트";
	
	@Override
	public String toString() {
		return name;
	}
}

class Pen extends Thing{
	private String name = "펜";
	
	@Override
	public String toString() {
		return name;
	}
	
}

//입고클래스 

class Enter{
	
	//재고 저장 맵 
	Map<String,Integer> map = new HashMap<>();

	
	//입고 메서드 
	void enter(Thing thing,int qty){
//		System.out.println(thing);
//		System.out.println(qty+"입고");
		System.out.println(thing.toString()+qty+"  입고");
		
		Integer stockQty = map.get(thing.toString());//기존재고 조회 	//null int못담는다 //Integer 은 null 담는거 가능
		if (stockQty == null) stockQty=0;		//재고가 없을경우 0으로 초기화 
		map.put(thing.toString(), stockQty +qty);	//새로운 재고 누적 
	}
	// 현재재고 출력 메서드
	void stockPrint(Thing th) {
		System.out.println(map);
		
		System.out.println(th.toString()+"현재재고: "+map.get(th.toString())+"개");
	}
	
	

}





public class J2021_0504_Thing {
	public static void main(String[] args) {
		Note note = new Note();
		Pen pen = new Pen();
		Enter e1 = new Enter();
		
		e1.enter(pen, 10);
		e1.enter(pen,20);
		e1.stockPrint(pen);
		
		
		e1.enter(note, 10);
		e1.enter(note, 40);
		e1.enter(note, 40);
		
		e1.stockPrint(note);
	}

}
