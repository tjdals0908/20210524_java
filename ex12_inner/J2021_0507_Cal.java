package ex12_inner;

interface Cal{
	int add(int a,int b);
//	int sub(int a, int b);

}





public class J2021_0507_Cal {
	public static void main(String[] args) {
		
		Cal c = new Cal() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
//			@Override
//			public int sub(int a, int b) {
//				return a-b;
//			}
		};

			System.out.println("더하기값: "+c.add(3, 4));
//			System.out.println("빼기는: "+c.sub(10, 5));

			
			Cal cal2 = (a,b)->a+b; //람다식 (간단하게 메서드생성)
						//	{a+b,...} 수행할게 많으면 {}입력해서 작성
			
			System.out.println(cal2.add(1, 5));
			
			
			
			
	}
}