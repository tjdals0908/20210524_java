package ex01_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J2021_0420_01_BankMain {
	public static void main(String[] args) {
		//한개의 계좌 만들기
		Bank b1 = null;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("----------------");
		System.out.println("---국제은행----- ");
		System.out.println("----------------");
		System.out.println("0.로그인");
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.잔액조회");
		System.out.println("5.고객조회");
		System.out.println("9.종료");
		System.out.println("----------------");
		System.out.print("선택?");
		int no = scan.nextInt();
		switch (no) {
		case 0:
				System.out.println("0번 로그인");
				
				break;
		
		case 1:
				System.out.println("이름 입력해주세요");
				String name= scan.next();
				System.out.println("통장이름?");
				String bankname = scan.next();
				System.out.println("계좌번호?");
				String bankno=scan.next();
				b1 = new Bank(bankname,bankno,name);

				break;
		case 2:
			if(b1 ==null) {
				System.out.println("계좌를 먼저 개설하세요");
				break;
			}
			System.out.println("입금:");
			int balanceIn = scan.nextInt();
			b1.setBalanceIn(balanceIn);
			break;
		case 3:
			System.out.println("출금:");
			int balanceMinus = scan.nextInt();
			b1.setBalanceMinus(balanceMinus);
			break;
		case 4: 
			System.out.println(b1);
			break;
			
		case 5: 
			System.out.println("5번");
			
			break;
			
		case 9:
			System.out.println("종료");
			break;
		default :
		}
		System.out.println("계속하시겠습니까 (y)?");
		String choise = scan.next();
		if(choise.equals("y")==false)
			break;
		}
		
		
		
		
		
		
		
		
	}
}


//		Bank b1 = new Bank("청약저축","99-99-99");
//	
//		System.out.println("은행명:"+b1.getBankname());
//		System.out.println("은행no:"+b1.getBankno());
//		System.out.println("계좌잔액:"+b1.getBalance());
//		System.out.println(b1);
//				
//		Bank b2 = new Bank("청약저축","99-99-99",1000);
//		b2.setBankname("디딤돌저축");
//		System.out.println("은행명:"+b2.getBankname()
//		+" "+"은행no:"+b2.getBankno()
//		+" "+"계좌잔액:"+b2.getBalance()
//		);
//
//		b2.setBalanceIn(10000000);
//		b2.setBalanceMinus(100);
//		System.out.println(b2);