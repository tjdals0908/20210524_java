import java.util.ArrayList;
import java.util.Arrays;

public class J2021_0416_02_score {

	public static void main(String[] args) {
//		실습)국영수 평균 합계
		
		Scanner scan = new Scanner(System.in);

		String[] sub = {"국어","영어","수학"}; 
		int[][] score = new int[2][3]; //점수배열
		//타이틀 
		
		while(true) {
			System.out.println("===================");
			System.out.println(" <성적관리프로그램> ");
			System.out.println("===================");
			System.out.println("1.성적등록");
			System.out.println("2.학생별합계등록:");
			System.out.println("3.과목별 합계/평균 ");
			System.out.println("0번 종료");
			System.out.println("-------------------");
			System.out.println("선택 번호는)?");
			int choise = scan.nextInt();

			if(choise==1) {
				//점수입력받기
				System.out.println("1번선택");
				for (int i=0; i<score.length; i++) {
					System.out.printf("[%d]번\n", i+1);

					for(int j=0; j<score[i].length; j++) {
						System.out.printf("%s: ", sub[j]);
						score[i][j] = scan.nextInt();
						System.out.println("----------------------");
					}
				}
			}
			else if(choise==2) {

				//학생별로 합계, 평균 출력
				for (int i=0; i<score.length; i++) {
					int sum=0;
					for(int j=0; j<score[i].length; j++) {
						//System.out.println(s);
						sum += score[i][j];
					}
					//합계
					System.out.printf("[%d]합계:%d 평균:%.2f\n",i+1,sum,(double)sum/score[i].length );
				}
				System.out.println("----------------------");
			}

			else if(choise==3) {
				//과목별로 합계, 평균 출력
				for(int j=0; j<score[0].length; j++) {
					int sum=0;
					for(int i=0; i<score.length; i++) {
						//System.out.println(score[i][j]);
						sum += score[i][j];
					}
					System.out.printf("[%s]합계:%d 평균:%.2f\n",sub[j],sum,(double)sum/score.length );
					System.out.println("-------------------");
				}
			}
			else if(choise==0) {
				System.out.println("종료");break;
			}
			else {
				System.out.println("잘못된번호 입니다");
	
			}
			
			scan.nextLine();	//엔터 버퍼 지우기 
			
			System.out.println("종료?(q)");
			
			scan.nextLine();	//홀딩
			
		}
		
 성적관리 프로그램
		Scanner sc = new Scanner(System.in);
		String[] sub = {"국어","영어","수학"}; 
		int[][] score = new int[2][3]; //점수배열
		
		while (true) {
			//타이틀
			System.out.println("-------------------------------");
			System.out.println("국제 성적 관리 프로그램 V1.0.0");
			System.out.println("-------------------------------");
			System.out.println("1.성적등록");
			System.out.println("2.학생별 합계/평균");
			System.out.println("3.과목별 합계/평균");
			System.out.println("9.종료");
			System.out.println("---------------------");
			System.out.print("번호는?");
			int no = sc.nextInt();
			
			switch(no) {
			case 1:
				//점수입력받기
				for (int i=0; i<score.length; i++) {
					System.out.printf("[%d]번\n", i+1);
					
					for(int j=0; j<score[i].length; j++) {
						System.out.printf("%s?", sub[j]);
						score[i][j] = sc.nextInt();
					}
				}
				System.out.println("----------------------");	
				break;
			case 2:
				//학생별로 합계, 평균 출력
				System.out.println("-----------------");
				System.out.println("★★★학생별 출력★★★");
				System.out.println("-----------------");				
				for (int i=0; i<score.length; i++) {
					int sum=0;
					for(int j=0; j<score[i].length; j++) {
						//System.out.println(s);
						sum += score[i][j];
					}
					//합계
					System.out.printf("[%d]합계:%d 평균:%.2f\n",
							i+1,sum,(double)sum/score[i].length );
				}
				System.out.println("----------------------");		
				break;
			case 3:
				//과목별로 합계, 평균 출력
				System.out.println("-----------------");
				System.out.println("★★★과목별 출력★★★");
				System.out.println("-----------------");
				for(int j=0; j<score[0].length; j++) {
					int sum=0;
					for(int i=0; i<score.length; i++) {
						//System.out.println(score[i][j]);
						sum += score[i][j];
					}
					System.out.printf("[%s]합계:%d 평균:%.2f\n",
							sub[j],sum,(double)sum/score.length );
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				System.exit(0); //프로그램 종료
				
			default :
				System.out.println("잘못된 번호");
			}

			sc.nextLine(); //버퍼 비우기
			System.out.println("엔터를 누르세요");
			sc.nextLine(); //홀딩

		}		
		
//---------------------------------------------------------------
//실습)do while문 
		
		Scanner scan = new Scanner(System.in);

		String[] sub = {"국어","영어","수학"}; 
		int[][] score = new int[2][3]; //점수배열
		//타이틀 
		
		
	do {
		System.out.println("===================");
		System.out.println(" <성적관리프로그램> ");
		System.out.println("===================");
		System.out.println("1.성적등록");
		System.out.println("2.학생별합계등록:");
		System.out.println("3.과목별 합계/평균 ");
		System.out.println("0번 종료");
		System.out.println("-------------------");
		System.out.println("선택 번호는)?");
		int choise = scan.nextInt();
		
	}while(choise!=0);
		
		
		배열의 복사
		얇은 복사 : 주소만 복사 
		int[] src= {1,2,3,4,5};
		int[] dest = src;
		
		System.out.println(src);
		System.out.println(dest);
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
		System.out.println("-------------------------");
		
		src[1]=20;
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
		
		깊은복사
		int[] src = {1,2,3,4,5};
		int[] dest = new int[6];
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
		
		for(int i=0; i<src.length;i++) {
			dest[i] =src[i];
		}
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
		
		dest[5]=6;
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
		
		System.out.println("------------------");
		src=dest;
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
		프레이워크를 이용한 데이터 추가 
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		System.out.println(arr);
		//배열의 깊은 복사 
		int[] src= {1,2,3,4,5};
		int[] dest= {0,0,0,0,0};
		
		System.arraycopy(src, 2,    dest,  0, 2);
						(src, N 번인덱스부터, dset의 ,n번 인덱스시작 ,몇개를복사할건지)
								
		
	}

}
