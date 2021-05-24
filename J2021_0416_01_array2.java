import java.util.Scanner;

public class J2021_0416_01_array2 {

	public static void main(String[] args) {
		2차원 배열 (다차원배열) 
		int[][] arr=new int[3][4];
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println("");
		}
		
		for(int[] a :arr) {
			for(int b: a) {
				System.out.println(b);
			}
			System.out.println(Arrays.toString(a));		//그냥 a로 출력하면 주소값으로 출력
		}

		int[][] arr=new int[3][4];	//공간 생성
		int a=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=a++;
			}
		}
		for(int[] b:arr) {		//출력 
			for(int c:b)
				System.out.printf("%d ",c);
		}
---------------------------------
		int[][] arr=new int[3][4];	//공간 생성
		int a=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=(i*4)+(j+1);
				System.out.printf("arr[%d][%d]= %d\n",i,j,arr[i][j]);
			}
두명의 학생의 국 영수 점수를 입력받아 배열에 저장하고 각자의 합계와 평균을 구하는 식
		Scanner scan = new Scanner(System.in);	
		String[] x = {"국어","영어","수학"};
		int sum=0;
		int kor=0, eng=0, math=0;

		int[][] score = {{40,88,89},{40,66,54},{40,30,40}};
		for(int i=0; i<score.length; i++) {
			kor=0; eng=0; math=0;
			for(int j=0; j<score[i].length;j++) {
				System.out.printf("arr[%d][%d]= %d\n",i,j,score[i][j]);
				kor+= score[j][0];
				eng+= score[j][1];
				math+= score[j][2];
				sum+=score[i][j];
			}
		}
		System.out.println("==============================");
		System.out.println("국어점수는:"+kor);
		System.out.println("영어점수는:"+eng);
		System.out.println("수학 점수는:"+math);
		System.out.println("==============================");	
		System.out.println("총합계:"+sum);
		System.out.println(" 평균 :"+sum/score[0].length);
		
		

		
//----------------------------------------------------------------
		

		
		
		
	}
}




















//		int[][] student = new int [3][4];
//		int a=1;
//		for(int i=0; i<student.length; i++) {
//			for(int j=0; j<student.length;j++) {
//				student[i][j]=a++;
//			}
//		}
//		System.out.println(Arrays.deepToString(student));


