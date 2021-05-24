package ex08_inher;


//부모클래스
class Person {
	//자식 클래스 접근 가능 
	protected String name;
	
//	private String name;
//	void setName(String name) {
//		this.name= name;
//	}
	void breath() {
		System.out.println(name+"숨쉬기");
	}
	void eat() {
		System.out.println(name+"먹기");
	}
}

//자식클래스
class Student extends Person {
	private String name = "학생";
	Student(){
		super.name=this.name;
	}
	void learn() {
		System.out.println(name+"배웁니다");
	}
}

//자식클래스 
class Teacher extends Person {
	private String name ="선생님";
	void teach() {
		super.name = this.name;
	}
	void teache() {
		System.out.println(name+"가르칩니다");
	}
}


public class J2021_0503_01inheritance {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.breath();
		s1.eat();
		s1.learn();
		
		Teacher t1 = new Teacher();
		t1.breath();
		t1.eat();
		t1.teach();
		

		

		
		
		
		
	}

}
