package ex13_thread;

//프로그램  : 소스를 컴파일해서 실행코드로 변환된 파일 
//프로세스 : 실행파일이 cpu에의해서 실행된 상태
//스레드 : 프로세스 내에서 실행되는 세부 실행단위
//멀티스레드 : 하나의 프로세스 내에서 여러개의 스레드가 변행 처리 
//자바가 멀티스레드로 동작 

//스레드 스케쥴링 
	// JVM의 스레드 스케쥴러가 각 스레드에게 CPU를 할당하여 실행


//스레드 만들기1
class Tread1 extends Thread{			//다중상속이 안된다 (스레드 상속받음)
//실행하고 싶은 작업 run 에 구현
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("thread1:"+i);
		}
	}
}
//class Tread2 extends Thread{
//
//	@Override
//	public void run() {
//		for(int i=0; i<10; i++) {
//			System.out.println("thread2:"+i);
//		}
//	}
//	
//}



public class J2021_0507_01thread {
	public static void main(String[] args) {
		//스레드 객체 생성
		Tread1 th1 = new Tread1();
		th1.start(); 				//스레드실행
		
		Tread1 th2 = new Tread1();
		th2.start(); 	
		

		for(int i=0; i<10; i++) {
			System.out.println("main:"+i);
		}
		
	
		
		
		
	}

}
