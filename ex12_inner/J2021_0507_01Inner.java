package ex12_inner;


//내부클래스 
class OuterClass{
	class InnerClass{
		public String toString() {
			return "인스턴스 클래스";
		}
	}
	
	InnerClass inner = new InnerClass();		//필드
	
	void method1() {
		InnerClass localInner = new InnerClass();		//변수
		System.out.println(localInner);
	}
	
	class InnerClassNew{
		public String toString() {
			return "새로운 인스턴스 클래스";
		}
	}
}



public class J2021_0507_01Inner {

	public static void main(String[] args) {

		
		OuterClass outer = new OuterClass();
		System.out.println(outer.inner);	//이너클래스 출력하면 투 스트링에 있는게 출력
		
		outer.method1();	//메서드1실행하면 그안에 
		
		//inner클래스 생성
		OuterClass.InnerClassNew innerNew =  outer.new InnerClassNew();    //outer 클래스에서 new붙여서 내부클래스명을 붙이면 생성가능 
		System.out.println(innerNew);
		
		
	}

}








