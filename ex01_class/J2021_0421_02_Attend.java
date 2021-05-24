package ex01_class;

import java.text.SimpleDateFormat;
import java.util.Date;
//수강생 클래스 
//필드 : 코드, 이름 , 수강과목 
class Attendee{
	
	private String attendeeCode;
	private String attendeeName;
	private String attendeeSub;
	
	Attendee(){}; //기본생성자
	
	
	public Attendee(String attendeeCode, String attendeeName, String attendeeSub) {
		super();
		this.attendeeCode = attendeeCode;
		this.attendeeName = attendeeName;
		this.attendeeSub = attendeeSub;
	}

//setter getter	
	public String getAttendeeCode() {
		return attendeeCode;
	}
	public void setAttendeeCode(String attendeeCode) {
		this.attendeeCode = attendeeCode;
	}
	public String getAttendeeName() {
		return attendeeName;
	}
	public void setAttendeeName(String attendeeName) {
		this.attendeeName = attendeeName;
	}
	public String getAttendeeSub() {
		return attendeeSub;
	}
	public void setAttendeeSub(String attendeeSub) {
		this.attendeeSub = attendeeSub;
	}
	
	
	public String toString() {
		return "Attendee [attendeeCode=" + attendeeCode + ", attendeeName=" + attendeeName + ", attendeeSub="
				+ attendeeSub + "]";
	}
	
	
	
	
}

//수강클래스 :LetureManager
//메서드 : 입실관리(출력)  , 퇴실 출력  
class LeturneManager{
	//클래스필드, 클래스변수
	//클래스가 메모리에 로딩될때 생성, 프로그램이 종료시 소멸
	//static final: 상수 (반드시 선언과 동시에 초기화 ) why? 나중에 못바꾸니간 
	
	
	static final String collageName="국제학원";
	//인스턴스필드, 객체변수 
	//인스턴스 생성시 생성, 객체소멸시 소멸 
	static final int buildYear =2001;
	static final int day ;		//오늘 날짜
	
	static{	//static 블록을 이용해서 초기화
		//db나 파일이나 시스템에서 가져오거나 등등 ...
		
		Date now = new Date();	//현재날짜 가져오기 
		SimpleDateFormat sf = new SimpleDateFormat("dd");
		day= Integer.parseInt(sf.format(now));
		
	}
	
	//자바반 홍길동 입실 
	static  void enter(Attendee att){	//지역변수 
//		LeturneManager.day=day;					//static 안에서는 인스턴스 사용 불가 
		System.out.println(day+"일 "+att.getAttendeeSub()+" "+att.getAttendeeName()+"님 입실"); 
	}
	//자바반 홍길동이 퇴실
	static void exit(Attendee att ){
		System.out.println(att.getAttendeeSub()+" "+att.getAttendeeName()+"님 퇴실"+LeturneManager.day);
	}
	
}


public class J2021_0421_02_Attend {

	public static void main(String[] args) {
		
//		LeturneManager.collageName="신림";	//fianl 로 한거는 수정불가 
		
		
		System.out.println(LeturneManager.collageName);		//static 필드 (클래스필드) 객체생성없이 사용 가능 
		System.out.println(LeturneManager.buildYear+"개원");
		//코드, 이름 , 수강과목 
		
		Attendee a1 =new Attendee();
		
		a1.setAttendeeCode("A001");
		a1.setAttendeeName("홍길동");
		a1.setAttendeeSub("JAVA");
		System.out.println(a1);
		
//		LeturneManager ma = new LeturneManager();		//객체생성하고 
//		ma.enter(a1);									//이 객체안에 만들어진다
//		ma.exit(a1);									//이 객체안에 만들어진다

		
		LeturneManager.enter(a1);
		LeturneManager.exit(a1);
		
		
	}
}
