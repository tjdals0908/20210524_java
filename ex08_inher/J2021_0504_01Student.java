package ex08_inher;


class School{
	
	void schoolName() {
		System.out.println("국제컴퓨터");
	}
	void info(String name) {}	//부모에 메서드생성 컴파일 에러 발생하지 않게 생성 
	
}

class Stud extends School{
	
	@Override
	void info(String name) {
		System.out.println(name+" 학생");
	}
}

class Tech extends School{
	
	@Override
	void info(String name) {
		System.out.println(name+" 선생님");
	}
}



public class J2021_0504_01Student {
	public static void main(String[] args) {

		
		School s1 = new Stud();
		s1.schoolName();
		
		
//		Stud s2 = (Stud)s1;
//		s2.info("홍길동");	//이렇게 해도되지만 밑에처럼 간단하게 할수 있다 
		((Stud)s1).info("홍길동");	//수동 형변환 
		
//		School s2 = new Tech();
//		((Tech)s2).info("이순신");		//s1을 만들어서 s2로 해도되지만
		s1 = new Tech();
		s1.schoolName();
		((Tech)s1).info("이순신");		//s1을 그대로 이용해서 사용 해도된다
		
		//하나의 형으로 여러가지 자식형을 연결시켜줄수 있다 
		
		
		s1.info("홍길동");  	//부모형의 info가 잇으면 info메서드 가능 하지만
								// 자식 info 메서드에서 실행이 된다 
		
		
		
		
	}

}
