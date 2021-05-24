package ex01_class;

//객체를 만들어 내기위한 틀 
class Dog{
	//속성 : 필드
	//자동 초기화 
	String type="강아지";
	String name="개똥이";
	int legs = 4;
	int cnt;//걸음수
	//기능 
	void walking() {
		cnt++;
		System.out.println(name+" 걷는다");
	}
	void eat() {
		String food="사료";				//지역변수   메서드 안에 있는건 지역변수 
		System.out.println(name+"먹는다");
	}
}
public class J2021_0416_03class {

	public static void main(String[] args) {
		//클래스 
		 Dog d1 = new Dog();
		 System.out.println(d1.type);
		 System.out.println(d1.legs);
		 d1.walking();
		 System.out.println(d1.cnt);
		 d1.eat();

	}

}
