package ex01_class;

import java.util.Arrays;

public class J2021_0421_03_Cal {
	
// //속성 	
	public static final String maker= "국제계산기";
	private int result;
	private boolean light;
	
	
	public static String getMaker() {
		return "["+maker+"]";
	}
	
	
//	static int result;
//	//두수를 매개변수로 받아서 합을 리턴 
//	//static 메서드 안에서는 static 필드만 허용 가능
//	static int add(int a,int b) {
//		result +=a+b;
//		return result;
//	}
	
	int add(int a) {		//매개변수 하나만 받는다면 
		this.result=a;
		return result;
	}
	
	//라이트 켜기 끄기
	void lightPower() {
		light =!light;
	}
	
	public String toString() {
		return "light=[" + light + "]";
	}


	public static void main(String[] args) {
		
//		System.out.println(J2021_0421_03_Cal.add(3, 3));
//		System.out.println("result 합은:"+J2021_0421_03_Cal.result);

		J2021_0421_03_Cal c1 = new J2021_0421_03_Cal(); 
		
//		System.out.println(c1);
		c1.lightPower();
		System.out.println(c1.light);



		
		
		
		
		
	}

}
