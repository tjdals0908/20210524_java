package ex01_class;
	
	//계산기 

class Cal{
	//속성
	String maker="국제계산기";
	
	//기능: 메서드
	int add(int a, int b) {	//더하기: 더한값을 리턴
		int r = a+b;
		return r;
	}
	int minus(int a, int b) {	//빼기 
		return a-b;
	}

	int multiple(int a, int b) {
		return a*b;
	}
	
	double div(int a,int b) {
		return (double)a/b;
	}

}



public class J2021_0419_01_Cal {

	public static void main(String[] args) {
		Cal c1 = new Cal();
//		System.out.println(c1.maker);
		
		int a=20,b=3;
		c1.add(a, b);
		int rAdd = c1.add(a, b);
		System.out.println("더하기:"+rAdd);
		
		int rMinus= c1.minus(a, b);
		System.out.println("빼기:"+rMinus);
		
		int rMul = c1.multiple(a, b);
		System.out.println("곱하기:"+rMul);

		System.out.printf("나누기:%.2f",c1.div(a, b));
	}

}
