package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J2021_0423_01Exception {

	public static void main(String[] args) {
		
//		//예외처리 
//		Scanner scan =new Scanner(System.in);
//		int a =10, b =0;
////		System.out.println(a/0); //0으로 처리하면 예외처리됨 
//
////		 b= scan.nextInt();
////		 System.out.println(a/b);
//		
//		while(true) {
//			System.out.println("나눌수를 입력:");
//			try { //예외발생 가능성 있는 문장
//				b= scan.nextInt();
//				System.out.println(a/b);
//				break;
//			}catch(java.util.InputMismatchException e){			//문자열 처리시 예외처리
//				System.out.println("숫자를 입력해주세요");
//				scan.nextLine();								//버퍼비우기 /값을 엔터값 처리 
//				e.printStackTrace();							//e.printStackTrace(); 프로그램이 어디가 잘못되어있는지 구체적이 에러메시지 출력
//																// 예외발생된 지점 추적 출력
//				
//			}catch(ArithmeticException e) {						//0처리시 예외처리
//				System.out.println("0으로는 나눌수 없습니다");
//				e.printStackTrace();							//0으로 하면 없기때문에 Line 처리 안해도 됌??
//				
//			}catch(Exception e) {								//모든 예외 처리  excepton 은 가장 마지막에 처리해야된다 아니면 오류 브레이크같은 존재
//				System.out.println("예외 발생");
//			}
//		}
//		System.out.println("프로그램 정상종료");

//------------------------------------------------------------------------------------	
		
		//실습 
//		int[] arr = {10,20,30};
//		//보고싶은 인덱스 번호 입력하세요 
//		System.out.println("인덱스 번호를 입력해주세요");
//
//		while(true) {
//		try {
//			int a= scan.nextInt();
//			System.out.println(arr[a-1]);
//			break;
//			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 번호[1-3]번까지 입력해주세요");
//
//		}catch(InputMismatchException e) {
//			System.out.println("숫자[인덱스번호]를 입력해주세요");
//			scan.nextLine();
//		}catch(Exception e) {							
//			System.out.println("예외 발생");
//		}
//		}
		
		//예외의 종류 
		//예외가 발생외되면 JVM해당하는 예외의 객체를 생성
		
		//1)체크예외 :RuntimeException을 상속하지 않은 예외 
		// 네트워크 db나 파일 등 외부와 연결되는 것들
		//2)언체크 예외 : RuntimeException을 상속한 예외 
		
		File file = new File("sample.txt"); 
		System.out.println(file);
		try {
			Scanner scan =new Scanner(file);		// exception 처리안하면 에러 
			System.out.println("파일을 읽기 성공");
			while(scan.hasNextLine()) {				// 문자가 다음 라인가지 있을때까지
				String s = scan.nextLine();
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {			//체크 예외 
			System.out.println("파일이 존재하지 않습니다");
			e.printStackTrace();
		}
		
		

		
		
	}
}
