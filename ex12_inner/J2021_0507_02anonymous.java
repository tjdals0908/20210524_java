package ex12_inner;

class Dog{
	
	void walking() {
		System.out.println("걸을수있다 ");
	}
//	void eating() {	}
	
}

//class HuntDog extends Dog{
//	
//	void walking() {
//		System.out.println("걸을수 없다");
//	}
//
//}







public class J2021_0507_02anonymous {
	public static void main(String[] args) {

		
//		HuntDog hdog = new HuntDog();
//		hdog.walking();
		
		//익명클래스 : 부모의 클래스로 재정의 해서 생성
		Dog hdog = new Dog() {
			@Override
			void walking() {
				System.out.println("걸을수 없다");
			}
//			void eating() {
//				System.out.println("먹는다");
//			}
			
		}; 
		hdog.walking();
		
		
	}

}
