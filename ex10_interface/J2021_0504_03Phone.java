package ex10_interface;

import java.util.Scanner;

interface Call{
	void call();
}

interface Photo {
	void photo();
}

interface Memo{
	void memo();
}

//전화 사진찍기 
class Phone implements Call,Photo{
	@Override
	public void photo() {
		System.out.println("옛폰사진 찍기");
	}
	@Override
	public void call() {
		System.out.println("옛폰전화 받기");
	}
}

//전화 사진찍기 메모
class NewPhone implements Call,Photo,Memo{
	@Override
	public void memo() {
		System.out.println("뉴메모 하기");
	}
	@Override
	public void photo() {
		System.out.println("뉴사진 찍기");
	}
	@Override
	public void call() {
		System.out.println("뉴전화 하기");
	}
}

//폰사용
class PhoneUse{
	void call(Call call) {
		call.call();
	}
	void photo(Photo photo) {
		photo.photo();
	}
	void memo(Memo memo) {
		memo.memo();
	}
}

public class J2021_0504_03Phone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Phone phone = new Phone();
		NewPhone newp = new NewPhone();
		
		PhoneUse use = new PhoneUse();
		use.call(phone);
		use.photo(phone);
		System.out.println();
		use.memo(newp);
		use.photo(newp);
		use.call(newp);
	//	use.memo(phone);	//안된다
		
		
		
//		while(true) {
//		System.out.println("-------------");
//		System.out.println("1. 사진 찍기");
//		System.out.println("2. 전화 하기");
//		System.out.println("3. 메모 하기");
//		System.out.println("--------------");
//		System.out.print("번호 선택:");
//		int no = scan.nextInt();
//		if(no==1) {
//			use.photo(newp);
//		}
//		if(no==2) {
//			use.call(newp);
//		}
//		if(no==3) {
//			use.memo(newp);
//		}
//		System.out.println("계속하시겠습니까? (y)");
//		String exit = scan.next();
//		if (exit.equals("y")==false) break;
//		
//		}
		
		
		
		
	}

}





