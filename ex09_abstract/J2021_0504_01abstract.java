package ex09_abstract;

 //부모클래스 					
//추상메서드를 한개라도 가지고 있으면 추상 클래스로 만들어야 한다 
abstract class Eduacation{
	static String name = "교육청";
	//구현부가 없는 추상메소드   : 구현분는 {} 이다
	
	abstract void schoolName();  //자식이 반드시 구현부를 작성 하게 만든다 
}

//초등학교
class Elementary extends Eduacation{
	@Override
	void schoolName() {
		System.out.println("국제 초등학교");
	}
}

//중학교
class Middle extends Eduacation{
	@Override
	void schoolName() {
		System.out.println("국제 중학교");
	}
}

//고등학교
class High extends Eduacation{
	@Override
	void schoolName() {
		System.out.println("국제 고등학교");
	}
}

class Eduinfo{
	//출신학교 출력 
	void schoolName(Eduacation edu) {
		//다운 캐스팅 
//		if(edu instanceof High)			//instanceof는 -- 가 포함 되어있다면 
//			((High)edu).schoolName();	// 실행 
//		else if (edu instanceof Middle)
//			((Middle)edu).schoolName();
//		else if (edu instanceof Elementary)
//			((Elementary)edu).schoolName();
		
		//다형성을 이용해서 출력 
		//실제로 출력은 자식클래스의 메서드를 실행
		edu.schoolName();
			
	}
}

public class J2021_0504_01abstract {
	public static void main(String[] args) {
		Elementary elem = new Elementary();
		Middle midd = new Middle();
		High high = new High();
		
		Eduinfo info =new Eduinfo();
		
		info.schoolName(high);
		info.schoolName(midd);
		info.schoolName(elem);
		
//		Eduacation e new Eduacation ();// 추상클래스는 객체생성 못한다 형체가 없기때문에 
		
		
		
		
	}

}
