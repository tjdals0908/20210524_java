import java.util.Scanner;

public class J2021_0414_01_switch {

	public static void main(String[] args) {
		//조건문 : switch

//		int a=3;
//		switch(a) {
//		
//		case 1:
//			System.out.println("one");
//			break;
//		case 2:
//			System.out.println("two");
//			break;
//		case 3:
//			System.out.println("three");
//			break;
//		default:
//			System.out.println("잘못된숫자");
//		
//		}
////////////////////////////////////////////////////////
		
//실습 h고등학교 m은 중학교 e초등학교
		
		
		Scanner scan = new Scanner(System.in);
//		String school = sc.next();
//		//스캐너는 char은 없다 String로 사용해야함 
//		
//		switch(school) {
//		
//		case "h":
//			System.out.println("고등학교");
//			break;
//			
//		case "m":
//			System.out.println("중학교");
//			break;
//			
//		case "e":
//			System.out.println("초등학교");
//			break;
//			
//		default:
//			System.out.println("잘못된숫자");
//		
//		}
		
		//문자열 비교
//		String s1 = "java";
//		String s2 = new String("java");
//		String s3 = "java";
//		String s4 = scan.next();		//스캐너 입력도 다른 공간에서 입력되기때문에 java를 입력해도 같지 않게 된다 
										// 이퀄스로 비교해야된다 
		
		//s1과 s3비교하면 같게나오고	- 문자열은 주소값으로 비교하느게 맞으나 상수풀로 이용해서 
											//*상수풀이란 s1이 java를 입력하면 상수풀안에 공간에서 java가 들어가게된다
											// 그후 s3에서 java를 입력하면 java 가 현재 들어가잇기때문에 s1이 입력한 과 동일하기때문에 새로만들어지지 않고 
											// 그대로 s1이 햇던걸 연결싴준다 
											 
											
		//s1과 s2비교하면 다르게나온다	- s2는 새로운 주소번지를 얻고 상수풀로 이용해서 비교를 안한다 
		
		
//		if(s1.equals(s2)) {//s1==s2는 주소비교 
//			System.out.println("같습니다");
//		}
//		if(s4.equals("java")) {
//			System.out.println("s1=s4는 같습니다");
//		}
//		else {
//			System.out.println("다릅니다");
//		}
		
//실습) 짝수,홀수 출력
		
//		int a =11;
//		
//		switch(a%2){		//a%2==0 이 식이 안된다    비교문
//		
//		case 0:	//결과 값
//			System.out.println("짝수");
//			break;
//		
//		case 1:	//결과 값 
//			System.out.println("홀수");
//			break;
//			
//		default:
//		}
		
//		int in= 100;
//
//		switch(in/10){		
//		case 10:
//			System.out.println("A+");
//			break;
//		case 9:	
//			System.out.println("A");
//			break;
//		case 8:	
//			System.out.println("B");
//			break;
//		case 7:	
//			System.out.println("C");
//			break;
//		case 6:	
//			System.out.println("D");
//			break;
//			
//		default:
//			System.out.println("F");
//	}


		
		
		
}
}
