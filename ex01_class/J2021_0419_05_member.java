package ex01_class;

//회원클래스 

class Member{
	//필드 id(string) .pw(string). 출생년도(int) ,키(double) 
	
	private String id;
	private String pw;		//읽기 불가 
	private int year;
	private double height;
	
//생성자 : 객체이름 생성될때 실행되는 메서드 
//	***** 반드시 객체가 생성될대 생성자가 실행이 되어야 한다 
//클래스의 이름과 같다 
//리턴값이 없다
	Member(String id, String pw, int year, double height){
		this.id=id;
		this.pw =pw;
		this.year =year;
		this.height=height;
	}
	
//기본생성자 
	//만약에 기본생성자가 없으면 컴파일러가 기본생성자를 생성 
	//만약에 기본생성자가 없으면 컴파일러가 기본생성자를 생성 하지 않는다
//생성자의 오버로딩	
	
 Member(){};
	
	//setter
	void setId(String id) {
		this.id = id;
	}
	void setPw(String pw) {
		this.pw =pw;
	}
	void setYear(int year) {
		this.year=year;
	}
	void setHeight(double h) {
		height =h;
	}
	
	//getter
	String getId() {
		return id;
	}
	String getPw() {		//비번은 *로 표시 
		return pw.substring(0, 2)+"**";		//두자리만 
		
	}
	int getYear() {
		return year;
	}
	double getHeight() {
		return height;
	}
	
}

public class J2021_0419_05_member {

	public static void main(String[] args) {

		Member mem1 = new Member();		//생성자 가 4개 변수가 있을때 4개를 넣어줘야 한다  안넣어주면 에러 생김  -1.기본생성자를 이용해서 객체를 생성-
		
//		mem1.setHeight(170.0);
//		mem1.setId("aaa111");
//		mem1.setPw("1234561");
//		mem1.setYear(1980);
		
		System.out.println("키:"+mem1.getHeight()
						+" "+"Id:"+mem1.getId()
						+" "+"Pw:"+mem1.getPw()
						+" "+"출생년도:"+mem1.getYear());


		Member mem2 = new Member("java","1111",1960,179.2);		//생성자 가 4개 변수가 있을때 4개를 넣어줘야 한다  -2- 생성잔 생성해서 사용  
	
		System.out.println("아이디:" + mem2.getId());
		System.out.println("비밀번호:" + mem2.getPw());
		
		
//		System.out.println("0123456".substring(3));			//beging 
//		System.out.println("0123456".subSequence(0,3));		//beging = end
		
		
		
		
		
		
		
		
	}

}
