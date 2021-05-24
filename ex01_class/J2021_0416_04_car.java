package ex01_class;


class Car{
	//필드 - 필드안에는 자동초기화가 된다 
	
	String name ="람보르기니";
	String color ="레드";
	boolean power;	//
	int speed;
	
	void speedUp() {	//속력 100초과 될수 없다
		if(speed<100) 
			speed++;
	}
	void speedDown() {	//속력 50까지가 최저속력
		if(speed>50)
			speed--;
	}
	void powerToggle() {
		power= !power;
	}
	
}

public class J2021_0416_04_car {

	public static void main(String[] args) {
//자동차 클래스
//속성 : name, color, power ,speed
//기능 powerToggle, speedUp speedDown 
		
		Car c1 = new Car();
		
		System.out.println(c1.name);
		System.out.println(c1.color);
		
//		c1.speedUp();
//		c1.speedDown();
//		System.out.println(c1.power);
//		System.out.println("속력"+c1.speed);
//		c1.powerToggle();
//		System.out.println("파워"+c1.power);
		
		
		for(int i=0; i<200+1; i++) {
			c1.speedUp();
		}
		System.out.println("속력"+c1.speed);
		
		
		
		for(int i=0; i<100+1; i++) {
			c1.speedDown();
		}
		System.out.println("속력"+c1.speed);
		
		
		
		
		
	}

}
