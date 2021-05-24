import java.util.Scanner;

public class J2021_0414_03_for {

	public static void main(String[] args) {
		//for문 이용
		//합계
//		int sum=0;
//		for(int i=1; i<10+1; i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		
//실습)업다운 게임 랜덤 5번에 맞추기 
		Scanner scan = new Scanner(System.in);
//		int choise=55;	//고르기
//		int count =5;	//기회 
//		int random = (int)(Math.random() * 100 + 1); 
//		
//		
//		
//		for(int i=1; i<5+1; i++) {
//			System.out.print("입력 : ");
//			choise = scan.nextInt();
//			if(choise==random) {
//				System.out.println("정답 입니다");
//				System.out.println("정답은"+x);
//			}
//			else if(choise<random) {
//				System.out.print("------[업]----- ");
//				System.out.printf("(%d)남음\n",--count);
//				System.out.println(" ");
//			}
//			else if(choise>random) {
//				System.out.print("-----[다운]---- ");
//				System.out.printf("(%d)남음\n",--count);
//				System.out.println(" ");
//			}
//			else {
//				System.out.printf("다시 입력하세요");
//			}
//		}
//		System.out.println("정답은"+x);
		
//		int choise=55;	//고르기
//		int count =1;	//기회 
//		int random = (int)(Math.random() * 100 + 1); 
//		
//		while(true) {
//			System.out.print("입력:");
//			int a=scan.nextInt();
//			count++;
//
//			
//			if(a==random) {
//				System.out.println("정답");
//				
//			}else if(a<random) {
//				System.out.println("업");
//			}
//			else if(a>random) {
//				System.out.println("다운");
//			}else {
//				System.out.println(" ");
//			}
//			if(count>5)break;
//		}
//------------------------------------------------------
		
//강사님이 한거
		//2안)
//		int r = (int)(Math.random()*100 +1);
//		Scanner sc = new Scanner(System.in);
//		int a , count=0; //반복횟수
//		
//		boolean win = false; //성공여부(실패했다고 가정)
//		while(true) {
//			System.out.printf("%d)숫자를 맞춰라:", count+1);
//			if (!sc.hasNextInt()) { //입력한 값이 숫자가 아니면
//				sc.nextLine(); //버퍼 비우기 검사를하는애
//				
//				continue; //반복문의 처음으로 다시 돌아가서 계속 진행
//			}
//			a = sc.nextInt();
//			//업/다운/성공
//			count++; 
//			if (r>a) 
//				System.out.println("업");
//			else if(r<a) 
//				System.out.println("다운");
//			else {
//				System.out.println("성공");
//				win=true;
//				break;
//			}
//			if (count > 5) break;
//		}
//		if (!win) System.out.println("실패");

		
//설	
		
		
//		3kg 5kg 봉지 가 있는데 
//		5키로주문 하면 5키로 하나 가져가면 되고 
//		8키로 하면 3k 5k 하니식 
//		6키로 주문하면 3k2개 
//		7k 배달 불가 -1k
//		최소한의 봉지를 가져가야된ㄷ ㅏ 
//		나머지 생기면 대발 안된다 ㅇ
//		우선 3의배수 5의 배수만 되면 배달 
//		그다음 최소 봉지 수 
		
		
//		상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
		
//		설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
		
//		상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 
		
//		3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
		
//		상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.		
		
		
		int order=scan.nextInt();
		
		int big=0;	int small=0; int bag=0;
		
		while(order>0) {
			if(order%5==0) {
				order+=-5; big++;
				
			}else if(order%3==0) {
				order+=-3; small++; 
				
			}else {
				order+=-5;
			}
			bag++;
		}
		if(order<0) {
			bag=-1;
		}
		System.out.println(bag);
//		System.out.printf("small:%d, big:%d",small,big);


		
//소수구하기 
//실습 1안
//		양의정수를 받아 정수가 소수인지 검사 하시오
//		소수:1과 자기자신만으로 나누어 떨어지는거
//		int n=9;
//		boolean b= true;	//소수여부
//		
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				System.out.println(i+" " + "소수가 아닙니다");
//				b=false;
//				break;
//			}
//			
//		}
//		if(b) {
//			System.out.println("소수입니다.");
//		}
//		
		
//실습	1-n사이의 소수를구하시오 
//		n을 입력 받아 1부터 n사이의 모든 소수를 출력
//		하시오
//		예) 양의 정수? 100
//				2 3 5 7 .......83 89 97
		
//		boolean b;	//소수여부
//		for(int j=2; j<101;j++) { 
//			b = true; //소수라고 가정하고 시작
//			for(int i = 2; i<j; i++) {
//				if (j%i==0) {	//나누어 떨어지면 소수가 아님
//					System.out.println(j +" " + "소수가 아닙니다.");
//					b = false;	//소수가 아님 
//					break;
//				}
//			}
//			
//			if (b) {
//				System.out.println(j +" 소수입니다.");
//			}
//			
//		}
		
		
		
		
		
		
		
	}
		
}


