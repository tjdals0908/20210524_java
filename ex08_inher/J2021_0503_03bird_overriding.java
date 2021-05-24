package ex08_inher;

//부모클래스
//class 앞에 final 붙이면 상속 불가 
class Birid{
	
	private String name;
		
	public Birid(String name) {
		this.name = name;
	}
	
//	final void fly() {		메서드 앞에 붙이면 재정의 불가 
//		System.out.println(name+"알을 낳는다");
//	}
	
	void born() {
		System.out.println(name+"알을 낳는다");
	}
	void fly() {
		System.out.println(name+"날수 있다");
	}
	
}

//참새
class sarrow extends Birid{
	
	sarrow(String name) {
		super(name);	//부모의 생성자를 실행 
	}
	private String name = "참새";
	
}

//타조
class Ostrich extends Birid{
	
	public Ostrich(String name) {
		super(name);	//부모의 생성자를 실행 
	}

	private String name = "타조";
	
	@Override		// 있는게 좋다 
	void fly() {	//오버라이딩 : 메서드를다시정의 , 부모메서드명 이름과 같아야 한다 
		System.out.println(name+"날수 없다");
	}
	//오버라이딩 : 부모클래스의 메소드를 작성해서 재정의 하는것
//	void fly() {							//fly의 메서드가 자식,부모 두군데 있는데 자식메서드로 정의 된다 
//		System.out.println("날수 없다");	
//	}
	

}

public class J2021_0503_03bird_overriding {

	public static void main(String[] args) {

		sarrow s1 = new sarrow("참새");
		
		s1.born();
		s1.fly();
		System.out.println("--------------------");
		Ostrich o1 = new Ostrich("타조");
		o1.born();
		o1.fly();
		
//		Birid b1 = new sarrow("참새");
//		Birid b1 = new Ostrich("타조");
		
		Birid o2 =new Ostrich("타조"); //업캐스팅 (부모형으로 자동 형변환)
		
		Ostrich o3 = (Ostrich)o2;	// 다운 캐스팅(수동) (버드형 부모(o2) 자식형으로 형변환 )

	
		
		
	}
	

}
