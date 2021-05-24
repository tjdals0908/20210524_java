package ex03_lang;

public class J2021_0421_01_wrapper {

	public static void main(String[] args) {

	//래퍼 클래스
	
//	int a=10;
//	System.out.println(String.valueOf(a)+100);
//	
//	String s= "10";						
//	System.out.println(Integer.parseInt(s)+100);  //문자를 int 로 바꿈
//	System.out.println(Integer.valueOf(s)+100);	//래퍼클래스로 사용 
	
	
	Integer a =10;  //래퍼클래스로 입력해도 된다 
	Integer c = new Integer(10);		//------ 쓰지 말라는 표시  되도록 사용하지말자 , 호환성 문제 발생가능성
//	int b =a;
	System.out.println(c);
	
	
	
//	double d = 1.5;
//	int aa = (int)d;	//기본형끼리 형변환 가능  문자는 형변환이 불가능하여 객체로하여 바꾸는것이기때문에 integer.parseInt같은 메서드로 사용 해야된다 
		
	
	//2진수 변환 
//	int a = 255; 
//	System.out.println(Integer.toBinaryString(a));		//2진수로 바꿔주는...
//	
//	//boolean 클래스 
//	String s = "TRUE";
//	System.out.println(Boolean.parseBoolean(s));		//형타입.parse형타입(변환할려는 변수명));
	
	
	
	}

}
