package ex01_class;
//결과값이 저장되는 계산기 

class NewCal{
	//필드: maker, result(결과값) 
	
	String maker="새로운계산기";
	double result;
	
	//메서드 : 결과값에 더하는 기능 
	
	
	
	void sub(double a) {
		result -=a;
	}
	
	void div(double a) {
		result = result/a;
	}
	
	void multiple(double a) {
		result *=a;
	}
	
//오버로딩 : 메소드의 이름은 같고 매개변수 갯수나 형이 다른경우 (메서드 이름은 같아야한다)
	
	void add(double a) {
		result +=a;
	}
	
	double add(double a, double b) {
		return a+b;
	}
	
	void add(int a) {
		result +=a;
	}
	
	
	
}



public class J2021_0419_02_newcal {

	public static void main(String[] args) {
		
		int a=10,b=20,c=30;
		
		NewCal nc1 = new NewCal();
//		System.out.println(nc1.result);
//		
//		nc1.sub(b);
//		System.out.println(b+"빼기는:"+nc1.result);
//		nc1.add(c);
//		System.out.println(c+"더하기:"+nc1.result);
//		nc1.multiple(a);
//		System.out.println(a+"곱하기:"+nc1.result);
//		nc1.div(2.1);
//		System.out.println("나누기:"+nc1.result);
		
		
//		nc1.add(a, b);
		System.out.println(nc1.add(a, b));
//		nc1.add(100);

//		System.out.println(nc1.add(100));
		
	}

}
