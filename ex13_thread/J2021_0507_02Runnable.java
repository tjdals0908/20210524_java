package ex13_thread;

import org.junit.internal.runners.statements.RunAfters;

//스레드만들기2 (이방법이 더 많이 쓰임) why ? 인스턴스는 다중상속이 가능해서 더 많이씀

//class MyRunn implements Runnable{
//
//	@Override
//	public void run() {
//
//		for(int i=0; i<10;i++) {
//			System.out.println("runnalbe 스레드"+i);
//		}
//		
//	}
//	
//}

public class J2021_0507_02Runnable {
	public static void main(String[] args) {

//		MyRunn myRun = new MyRunn();	// 실행 구현
//		Thread th =new Thread(myRun); // 스레드 생성
//		th.start(); //스레드 시작					//start는 run메서드를 실행해줌
		
		//익명클래스 : runnable을 상속 
		//1방법
//		Runnable myRun = new Runnable() {
//			@Override
//			public void run() {
//				for(int i=0; i<10; i++) {
//					System.out.println("runnable :"+i);
//				}
//			}};
//	
//		Thread th =new Thread(myRun);
//		th.start();						//스레드 시작 run을 실행하기 위한 메서드 
		
	

		
		
//		스레드 우선순위 :1-10(클수록 높음)
//		스레드 1생성 
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("thread1 스레드1 :"+i);
				}

			}
		});
		th1.setPriority(1); //우선순위 가장 낮다
		th1.start();
		
		
		 Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
				System.out.println("runnable2 스레드2:"+i);
			}
			}
		});
		th2.setPriority(10); 	//우선순우 ㅣ가장 높다 
		th2.start();
		
		//main스레드 동작
		for(int i=0; i<10; i++) {
			System.out.println("main:"+i);
		}
		
		
		
		
	}

}
