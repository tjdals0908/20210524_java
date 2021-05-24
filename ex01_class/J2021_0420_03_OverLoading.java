package ex01_class;

import java.util.Arrays;

class Sum{
	private int sum;
	
//메서드 두수를 매개변수로 받아서 합을 리턴하는 메서드
	int add(int a ,int b) {
		sum= a+b;
		return sum;
	}
	
//세 정수를 매개변수로 받아서 합을 리턴하는 메서드
	int add(int a ,int b, int c) {
		sum= a+b+c;
		return sum;
	}
	
//배열을 매개변수로 받아서 합을 리턴하는 메서드 - 마지막 index에 넣고 리턴하는 메서드
	int add(int[] arr) {
		int sum=0;
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1; i++) {
			sum+=arr[i];
		}
		arr[arr.length-1] = sum; //마지막은 index값이 0이다/ 마지막 indext에 합계넣기
		return sum;
	}
	
//가인인자 
	int add1(int...arr) {			//...은 가변인자로 해석 (배열로 해석을한다) - 가변인자는 매개변수가 몇개가되든 상관이없다 
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
			
		return sum;
	}
	
//문자열을 가인인자로 받아서 출력해주는거 	
	
	void variableString(String...arr) {

		//	for(int i=0; i<arr.length; i++) {
		//		System.out.println(arr[i]);
		//	}
		for(String a :arr) {
			System.out.print(a);
		}

	}
}

public class J2021_0420_03_OverLoading {
	public static void main(String[] args) {
		
		Sum s1 = new Sum();
		
		System.out.println(s1.add(10, 20));
		System.out.println(s1.add(10, 20, 30));
		System.out.println("--------------------");
		
		//배열
		int[] arr = {10,20,30,40,0};
		System.out.println("합계:"+s1.add(arr));
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------");
		
		//가인인자
		System.out.println(s1.add1(10,20,30,40,50,6));	//가변인자 매개변수는 몇개가 되든 상관없다 
		s1.variableString("a","b","c","d","e");
		
		
		
		
	}

}
