package ex01_class;

public class J2021_0420_04_main {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		for(String s: args) {
			System.out.println(s);
		}
		
		
//실습)id와 pw를 아규먼트로 받아서 
//만약 id가 java 이고 pw가 1111 이면 '관리자 모드', 아니면 '일반사용자 모드' 출력
		
		
		if (args.length > 1  && args[0].equals("java") && args[1].equals("1111"))
			System.out.println("관리자 모드");
		else
			System.out.println("일반사용자 모드");

//		System.out.println(Integer.parseInt(args[4]) + 200);

	}

}


