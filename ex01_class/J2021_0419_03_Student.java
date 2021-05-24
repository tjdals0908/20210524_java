package ex01_class;

import java.util.Arrays;

//학생클래스
//필드: 반(group), 이름(name, 점수(java,python,c) , 합계 (sum) 

//메소드:합계계산 sumcal , 평균을 계산해서 반환 avg

class Student{
	
	
	
	String group="1반";
	String name="홍길동";
	int sum;
	String[] score1 = {"자바","파이썬","C"};
	int[] score = {61,73,80};
	
	
	//메서드 오버로딩 (over loading)
	
	//call by value
	void sumCal(int a, int b, int c) {		//더하기
		sum=0;
		score[0]=a;	score[1]=b;	score[2]=c;
		sum = a+b+c;
	}
	
	//call by reference
	void sumCal(int[] score) {
		sum=0;
		for (int i=0; i<score.length;i++) {
			sum+=score[i];
		}
	}
	
	double avgCal() {		//평균
		return (double)sum/score.length;
	}
	
}



public class J2021_0419_03_Student {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.sumCal(79,88,88);
		System.out.println(Arrays.toString(s1.score));
		
		System.out.println("합계:"+s1.sum);
		s1.sumCal(new int[] {73,99,33});
		System.out.println("합계"+s1.sum);
		
//		double sum = s1.sumCal(s1.score[0],s1.score[1], s1.score[2]);
//		System.out.println(sum);
//		double avg =s1.avg(s1.score[0],s1.score[1], s1.score[2]);
//		System.out.println(avg);
//		
		
		System.out.printf("평균은:%.2f",s1.avgCal());
		
		
		
		

	}

}
