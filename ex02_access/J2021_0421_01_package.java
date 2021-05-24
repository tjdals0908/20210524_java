package ex02_access;

import ex01_class.Bank;
import ex01_class.J2021_0421_02_Attend;


public class J2021_0421_01_package {

	public static void main(String[] args) {

		
		Test test =new Test();
		System.out.println(test.getA());
		
		//ex_class.Bank b1 = new ex_class.Bank("국제통장","11-22-33");	
		//접근제어자 :
		// public : 모든 클래스가 접근가능
		//private : 자신의 클래스 내부에서만 접근가능
		//default(접근제어자 없음): 같은 패키지만 접근 가능 
		
		Bank b1 = new Bank("국제통장","11-22-33");
		

//		J2021_0421_02_Attend a1 = new J2021_0421_02_Attend();
		
		
		
	}

}
