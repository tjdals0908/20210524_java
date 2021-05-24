package ex01_class;
//오버로딩 테스트 원의 넓이 구하기

class Circle{
//반지름과 원주율을 입력받아 원의 넓이 구하는 메서드 
//게터 세터 만들기 
//반지름은 정수 또는 실수형 원주율을 입력받지 않으면 3.14 받기
	
//필드 : 반지름 ,원의 넓이 
//객체 생성과 동시에 원의 넓이 자동계산
	


	private double r;	//반지름
	private double area;	//넓이
	
	//생성자
	Circle(){};
//---------------------------------------------------
	
	Circle(double r){
//		this();	//자신 생성자 호출
		this.r = r;	//r입력 
		areaCal(r); //생성자에서 메소드 실행
	}
//	Circle(int r){
//		this.r=r;
//		areaCal(r);
//	}

	
	
//	Circle(int r, double x){
//		this.r=r;
//		areaCal(r,x);
//	}
//	Circle(double r, double x){
//		this.r=r;
//		areaCal(r,x);
//	}
	

//	//게터
	double getArea() {
		return area;
	}
	//메소드
	double areaCal(double r) { //원의 넓이 계산 메소드
		area = r * r * Math.PI;
		return area;
	}
	double areaCal(int r) { 
		area = r * r * Math.PI;
		return area;
	}
	double areaCal(int r, double x) {
		area =r*r*x;
		return area;
	}
	double areaCal(double r, double x) {
		area =r*r*x;
		return area;
	}
	
	@Override
	public String toString() {
		return "Circle [r=" + r + ", area=" + area + "]";
	}
}



public class J2021_0420_05_OverloadingTest {

	public static void main(String[] args) {

//원의 넓이 구하기 
		
//		Circle c1 = new Circle(5.5);	//double
//		System.out.println(c1);
		
		Circle c2 = new Circle(5);	//int
		System.out.println(c2);
		
//		Circle c3 = new Circle(5, 3.14);	//int double
//		System.out.println(c3);
//		
//		Circle c4= new Circle(4.5,3.15);	//double double
//		System.out.println(c4);
		
		
		
		
//		System.out.println("넓이:"+c1.areaCal(5.5));
//		System.out.println("넓이:"+c1.areaCal(5));
//		System.out.println("넓이:"+c1.areaCal(5,3.14));
//		System.out.println("넓이:"+c1.areaCal(4.5, 3.15));
		
		
		
	}

}
