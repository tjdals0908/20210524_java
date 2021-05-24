package ex08_inher;

class MyCar{
	static final String name = "제네시스";
	
}

//타이어 부품
class Tire extends MyCar{
	private String company;	//회사이름

	public Tire(String company) {
		super();
		this.company = company;
	}
	@Override
	public String toString() {
		return "타이어회사 :" + company ;
	}
	
}
//미러부품
class Mirror extends MyCar{
	private String company;

	public Mirror(String company) {
		super();
		this.company = company;
	}

	@Override
	public String toString() {
		return "미러회사명: "+ company ;
	}
		
}


//수리업체 
class Repair{
	//부품을 체인지 해주는 메서드
	
	//다형성을 이용
	void changePart (MyCar mycar) {				//부모 MyCar 이용 다형성
		System.out.println(mycar+"교체 완료");
	}

	
	//타이어교체 
//	void changePart (Tire t){			
//		System.out.println(t+"교체 완료");
//	}
	//미러교체
//	void changePart(Mirror m) {
//		System.out.println(m+"교체 완료");
//	}
}



public class J2021_0504_02Car {
	public static void main(String[] args) {

//		MyCar.name="";	final 로해서 이름을 바꿀수 없음
		System.out.println(MyCar.name);
	
		Tire t1 = new Tire("금호");
	//	System.out.println(t1);
		Mirror m1 = new Mirror("모비스");
		//System.out.println(m1);
		
		Repair r1 = new Repair();
		r1.changePart(t1);
		r1.changePart(m1);
		System.out.println();
	}

}
