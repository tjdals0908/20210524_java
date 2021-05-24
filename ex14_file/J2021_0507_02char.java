package ex14_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class J2021_0507_02char {
	public static void main(String[] args) {

		
		//문자기반	: 문자데이터의 입출력을 다루는 스트림 
		//char형 변수 : 2byte
		//자바는 모든문자를 유니코드를 기준으로 표현
//		char c = '홍';			//자바의 char 는 2바이트
//		System.out.println(c);
		
		//문자단위로 쓰기 
//		FileWriter fw = null;
		//try-with 추가 되었다
//		try(FileWriter fw = new FileWriter("./data/charSample.txt")) { 	//finally 할필요없어짐
//			fw.write('A');
//			fw.write("자바");	//utf 한글은 3바이트
//			fw.write("good");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//파일 읽기
//		int ch;
//		try(FileReader fr = new FileReader("./data/charSample.txt")){
//			while((ch = fr.read())!=-1) {
//				System.out.print((char)ch);
//			}
//				
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//----------------------------------------------------------------
		
		//실습)좋아하는 칼라를 입력받아 파일을 만들고 
		//파일 읽어서 리스트를 출력 

		//테스트 파일 추가 
		try(FileWriter fwcollar = new FileWriter("./data/testSample.txt") ){
			fwcollar.write("레드");
			fwcollar.write("블루");
			fwcollar.write("오렌지");
			fwcollar.write("보라");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//테스트 파일 읽기
		int collarCh;
		try(FileReader fr = new FileReader("./data/testSample.txt")){
			while((collarCh= fr.read())!=-1) {
				System.out.print((char)collarCh);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		//실습2) 이름과 점수를 입력받아 파일에 저장하고 (텍스트파일은 문자이다) (문자는숫자로 변환)
		//파일을 읽어서 합계와 평균 구하기 
		//문자를 숫자로 바꾸기 
		
		//파일 추가 
		try(FileWriter fr = new FileWriter("./data/TestSumAvg.txt")){
			fr.write("홍길동,100,90,80");
			fr.write("강호동,90,80,70");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//파일 읽기
		int ch2;
		
		try(FileReader fr = new FileReader("./data/TestSumAvg.txt")){
			while((ch2=fr.read())!=-1) {
				
				System.out.print((char)ch2+" ");
				
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(Integer.parseInt("100")+ Integer.parseInt("80"));
		
		
		
	}

}
