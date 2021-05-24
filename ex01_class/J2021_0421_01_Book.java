package ex01_class;

import java.util.Arrays;

//책 클래스 
//필드 : 책코드(String) , 책명(String) , 단가(int) , 할인율(double)

class Book{
	
	private String bookcode;  
	private String bookname;
	private int price;
	private double sale;

	public String getBookcode() {
		return bookcode;
	}

	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public double getSale() {
		return sale;
	}

	
Book(){};//기본생성자

	public Book(String bookcode, String bookname, int price, double dicount) {
		this.bookcode =bookcode;
		this.bookname = bookname;
		this.sale= dicount;
		this.price=price;
}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}

	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", price=" + price + ", sale=" + sale + "]";
	}
	
}

//책 관리 클래스 
class Manager{
	//판매금액  합계
	//boo1:0인덱스 b002:1
	private int[] tot = new int[10];
	
	int[] getTot() {
		return tot;
	}
	
	
	
//메서드  판매금액계산
	int saleCal(Book book ,int qty , int index){		//book은 
		String bookcode = book.getBookcode();			//코드는 중복이 되지 않는다 /네임은 중복가능성 있음 
		
		int price =book.getPrice();
		double sale = book.getSale();
		
		int totPrice= (int)(price-price*sale)*qty;
		
		tot[index]+=totPrice;//합계 누적 

	
		return totPrice;
	}
}

public class J2021_0421_01_Book {

	public static void main(String[] args) {
//		Book book = new Book();

		Book[] barr = new Book[10];
		barr[0]= new Book();
		
//		barr[0].bookCal(5); 		//수량
		barr[0].setBookcode("b001");
		barr[0].setBookname("자바프로그램");
		barr[0].setPrice(30000);	//단가
		barr[0].setSale(0.2);		//할인율
		

//		System.out.println("가격은:"+book.getPrice());
//		System.out.println("판매금액:"+book.bookCal(3));
//		System.out.println("판매금액:"+book.bookCal(5));
		
		Manager mg = new Manager();
//		System.out.println(book);
//		System.out.println("판매금액은:"+mg.saleCal(barr[0], 4,0));
		
//		Book b2 =new Book("b002","파이썬100제",18000,0.1);
		System.out.println(barr[0].getBookcode()+" "+barr[0].getBookname()+" "+"판매금액:"+mg.saleCal(barr[0], 5,0));
//		System.out.println(b2.getBookcode()+b2.getBookname()+"판매금액:"+mg.saleCal(b2, 4,0));
		System.out.println(Arrays.toString(mg.getTot()));
		System.out.println("-------------------------------------------");
		
		barr[1]= new Book();
		barr[1].setBookcode("b002");
		barr[1].setBookname("파이썬");
		barr[1].setPrice(20000);	
		barr[1].setSale(0.2);	
		
		barr[2]=new Book("b003","C",10000,0.1);
		
		System.out.println("책코드 책명 판매금액");
		
		System.out.printf("%-8s %-10s %8d\n",  barr[0].getBookcode(), barr[0].getBookname(), mg.saleCal(barr[0], 5, 0));
		
		
		System.out.println(barr[1].getBookcode()+" "+barr[1].getBookname()+" "+"판매금액:"+mg.saleCal(barr[1], 5,0));
		System.out.println(barr[1].getBookcode()+" "+barr[2].getBookname()+" "+"판매금액:"+mg.saleCal(barr[2], 5,0));

		System.out.println("-------------------------------------------");
		
		
		
	}

}
