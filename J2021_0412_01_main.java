import java.util.Scanner;

public class J2021_0412_01_main {

	public static void main(String[] args) {
		//문자열의 배열을 받는다 

		System.out.println("hello world");
		System.out.println("나의나이는 "+20);
		System.out.println(10+"+"+20+"="+(10+20));

		System.out.printf("%d+%d=%d\n",10,20,10+30);

		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력:");
		int t = scan.nextInt();
		for(int i=0;i<t;i++){
			System.out.println("처음수");
			int a = scan.nextInt();
			System.out.println("두번째수수");
			int b = scan.nextInt();
			System.out.printf("case #%d: %d\n",i+1,a+b);
		}
		System.out.println("");
	}
}



