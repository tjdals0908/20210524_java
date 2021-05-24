import java.util.Arrays;
import java.util.Scanner;

public class J2021_0412_04_scanner {

	public static void main(String[] args) {

		//사용자에게 입력받기
//		Scanner sc =new Scanner(System.in);
//		System.out.print("정수는?");
//		int a =sc.nextInt();
//		System.out.println("입력받은 값은:" +a);
		
		//반지름을 입력받아 
//		Scanner sc =new Scanner(System.in);
//		System.out.print("반지름: ");
//		int x= sc.nextInt();
//		System.out.printf("%.2f",(x*x)*3.14);
//		double r=sc.nextDouble();
//		System.out.printf("원의넓이는 %.2f입니다\n",r*r*Math.PI);
		
//		문자열을 입력받을때 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름은?");
//		String name = sc.next();
//		System.out.println("당신의 이름은\n"+name);	//띄어쓰기 하면 앞에것만 나온다 
		
		//한줄을 전부 읽어드리는 메서드(엔터를 기준으로 읽기)
		Scanner scan =new Scanner(System.in);
//		
//		System.out.println("나이:");
//		int age= sc.nextInt();
//		System.out.println(age);
//		
//		System.out.println("이메일입력:");
//		String email= sc.next();		//next로 하면 문제 안생김 
//		System.out.println(email);
//		
//		sc.nextLine();					// 엔터값 처리하는거
//		System.out.println("이름은:");
//		String name = sc.nextLine();	//(nextLine엔터기준으로 읽는다) 
//		//그전 스캔값을 입력하고 엔터를 누른다 그 엔터는 남아있기때문에  입력도 안했는데 종료가된다
//		System.out.println(age+" "+email+" "+name);
		
//실습)반,이름 ,파이썬,c,자바 점수를 입력받아
		//반 ,이름,총점과 평균 구하시오
		
		
//		System.out.println("반 이름은?");
//		int b= scan.nextInt();
//		String name = scan.next();
//		System.out.printf("반은:%d 이름은:%s\n",b,name);
//		
//		System.out.println("파이썬 c 자바 점수:");
//		int py=scan.nextInt();
//		int c=scan.nextInt();
//		int java=scan.nextInt();
//	
//		System.out.printf("합은:%d ,평균은: %.1f",py+c+java,(double)py+c+java/3);
//------------------------------------------------------------------------------	
		
//		System.out.println("반 이름은?");
//		int b= scan.nextInt();
//		String name = scan.next();
//		
//		int sum=0;
//		String x[]= {"파이썬","C","자바"};
//		for(int i=0; i<x.length; i++) {
//			System.out.println("["+x[i]+"]"+"점수:");
//			int sum3 =scan.nextInt();
//			sum+=sum3;
//		}
//		System.out.printf("반: %d 이름: %s\n",b,name);
//		System.out.printf("합계:%d, 평균:%.1f:",sum,sum/3.);
//----------------------------------------------------------------------------
		//소수점 반올림 정확히 하는법
		String ban = "A";
		String name = "홍길동";
		int python = 90;
		int c = 88;
		int java = 96;
				
		System.out.println("------------------------");
		System.out.println("반:" + ban);
		System.out.println("이름:" + name);
		int sum = python + c + java;
		System.out.println("총점:" + sum);
		double avg = (double)sum/3;
		System.out.println("평균:" + avg );
		System.out.println(avg * 100);			//100을 곱해준다
		System.out.println(Math.round(avg * 100));	// 곱해준후 소수점 2째자리 반올림해서 올려준다
		System.out.println((double)Math.round(avg * 100));	//100을 고해줬기때문에 다시 100나누기
//-------------------------------------------------------------------
		
		//format메소드 이용
		System.out.println("포맷메소드:"+String.format("%.2f",avg));
	
		
		
	}

}
