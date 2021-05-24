package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J2021_0423_02Throws {

	static void arrayIndex(int index) {
		int[] arr = {10,20,30};
		try {
			System.out.println(arr[index]);
		}catch(ArrayIndexOutOfBoundsException e) {				
			System.out.println("[1-3]번호까지입력해주세요 ");
		}catch(Exception e) {
			System.out.println("예외발생");
		}
	}
	
	static void arrIndex_throws(int index) throws ArrayIndexOutOfBoundsException{	
		int[] arr = {10,20,30};
		System.out.println(arr[index]);
		
	}
	
	//파일을 읽기 메서드 
	//예외던지기 : 체크예외 - 호출한쪽에서는 반드시 catch 해야한다 
	static void fileRead(String filename) throws FileNotFoundException {	// throws 체크예외 반드시 처리해야함
		File file = new File(filename); 
		System.out.println(file);
		Scanner scan =new Scanner(file);		// exception 처리안하면 에러 
		System.out.println("파일을 읽기 성공");
		while(scan.hasNextLine()) {				// 문자가 다음 라인가지 있을때까지
			String s = scan.nextLine();
			System.out.println(s);

		}
	}
	
	public static void main(String[] args) {
		//throws : 예외 던지기
//		J2021_0423_02Throws.arrayIndex(4); //1안)
//		J2021_0423_02Throws.arrIndex_throws(4);	//2안)
//		try {
//			J2021_0423_02Throws.arrIndex_throws(4);		//2안 	//throws 던지다 던졌기때문에 여기서 예외처리해야함   1안은 많은 문장들이 잇을수 잇어 여기서 처리하느건 쉽게파악가능하다
//		}catch(ArrayIndexOutOfBoundsException e) {				
//			System.out.println("throws로 처리 : 잘못된 index ");
//		}catch(Exception e) {
//			System.out.println("예외발생");
//		}
		
		//파일 읽기 메서드 호출 
		try {
			J2021_0423_02Throws.fileRead("sample.txt");			//한글이 안읽어오면 파일명,"utf-8" 추가해야함 
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
