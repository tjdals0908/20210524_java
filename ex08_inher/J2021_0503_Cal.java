package ex08_inher;


//부모클래스 
//더하기 빼기 (사칙연산)
class Cal{
	private String color; //부모클래스의 생성자를 자식 클래스에서 실행을시켜줘야 된다 
	
	
	protected int result;	//자식클래스까지 접근가능 (protected사용시)

	public int getResult() {
		return result;
	}
	Cal(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	
	int add(int a, int b) {
		return a+b;
		
	}

}

//자식클래스 
//나머지 .제곱 
class NewCal extends Cal{
//	private int result;		//result 가 자식의 리절트가 있으면 자식으로 없으면 부모로 간다 
	
	NewCal(String color) {
		super(color);		//부모클래스의 생성자를 실행
	}
	
	int add(int a) {
		result +=a;	
		return result;
	}

	int remain(int a,int b) {
		return a%b;
	}
}

public class J2021_0503_Cal {
	
	public static void main(String[] args) {

		
//실습) 계산기 클래스 상속하기 
//		사칙연산이 가능한 부모클래스 상속받아
//		나머지 와 제곱을 구해주는 기능이 추가된 자시클래스를 만들어보자 
		
		NewCal c1 = new NewCal("빨강");
		System.out.println(c1.add(100, 5));
		System.out.println(c1.remain(10, 3));
		
		System.out.println(c1.getColor()+"계산기");

		System.out.println(c1.add(5));
		System.out.println(c1.add(10));
		System.out.println(c1.add(50));
		System.out.println(c1.getResult());
		
		//object의 메소드 사용 가능 
		System.out.println(c1.hashCode());
		
	}

}
