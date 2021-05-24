package ex05_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class J2021_0422_01_list {

	public static void main(String[] args) {

		//List<E>
		//저장순서가 있다 (index 가 있다)
		//중복허용가능  (set은 중복허용 불가하다)
		//1)ArrayList : 배열구조 연속적인 공간할당 
			// 장점 : 검색이 유리 //단점: 추가,삭제 어렵다(속도가느리다) 
		
//		ArrayList<Integer> arrlist =new ArrayList<>();
//		arrlist.add(10);
//		arrlist.add(20);
//		arrlist.add(30);
//		arrlist.add("java");		// Integer 로 하기때문 문자열은 입력 불가 
//		System.out.println(arrlist);
		
//		for(int i=0; i<arrlist.size();i++) {
//			System.out.println(arrlist.get(i));
//		}
//		//foreach문
//		for(int i : arrlist) {				//int 쓰나 Integer하나 상관없다 
//			System.out.print(i+" ");
//		}
		
//		for(int i=1; i<10; i++) {
//			arrlist.add(i*10);
//		}
//		arrlist.remove(1);
//		
//		arrlist.add(1,20);
//		for(int i : arrlist) {				
//			System.out.print(i+" ");
//		}
//		ArrayList<Double> arrlistDouble = new ArrayList<>();
//		arrlistDouble.add(10.5);
//		System.out.println(arrlistDouble);
		
		
		
		//실습 이름을 입력받아 ArrayList만들기
		
		List<String> arrname = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("이름을 입력해주세요");
//			String name = scan.next();
//			
//			arrname.add(name);
////			System.out.println(arrname);
//			
//			System.out.println("종료하시겠습니까? (quit)");
//			String exit = scan.next();
//			if(exit.equals("quit")==true) break;
//		}
////		arrname.set(0, "이순신"); //set을 이용해서 추가입력
////		System.out.println(arrname);
//		
//		for(int i=0; i<arrname.size(); i++) {
//			System.out.println(i+1+":"+arrname.get(i));
//		}
		
		//삭제
//		arrname.add("hong");arrname.add("park");arrname.add("kim");arrname.add("park");
//		System.out.println(arrname);
//		System.out.println("삭제할이름은?");
//		String name = scan.next();
//		
//		for(int i=0; i<arrname.size();i++) {
//			if(arrname.get(i).equals(name)) {
//				arrname.remove(i);
//				i--;
//			}
//		}
//		System.out.println(arrname);
		
		//2안 추천
//		arrname.add("hong");arrname.add("park");arrname.add("park");arrname.add("park");
//		System.out.println(arrname);
//		System.out.println("삭제할이름은?");
//		String name = scan.next();
		
//		//반복장 생성
//		Iterator<String> it= arrname.iterator();		//이터레이터로
//		while(it.hasNext()) {						//boolean 형타입   있느냐? 있으면 true 업으면 false
//			String n = it.next();
//			if(n.equals(name)) it.remove();
//		}
//		System.out.println(arrname);
		
		//실습)
//		List<String> list = Arrays.asList("red","blue","yello");
////		System.out.println(list);
//		
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {					// has.next는 있는냐? 
//			System.out.println(it.next());		// 문자가 있을때까지 출력?
//		}
//		System.out.println("--------------------------");
		
//실습) 반학생들의 키 입력 받아 double 키의 평균 값 구하기 
		
//		List<Double> heightArr = new ArrayList<>();
//		double sum =0;
//	
//		while(true) {
//			System.out.println("키를 입력:");
//			double height = scan.nextDouble();
//			heightArr.add(height);
//
//			sum += height;
//			
//			System.out.println("종료하시겠습니까? (q)");
//			String quit = scan.next();
//			if(quit.equals("q"))break;
//		}
//		System.out.println("--------------------------");
////		System.out.println("학생키:"+heightArr);
////		System.out.println("학생키 평균:"+sum/heightArr.size());
//		
//		System.out.println(sum);
//		System.out.println(heightArr.size());
//		System.out.println(sum/heightArr.size());
////		System.out.println(100.0/ 0);//무한
////		System.out.println(100/ 0);  //예외
//----------------------------------------------------------------------------		

		
		//2)LinkedList : 리스트기반
		// 각요소가 자신의 이전요소의 주소와 다음 요소의 주소를 가지고 있다
		// 추가 /삭제가 쉽다 검색시 성능저하
		
		//LinkedList<String> linkList = new LinkedList<>(); 비추천 
		List<String> linkList = new LinkedList<>();			//LinkedList<>  -> List<> 
															// 수정삭제할일이 많아 지기때문에 List로 함 변경할려면 객체생성할 new 객체명만 바꾸면 되므로
															// List로 한다 ... 나중에 수정시 안바꿔도 되기때문에 
		linkList.add("pyhon");
		linkList.add("hava");
		linkList.add("c");
		System.out.println(linkList);
		
		for(int i=0; i<linkList.size(); i++) {
			System.out.println(linkList.get(i));
		}
		
		
		
		
		
		
		
	}

}
