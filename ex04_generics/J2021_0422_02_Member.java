package ex04_generics;

//멤버 클래스 
//필드 아이디,비밀번호 
class Member{
	private String userid;
	private String password;
	Member(){};
	
	public Member(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "Member [userid=" + userid + ", password=" + password + "]";
	}
	
}
	
//vip 
// 필드: 아이디(userid) 비밀번호(password) 할인율(rate) 
	class Vip{
		private String userid;
		private String password ;
		private double rate;
		Vip(){};
				
		public Vip(String userid, String password, double rate) {
			super();
			this.userid = userid;
			this.password = password;
			this.rate = rate;
		}

		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public double getRate() {
			return rate;
		}

		public void setRate(double rate) {
			this.rate = rate;
		}


		public String toString() {
			return "Vip [userid=" + userid + ", password=" + password + ", rate=" + rate + "]";
		}
	
}
	
//로그인 관리 클래스
	class LoginManager<T>{		//제네릭으로 사용 (호출받으면 클래스 타입전체를 받아들일수 있다 )
		//입장 메서드

		void loginMember(T member) {						//일반회원	>> 제네릭 으로 
			System.out.println(member);
			if(member instanceof Member) {				//t제네릭의 멤버 형이라면 포함되어있다면
				System.out.println(((Member)member).getUserid()+"님 로그인");   // 멤버형으로 컨버젼 (형변환)해서 getuserid를 찍어달라 
			}
			if(member instanceof Vip) {			
				System.out.println(((Vip)member).getUserid()+"님 로그인");		//지역변수 t의 멤버를 받아 vip 형변환시켜 getuserid 호출
			}

		}

	}
	
//	void loginVip(Vip vip) {								//vip 회원
//		System.out.println(vip.getUserid()+"님 로그인");				>> vip 회원으로 아니면 실버회원 추가 할 필요없다 
//	}
	


public class J2021_0422_02_Member {

	public static void main(String[] args) {

		Member member =new Member("java","1111");
		Vip vip = new Vip("hong","2222",0.1);
		
//		System.out.println(member);
//		System.out.println(vip);
		
		LoginManager<Member> lm = new LoginManager();
		lm.loginMember(member);
		
		
		LoginManager<Vip> lmvip = new LoginManager();
		lmvip.loginMember(vip);
	}

}
