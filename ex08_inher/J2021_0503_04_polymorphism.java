package ex08_inher;

//부모클래스
class Shape{

	void printShape() {
		System.out.println("다각형");
	}
}

//사각형 클래스
class Rect extends Shape{	
	@Override
	void printShape() {
//		System.out.println("사각형");	//메서드 껍데기는 만들어야 된다 오버라이딩을 해야되기때문에 
	}
}

//삼각형 클래스 
class Tria extends Shape{
	
	@Override
	void printShape() {
		System.out.println("삼각형");
	}
}


public class J2021_0503_04_polymorphism {

	public static void main(String[] args) {
		
//		Rect r1 = new Rect();
//		r1.printShape();
//		
//		System.out.println("-------");
//		Tria t1 = new Tria();
//		t1.printShape();
		
		//다형성을 이용해서 메소드를 실행 하려면 반드시 오버라이딩이 되어있어야 한다 
		//runtime시에는 자식 메서드 실행 
		
		//다형성 
		Shape rec = new Rect();
		rec.printShape();	//컴파일 에러 
		
		Shape tri = new Tria();
		tri.printShape();

		//부모 = 자식 
		// 메서드명 같은거 (오버라이딩) 잇어야 된다 
		
		
	}

}
