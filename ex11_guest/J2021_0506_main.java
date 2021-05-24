package ex11_guest;

import java.util.List;
import java.util.Scanner;

public class J2021_0506_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GuestDAO gdao = new GuestDAOImpl();
		
		//화면
		//1. 방명록 작성
		//2. 방명록 수정
		//3. 방명록 삭제
		//4. 방명록 조회 
		//5. 종료

		while(true) {
		System.out.println("=====Guest Main=====");
		System.out.println("1.방명록 작성");
		System.out.println("2.방명록 수정");
		System.out.println("3.방명록 삭제");
		System.out.println("4.방명록 전체조회");
		System.out.println("5.방명록 한명조회");
		System.out.println("9. 종료 ");
		System.out.println("====================");
		System.out.print("번호를 입력: ");
		int no = scan.nextInt();
		
		if(no==1) {
			System.out.println("이름을 작성:");
			String name = scan.next();
			System.out.println("email 작성:");
			String emali = scan.next();
			System.out.println("passwd 입력:");
			String passwd = scan.next();
			System.out.println("내용입력:");
			String content = scan.next();
			
			GuestDTO gdto = new GuestDTO(name,emali,passwd,content);
			int cnt = gdao.insert(gdto);
		}
		else if(no==2) {
			gdao = new GuestDAOImpl();
			System.out.println("수정한 번호입력: ");
			int seq = scan.nextInt();							//입력한 번호 수정 
			System.out.println("이름을 작성:");
			String name = scan.next();
			System.out.println("email 작성:");
			String emali = scan.next();
			System.out.println("passwd 입력:");
			String passwd = scan.next();
			System.out.println("내용입력:");
			String content = scan.next();
			GuestDTO gdto = new GuestDTO(seq,name,emali,passwd,content);
			int cnt = gdao.update(gdto);
		}
		else if(no==3) {
			gdao = new GuestDAOImpl();
			System.out.println("삭제할 번호입력:");
			int seq=scan.nextInt();								//입력한번호 삭제
			int cnt = gdao.delete(seq);
		}
		else if(no==4) {
			System.out.println("전체조회");
			List<GuestDTO> glist = gdao.selectList();
			System.out.println("no Name PW Email Content Date");
			for(GuestDTO g : glist) {
				
				System.out.printf("%d %s %s %s %s %s \n",g.getSeq(),g.getName(),g.getPasswd(),g.getEmail(),g.getContent(),g.getRegdate());
			}
		}
		
		
		
		else if(no==9) {
			DBConn.dbClose();
			System.out.println("프로그램 종료");
		}
		
		}
		
		
		//추가
		
//		GuestDAO gdao = new GuestDAOImpl();
//		GuestDTO gdto = new GuestDTO("홍길동","Hong@naver.com","1111","가입인사");
//		int cnt = gdao.insert(gdto);
//		System.out.println(cnt+"건추가");
		
		//수정
//		GuestDAO gdao = new GuestDAOImpl();
//		int seq = 1;							//입력한 번호 수정 
//		GuestDTO gdto = new GuestDTO(seq,"이순신","Lee@naver.com","2222","가입인사");
//		int cnt = gdao.update(gdto);
//		System.out.println(cnt+"건 수정");
		
		//삭제	
//		GuestDAO gdao = new GuestDAOImpl();
//		int seq=1;								//입력한번호 삭제
//		int cnt = gdao.delete(seq);
//		System.out.println(cnt+"건 삭제");
		
		
		//전체 조회
//		GuestDAO gdao = new GuestDAOImpl();
//		List<GuestDTO> glist = gdao.selectList();
//		System.out.println(glist);
		
		
		//한건조회
//		GuestDAO gdao = new GuestDAOImpl();
//		int seq = 1;
//		GuestDTO gdto = gdao.selectOne(seq);
//		System.out.println(gdto);
		
	
		
		//종료
		
	}

}
