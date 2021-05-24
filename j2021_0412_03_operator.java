
public class j2021_0412_03_operator {

	public static void main(String[] args) {

		//연산자
		
		//삼항연산자
//		int a=10;
//		String s1 =(0<a)? "양수":"음수";
//		System.out.println(s1); 		//주소를 가지고 있는 변수이다 
		
		// 두수 중에 큰수 찾아내기 
//		int a=50,b=30;
//		
//		int max= (a>b)? a:b;
//		System.out.println("max: "+max);
		
//실습1) 세수 중에 큰 값 골라내기
		int a=50,b=100,c=40;
		
//		int max = (a>b)? a:b ;
//		max = (max>c)? max:c;
		
		int max =a>b?(a>c)?	 a:b : (b>c)?b:c ;
		System.out.printf("max: %d\n",max);
					
		
		
//실습2 짝홀수 출력하기
		int odd=10;

		String s= odd%2==0? "짝수":"홀수";
			System.out.println(s);
		
					
//실습3 세과목이 모두 60점 이 넘으면 합격 아니면 불학격 
		int kor=90,eng=85, math=60;
		
		String sum =(kor>=60 && eng >=60 && math>=60)? "합격":"불합격";
		System.out.println(sum);
		
	}
}


//		if(60<sum) {
//			System.out.println("합격");
//		}else
//			System.out.println("불합격");