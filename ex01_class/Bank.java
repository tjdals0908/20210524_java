package ex01_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//class Manager{
//	private List<Bank> banklist;
//	
//	public void manager() {
//		banklist = new ArrayList<Bank>();
//	}
//
//	public void setAddBanks(Bank bank) {
//		banklist.add(bank);
//	}
//
//	
//	
//}


//은행
public class Bank{							
	//필드: 은행명 계좌번호 잔액
	private String bankname;
	private String bankno;
	private int balance;
	private String name;
	
	//입금메서드
	public void setBalanceIn(int balance) {
		this.balance += balance;
	}
	//출금 메서드 
	public void setBalanceMinus(int balance) {
		if(balance<0) {
			this.balance -= balance;
		}
		else 
			System.out.println("잔액이 부족합니다 현재잔고:"+this.balance);
	}

Bank(){};
	//어노테이션
	//오버라이딩: 부모클래스의 메소드 재정의
	//	@Override
	public String toString() {
		return "Bank[은행명=" + bankname + ", 계좌번호=" + bankno + ", 잔액=" + balance + "]";
	}

	//세터//게터
//	public void setName(String name) {
//		this.name= name;
//	}
	
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankno() {
		return bankno;
	}
	public int getBalance() {
		return balance;
	}
	public Bank(String bankname, String bankno, int balance) {
		this.bankname= bankname;
		this.bankno=bankno;
		this.balance=balance;
	}
	public Bank(String bankname, String bankno) {

		this.bankname = bankname;
		this.bankno = bankno;
	}
	public Bank(String bankname, String bankno, String name) {

		this.bankname = bankname;
		this.bankno = bankno;
		this.name=name;
	}
	
	
	
	
	
}


