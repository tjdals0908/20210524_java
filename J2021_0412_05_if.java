import java.util.InputMismatchException;
import java.util.Scanner;

public class J2021_0412_05_if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//		System.out.println("두 정수를 입력:");
		//		int num1 = scan.nextInt();
		//		int num2= scan.nextInt();
		//		
		//		if(num1>num2) {
		//			System.out.println("num1이 크다");
		//		}
		//		else {
		//			System.out.println("num2이 크다");
		//		}

		//실습1)
		//점수를 입력받고 입력받은 점수에 따라 등급 

		//		System.out.println("점수?");
		//		int a=scan.nextInt();

		//절대평가
		//		if(a>90) {
		//			System.out.println("A");
		//		}else if(a>80) {
		//			System.out.println("B");
		//		}else if(a>70) {
		//			System.out.println("C");
		//		}else if(a>60) {
		//			System.out.println("D");
		//		}else {
		//			System.out.println("F");
		//		}

		//상대평가 ------------------------------
		//등수와 전체인원수를 입력받아
		//		System.out.println("전체인원수:");
		//		int all=scan.nextInt();
		//		System.out.println("등수?");
		//		int x=scan.nextInt();
		//		
		//		if(x<= all*0.15) {
		//			System.out.println("A");
		//			
		//		}else if(x<= all*0.35) {
		//			System.out.println("B");
		//			
		//		}else if(x<=all/0.50) {
		//			System.out.println("C");
		//			
		//		}else 
		//			System.out.println("F");
		//	}
		//---------------------------------------	

//실습) 화씨(f) =섭시(c)로 바꾸기 
		///섭씨 온도 1 > 33.8 화씨


		//	100 f 입력   >섭씨 온도 바꾸기 
		//	100 c 면 > 화씨로 바꿔라

		//실습)화씨(F) <=> 섭씨(C) 로 바꾸기

		//공식 : (1)화씨온도를 섭씨온도로

		//		     섭씨온도 = (화씨온도 − 32) × 5/9 
		//		 (2)섭씨온도를 화씨온도로

		//		     화씨온도 = 섭씨온도 × 9/5 + 32  
		//온도 : 10 C 또는 100 F	

		//	int f,c = 0;
		//	int change;
		//	f= c*9/5+32;
		//	c= (f-32)*(5/9);

//		System.out.println("온도입력 f/c:");
//		int t = scan.nextInt();
//		String b=scan.next();
//
//		if(b.equals("c")) {
////			int f= t*9/5+32;
////			System.out.printf("화씨온도:%d",f);
//			System.out.println("화씨온도: " + (t *(double)(9 / 5) + 32));
//			
//		}else if(b.equals("f")) {
////			int c= (x-32)*5/9;
////			System.out.printf("섭씨온도%d:",c);
//			System.out.println("섭씨온도: " + ((t - 32) * (double)5 / 9));
//		}else {
//			System.out.println("다시입력해주세요");
//		} ---------------------------------------------------------------
		
//실습 계산기
		
//		System.out.println("계산식은?");
//		int a=scan.nextInt();
//		String x=scan.next();
//		int b=scan.nextInt();
//		System.out.println(a+x+b);
		
//		if(x.equals("+")) {
//			System.out.printf("합은: %d\n",a+b);
//		}else if(x.equals("-")) {
//			System.out.printf("빼기: %d\n",a-b);
//		}else if(x.equals("/")) {
//			System.out.printf("나누기: %d\n",a/b);
//		}else if(x.equals("*")) {
//			System.out.printf("곱하기: %d\n",a*b);
//		}else {
//			System.out.println("다시입력해주세요");
//		}
//---------------------------------------------------------------
//		Scanner sc  =new Scanner(System.in);
//		System.out.print("계산식은?");
//		int a = sc.nextInt();
//		String sign = sc.next();
//		int b = sc.nextInt();
//		System.out.println(a+sign+b);
//		if (sign.equals("+")) 
//			System.out.println("결과:" + (a+b));
		
//--------------강사님이한거------------계산기---------------------------------
//실습)계산기
		//입력값 : 10 - 20
//		Scanner sc  =new Scanner(System.in);
//		System.out.print("계산식은?");
//		try {
//			int a = sc.nextInt();
//			String sign = sc.next();
//			int b = sc.nextInt();
//			System.out.println(a+sign+b);
//			
//			if (sign.equals("+")) 
//				System.out.println("결과:" + (a+b));
//			
//		}catch(InputMismatchException e) {
//			System.out.println("숫자를 입력해주세요");
//			
//		}catch (Exception e) {
//			System.out.println("예외발생");
//		}
		
//실습계산기 -2-
			
//		System.out.println("숫자값은?");
//		System.out.println("숫자+"+scan.hasNextInt());
//
//		
//		//scan.hasNextInt()==true 입력하면 가능하지만 코드인스펙션 걸림  
//		//코드인스펙션:규율
//		
//		if(!scan.hasNextInt()) {		//숫자라면 
//			System.out.println("잘못된숫자");
//		}else {
//			int a= scan.nextInt();
//			System.out.println(a);
//		}

//실습 중첩 조건문 
//		아이디와 패스워드를 입력 받아 로그인 성공여부 결정짓는 프로그램
//		
//		아이디를 입력해주세요
//		아이디가 일치 합니다
//		패스워드가 일치합니다 
//		로그인성공 
		
//실습 아이디 //패스워드 체크----------------------------------------		
		
//		String myid="java";
//		String mypw="1111";
//		System.out.println("아이디를 입력해주세요");
//		String sc= scan.next();
//		
//		if(sc.equals(myid)) {
//			
//			System.out.println("일치합니다");
//			System.out.println("패스워드를 입력해주세요");
//			String pw=scan.next();
//			if(pw.equals(mypw)) {
//				
//				System.out.println("패스워드가 일치합니다");
//				System.out.println("로그인성공");
//			}
//				else {
//					System.out.println("패스워드 불일치");
//			}
//		}else {
//			System.out.println("불일치");
//		}
//-----------------------------------------------------------------------
		
		
//적정  체중 구하기
		
	//이름/신장/몸무게 
//		System.out.println("이름 신장 몸무게");
//		String name = scan.next();
//		int height =170; 		/*scan.nextInt();*/
//		int weight =80;		/* scan.nextInt();*/
//		
//		double avg= (height-100)*0.9;
//		System.out.println("현 몸무게:"+weight);
//
//		System.out.printf("평균 체중:%.1f ~ %.1f\n",avg+avg*0.05,avg+avg*-0.05);
//		
//		
//		if(avg+(avg*0.05) >=weight && weight<= avg+(avg*-0.05)) {
//			System.out.println("평균체중은:"+avg);
//			System.out.println("적정체중 입니다");
//			return;
//		}
//		else if(weight>avg) {
//			System.out.println("평균체중은:"+avg);
//			System.out.println("과체중 입니다");
//			
//		} 
//		else if(weight<avg) {
//			System.out.println("평균체중은:"+avg);
//				System.out.println("체중 미달 입니다");
//		}
//		else {
//			System.out.println("다시입력");
//		}
			
		

		
//실습 전기사용 요금 
//월 사용량을 입력받아 전기 요금을 계산 
//		주택용 전력(저압)
//		구간
//		기본요금(원/호)
//		전력량 요금(원/kWh)
//
//		1					
//		200kWh 이하 사용
//		910
//		88.3
//		
//		2
//		201~400kWh
//		1,600
//		182.9
//
//		3
//		400kWh 초과
//		7,300
//		275.6
//
//		100사용시 = 90+100*88.3
//		300사용시=1600+(200*88.3)+(100*182.9)
//		500사용시 7300+(200*88.3)+(200*182.9)+(100*275.6)
		
//		int month=300;
////		month=scan.nextInt();
//		
//		if(200>=month) {							//200이하
//			double price1= 910+month*88.3;
//			System.out.print((int)price1);
//			System.out.println("(기본료: 910포함)");
//
//		}else if(201<=month && month<=400) {	//201-400
//
//			double price2= 1600+(200*88.3)+((month-200)*182.9);
//			System.out.print((int)price2);
//			System.out.println("(기본료: 1600포함)");
//			
//		}else if(month>400) {					//400초과
//			double price3= 7300+(200*88.3)+(200*182.9)+((month-400)*275.6);
//			System.out.print((int)price3);
//			System.out.println("(기본료: 7300포함)");
//			
//		}else {
//			System.out.println("다시입력");
//		}
//===============================================================================
	//전기사용요금 강사님이 한거---------------
//		double won;
//		int use=401; //사용량
//		double eleUse1 = 88.3; //1단계 전력량 요금
//		double eleUse2 = 182.9; //2단계 전력량 요금
//		double eleUse3 = 275.6; //3단계 전력량 요금
//		int base;//기본요금
//		if (use <= 200) { //1단계
//			base = 910;
//			won = base + use * eleUse1 ;
//		}
//		else if (use <= 400) { //2단계
//			base = 1600 ;		
//			won = base + (200*eleUse1) + ((use-200)*eleUse2) ;
//		}
//		else{ //3단계
//			base = 7300;
//			won = base + (200*eleUse1) + (200*eleUse2) + ((use-400)*eleUse3) ;
//		}
//		System.out.println(won);
//		
//		System.out.printf("%.0f\n",won);								//format 은 반올림이 된다 
//		won=Double.parseDouble(String.format("%.0f",won));	//반올림 된다 	//String 이여서 ()형변환 입력 안된다
//		//Double.parseDouble() 쓰면 문자열을 double로 변환해주는 메서드 이다 
//		System.out.println(" ");
//		
//		System.out.println(Math.floor(won));	//버림
//		System.out.println(Math.ceil(won));		//올림
//		System.out.println(Math.round(won));	//반올림
		
		
//		System.out.println((int)won);
		
//실습) 년을 입력받고 윤년 체크 하기 
//		4년의 한씩 윤년 100년에 한번씩 아니여야되고 
//		400년의 한번 은 윤년
		
//		int year=100;
//		
//		if(year%4==0 && year%100!=0 ||year%400==0) {
//			System.out.println("윤년");
//		}else {
//			System.out.println("윤년이 아닙니다");
//		}
//-----------------------------------------------------------
		//0<= 랜던 값<1
//		System.out.println((int)(Math.random()*6));
		
		double r = Math.random();
//		System.out.println(r);
//		System.out.println((int)(r*6+1));
//		System.out.println((int)(r*(10-5+1)+5));
//									// (random*(마지막-시작값+1)+시작값))
//		System.out.println((int)(r*10+5));
		
		//주사위 게임 

			
		}
		
	}

