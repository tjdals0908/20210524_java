package ex07_jdbc.member;

import java.util.List;
import java.util.Scanner;

public class J20210427_01_member {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberDAO mdao = new MemberDAO();
		
		boolean logincheck = false; //로그인 여부 저장  while문 안에 넣으면 계속 펄스가 되어서 밖에서 입력해야함
		String login_userid = ""; //로그인 아이디
		while(true) {
			
			System.out.println("==================================");
			System.out.println("==========회원관리==["+login_userid+"]");		
			System.out.println("==================================");
			System.out.println("0.회원로그인");
			System.out.println("1.회원가입");
			System.out.println("2.회원수정");
			System.out.println("3.회원탈퇴");
			System.out.println("4.회원한명조회");
			System.out.println("5.회원전체조회");
			System.out.println("9.종 료 ");
			System.out.println("====================");
			System.out.print("번호선택:");
			int no= scan.nextInt();
			
			if(no==5) {					//회원 전체 조회 
				if(!logincheck) {
					System.out.println("로그인 후 사용 가능");
					continue; //while문 첨으로 돌아간다 
				}
				List<MemberDTO> mlist = mdao.selectList();	//리스트받아오느거 (주소를넘기는거)
				System.out.println("----------------------------------");;
				System.out.println("userid passwd birthyear regdate");
				System.out.println("----------------------------------");;
				for(MemberDTO mdto : mlist) {
					System.out.printf("%2s %5s  %6d  %11s\n",mdto.getUserid(),mdto.getPasswd(),mdto.getBirtyear(),mdto.getRegedate());
				}
			}
			else if (no==0) {
				System.out.println("아이디는?");
				String userid = scan.next();
				System.out.println("패스워드는?");
				String passwd = scan.next();
				MemberDTO mdto = mdao.selectOne(userid);
				if(mdto==null) {
					System.out.println("아이디가 존재하지 않습니다");
					logincheck = false;
					login_userid = "";
				}else {
					if(mdto.getPasswd().equals(passwd)) {
						System.out.println("로그인 성공");
						logincheck = true;
						login_userid = userid;
					}else {
						System.out.println("패스워드 불일치");
						logincheck = false;
						login_userid = "";
					}
				}
			}

			
			else if(no==4) {			//회원한명 조회 
				List<MemberDTO> mlist = mdao.selectList();
				System.out.println("----------------------");
				for(MemberDTO m : mlist) {
					System.out.println(" "+m.getUserid());
				}
				System.out.println("---------------------");
				System.out.print("UserId 입력:");
				String userid = scan.next();
				MemberDTO mdto = mdao.selectOne(userid);
				System.out.println("----------------------------------------");;
				System.out.printf("%s %s  %d  %s\n",mdto.getUserid(),mdto.getPasswd(),mdto.getBirtyear(),mdto.getRegedate());
			}
			else if(no==1) {			//추가
				String userid;
				while(true) {
					System.out.print("userid 입력:");
					userid = scan.next();	
					//아이디 중복체크
					MemberDTO mdto = mdao.selectOne(userid);
					if(mdto!=null)	// 데이터가 있다면 
						System.out.println("중복된 아이디입니다");
					else break;
				}
				System.out.print("passwd 입력:");
				String passwd = scan.next();	
				scan.nextLine(); //버퍼 처리
				System.out.print("brithyear 입력:");
				String birthyearS = scan.nextLine();	

				int birthyear = 0; //태어난해를 입력안하면 0으로 기본값
				if(!birthyearS.equals(""))	//입력했다면
					birthyear =  Integer.parseInt(birthyearS); //문자를 숫자로 변환

				MemberDTO mdto = new MemberDTO(userid,passwd,birthyear);

				int cnt = mdao.insert(mdto);
				if(cnt>0) {
					System.out.println("회원가입 완료");
				}else {

					System.out.println("회원가입 실패");
				}
			}

			else if(no==2) {			//수정
				//로그인된 아이디 정보만 수정 가능
				//기존정보 조회후 수정정보와 같이 전달 (기존정보 업데이트하고 덮었씌운다)
				
				if(!logincheck) {
					System.out.println("로그인 후 사용 가능");
					continue; //while문 첨으로 돌아간다 
				}
				
				
				
				System.out.print("userid 입력:");
				String userid = scan.next(); //pk
				
				MemberDTO mdto = mdao.selectOne(userid);
				String passwd ;
				int brithyear;
				
				System.out.print("passwd 입력:");
				passwd = scan.next();
				System.out.print("brithyear 입력:");
				brithyear = scan.nextInt();
				mdto = new MemberDTO(userid,passwd,brithyear);
				
				int cnt = mdao.update(mdto);
				
				if(cnt>0) {
					System.out.println("수정 완료");
				}else {
					System.out.println("수정 실패");
				}
				
				
				
			}
			else if(no==3) {			//탈퇴
				System.out.println("=====회원탈퇴====");
				//로그인된 아이디 정보만 삭제가능
				if(!logincheck) {
					System.out.println("로그인 후 사용 가능");
					continue; //while문 첨으로 돌아간다 
				}
				System.out.println("삭제할 userid입력:");
				String userid = scan.next();
				
				if(!login_userid.equals(userid))	{
					System.out.println("삭제권한이 없습니다");
					continue;
				}
				int cnt = mdao.delete(userid);
				if(cnt>0) {
					System.out.println("삭제 완료");
				}else {
					System.out.println("삭제 실패");
				}
				
			}
			
			else if(no==9) {
				System.out.println("시스템 종료");
				break;
			}
			
			System.out.println("----------------------------------------");;
			System.out.println("계속하시겠습니까? (y)");
			String exit = scan.next();
			if(exit.equals("y")==false)break;
		}
	}
}
