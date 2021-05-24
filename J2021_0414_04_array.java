import java.util.Arrays;
import java.util.Scanner;

public class J2021_0414_04_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		//배열
//		int[] arr;	//선언은 statck에 
//		//배열은 heap에 생성
//		//자바는 동적 배열 
//		
//		arr= new int[5];	//객체생성해서 주소를 arr에 대입 
//		arr[0] =10;
//		//배열은 순서가 있다 0을 입력하면 1을입력해야된다 5로 바로 입력하면 안된다 
//		arr[5]=5;	//5번 index는 없다 
//		System.out.println(arr[0]);
		
	//선언하고 객체를 생성
//		int[] arr = new int[5];	//객체생성
//		//1-5까지 값을 대입
//		for(int i=0; i<arr.length;i++) {
//			arr[i]=(i+1)*10;
//			System.out.println(arr[i]);
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);		//heap에 만들어지니간 자동 초기화 		
//		}
	//선언과 초기화 
//		int[] arr =new int[] {10,20,30};	//괄호안에 입력시에는 []안에 숫자는 생략

//		int[] arr = {10,20,30};	//new int 생략가능
//		
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		//for~each문 
//		for(int a: arr) {				//arr안에있는걸 각각 대입 시키겠다 
//			System.out.println(a);
//		}
//
//		//Arrays 클래스 이용 문자열 출력 <참고> toString 은:오버로딩 이다 
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr);			//arr은 toString 안써도 된다 why? 자바에서는 -< println은 tostring 으로 실행해준다>-
//		System.out.println(arr.toString());
		
		
//실습 
//		int[] score = {88,89,77};
//		int sum=0;
//		for(int a:score) {
//			System.out.println(a);
//			sum+=a;
//		}
//		System.out.println("합계:"+sum);
//		System.out.println("평균:"+sum/score.length);
//		System.out.println("평균:"+(double)sum/score.length);

//실습)3명의 학생의 점수를 입력받아서 합계평균
//	Scanner scan = new Scanner(System.in);	
//	int[] arr = new int[3];
//	int sum=0;
//	
//	for(int i=0; i<arr.length;i++) {
//		System.out.printf("%d)점수는?",i+1);
//		int a = scan.nextInt();
//		arr[i]=a;
//		sum+=a;
//	}
//	System.out.println(Arrays.toString(arr));
//	System.out.printf("합계: %d / 평균: %.1f",sum,(double)sum/arr.length);
		
		
		//문자열 배열
//		String[] arr1 = new String[3];
//		String[] arr = 	{"java","pthon","c"};
//		System.out.println(arr);
//		System.out.println(arr1[0]);
//		
//		for(String a: arr) {			//스트링타입을 넣어달라고 했기때문 스트링 출력 
//			System.out.println(a);
//		}
		
//실습) 좋아하는 칼라3개 를 입력받아 배열에 저장하고 출려
//		Scanner scan = new Scanner(System.in);
//		
//		String[] collar =new String[3];
//		for(int i=0; i<collar.length; i++) {
//			System.out.printf("%d)칼라는?",i+1);
//			String a= scan.next();	//but scan.nextLine는 띄어 쓰기 값도 포함
//			collar[i]=a;
//		}
//		System.out.println(Arrays.toString(collar));
//		System.out.println(collar);
//	
//		for(String a:collar) {
//			System.out.println(a);
//		}
		
//피보나치수열 n개 구하기 
//0,1,1,2,3,5,8,13..20
		
//		int n= scan.nextInt();	//입력값
//		int[] fibo =new int[n];
//		
//		fibo[0]=1; 	fibo[1]=2;
//		System.out.println(fibo[0]);
//		System.out.println(fibo[1]);
//		
//		for(int i=2; i<fibo.length; i++) {
//			fibo[i]=fibo[i-2]+fibo[i-1];
//				System.out.println(fibo[i]);
//		}
//		
//		for(int a:fibo) {
//			if(a<20){
//				System.out.printf("%d ",a);
//			}
//		}
		
//실습) 시험 체점 프로그램 1.2,3,4,5 번까지 정답배열 2.4.3.4 . 100저만점
		
//		int[] right = {1,2,3,4,6};
//		int[] answer= {2,2,8,4,5};
//		
//		
//		int sum=0;
//		for(int i=0; i<right.length;i++) {
//			if(right[i]==answer[i]) {
//				sum+=100/right.length;
//				System.out.println(i+1+"번은 정답입니다. "+right[i]+"입니다");
//			}
//			else {
//				System.out.println(i+1+"번은 오답입니다. 정답은 "+right[i]+"입니다");
//			}
//		}
//		System.out.println("-----------------------------");
////		System.out.println(Arrays.toString("정답은:"+right));
//		System.out.print("정답은:");
//		System.out.println(Arrays.toString(right));
//		System.out.print("답변은:");
//		System.out.println(Arrays.toString(answer));
//		System.out.println("총점수는:"+sum+"점");
		
		
//실습 최소가 최대값 출력
//		int[] arr = {4,60,7,2,1,10};
//		int max = arr[0];		int min = arr[0];
//		
//		for(int i=1; i<arr.length;i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}else if(min>arr[i]) {
//				min=arr[i];
//			}
//		}
//		System.out.println("min: "+min);
//		System.out.println("max: "+max);
		
//실습)선택정렬 (오름차순 정렬)
//		int[] arr = {1,2,3,51,6,7};
//		int[] sortArr= new int[arr.length];
//		
//		int i =0, j=0, temp;
//		
//		for( i=0; i<arr.length;i++) {
//			for(j=i+1; j<arr.length;j++) {
//				
//				if(arr[i]> arr[j]) {	//오름차순 
//					temp= arr[i];		//높으면 버리기
//					arr[i] = arr[j];	//j는 낮기때문에 i에 대입
//					arr[j]= temp;		
//				}
//				
////				if(arr[i]<arr[j]) {	//내림차순
////					temp=arr[i];
////					arr[i]=arr[j];
////					arr[j]=temp; 
////				}
//				
//			}
//		}
//		for (i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);
//		}

		
//로또 번호 맞춘 갯수 출력
		int[] no= {9,12,21,5,33,42};
//로또 번호 6개 만들기 
		int[] lotto[];
		
		for(int r=0 ;r<6; r++) {
			int a =(int)(Math.random()*45+1);
			System.out.println(a);
		}
		
				
	
		
		
		
		

		
	
		
		
		
//랜덤으로 로또번호 메서드 랜덤으로 6개번호 int[] lotto; 6개번호중 1개 맞는지 확인 6개번호 맞는지 
		//맞춘개수 출력 
		
		
		
		
		
	}	
	
}
	
