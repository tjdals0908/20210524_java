import java.util.Scanner;

public class ee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		String[] x = {"국어","영어","수학"};
		int sum=0;
		int kor=0, eng=0, math=0;

		int[][] score = {{4,88,89},{42,66,54},{49,30,40}};
		
		for(int i=0; i<score.length; i++) {
			kor=0; eng=0; math=0;
			for(int j=0; j<score[i].length;j++) {
		System.out.printf("arr[%d][%d]= %d\n",i,j,score[i][j]);
//				kor+= score[j][0];
				kor = score[i][0];
			}
			System.out.println("국어점수는:"+kor);
		}
		
		System.out.println("==============================");
		System.out.println("==============================");	

	}

}
