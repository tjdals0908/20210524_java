package ex05_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//필드 : 번호, 이름 , 전화번호 
class Student{
	
	private int no;
	private String name;
	private String tel;
	Student(){};
	
	public Student(int no, String name, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}


	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
	
}



public class J2021_0422_03Student {

	public static void main(String[] args) {

//		Student s1 = new Student( 1,"홍길동","010-1111-1111");
//		Student s2 = new Student( 2,"강호동","010-2222-2222");
//		Student s3 = new Student( 3," BTS " ,"010-3333-3333");
//		
//		//ArraysList 저장
//		List<Student> arrStd = new ArrayList<>();
//		arrStd.add(s1);
//		arrStd.add(s2);
//		arrStd.add(s3);
////		System.out.println(arrStd);
//		
//		for(int i=0; i<arrStd.size();i++) {
////			System.out.println(arrStd.get(i));
//			Student s = arrStd.get(i);
//			System.out.println(s.getNo()+" "+s.getName()+" "+s.getTel());
//		}
//		System.out.println("--------------------------");
//		for(Student s : arrStd) {
////			System.out.println(s.getNo()+" "+s.getName()+" "+s.getTel());
//	
//			System.out.printf("%-2d %-8s %10s\n",s.getNo(),s.getName(), s.getTel());
//		}
		
		
		
//		Student s1 = new Student( 1,"홍길동","010-1111-1111");
//		Student s2 = new Student( 5,"강호동","010-2222-2222");
//		Student s3 = new Student( 6," BTS " ,"010-3333-3333");
		
//		Map<Integer,Student> hmap = new HashMap<>();
		
//		hmap.put(s1.getNo(), s1);
//		hmap.put(s2.getNo(), s2);
//		hmap.put(s3.getNo(), s3);
//		System.out.println(hmap.get(1));
//		System.out.println(hmap.get(2));
//		System.out.println(hmap.get(3));
	
		
//		System.out.println(hmap);
//		
//		Student s = hmap.get(5);
//		System.out.println(s.getNo()+" "+s.getName()+" "+s.getTel());
//		System.out.println((hmap.keySet()));	//출력만 
		
//		Set<Integer> ks =hmap.keySet();			//hashmap 키값을 저장 해서 출력 하기 
//		for(int k : ks) {
//			System.out.println(k);
//			
//		}
		
//		for(int i =0;  i<ks.size(); i++) {
//			System.out.println(ks.); 			//set으로 했기때문에 순서가 없어 포문으로 출력이 안된다 
//		}
		
	
//		Iterator<Integer> it= ks.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			Student s = hmap.get(key);
//			System.out.println(s.getNo()+" "+s.getName()+" "+s.getTel());
//		}
		
		//실습 resutl : "sucess"  맵에 넣기  왼쪽 키   오른쪽 값 
		//data : ArrayList<Student>
		Student s1 = new Student( 1,"홍길동","010-1111-1111");
		Student s2 = new Student( 5,"강호동","010-2222-2222");
		Student s3 = new Student( 6," BTS " ,"010-3333-3333");
		
		Map<String, Object> hmap = new HashMap<>();
		hmap.put("result","sucess");
		
		List<Student> listarr = new ArrayList<>();
		listarr.add(s1);
		listarr.add(s2);
		listarr.add(s3);
//		System.out.println(listarr);
		
		hmap.put("data",listarr);		// data 하나로 listarr 값을 갖고있다 
//		System.out.println(hmap);
		
//		Object obj = hmap.get("result");
//		System.out.println(obj);	
		
		String result = (String)hmap.get("result");					//다운
		//만약 result갸 sucess 라면 학생정보 출력 아니면 에러 출력
		
		if(result.equals("sucess")) {
			System.out.println("성공");
			List<Student> stdlist = (List<Student>)hmap.get("data");
//			System.out.println(stdlist);
			
			for(Student s : stdlist) {
				System.out.println(s);
				System.out.println(s.getNo()+" "+s.getName()+" "+s.getTel());
			}
			
			
		}else
			System.out.println("에러");
		
		
		
		
		
	}

}
