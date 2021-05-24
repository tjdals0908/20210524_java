package ex01_class;

//상품 클래스 (item)

//필드 itemcode itemname(이름) , itemprice(가격) 

//메서드 : 수량을 넣으면 이상품이 몇개 
//판매금액 리턴  -매개변수가 판매수량
//린터값이 판매금액 

class Item{
	private String itemcode ;	//private 는 보안 내부에서만 접근가능 
	private String itemname ;
	private int itemprice ;
	
	int amount(int a) {
		return a*itemprice;
	}
	//메서드를 이용해서 접근가능
	
	void setItemcode(String itemcode) {	//set을 이용해서 넣는데 set뒤에 변수명 앞에는 대문자 
		this.itemcode = itemcode;
	}
	void setItemname(String itemname) {
		this.itemname = itemname;
	}
	void setPrice(int price) {
		this.itemprice = price;
	}
	
	//getter 읽어드리는 메서드 
	
	String getItemcode() {
		return itemcode;
	}
	String getItemname() {
		return itemname;
	}
	int getPirce() {
		return itemprice;
	}
	
	
	
	
}

public class J2021_0419_04_item {

	public static void main(String[] args) {
		
		Item i1 = new Item();
		i1.setItemcode("8801");
		i1.setItemname("사이다");
		i1.setPrice(1000);

		
//		int amount = i1.amount(5);
		System.out.println(i1.getItemcode()+"판매금액:"+i1.amount(5));
		System.out.println(i1.getItemcode()
						+" "+i1.getItemname()
						+" "+i1.getPirce()
						+" 판매금액:"+i1.amount(5));
		
		Item i2 = new Item();
		i2.setItemcode("8802");
		i2.setItemname("콜라");
		i2.setPrice(1000);
		
		System.out.println(i2.getItemcode()
				+" "+i2.getItemname()
				+" "+i2.getPirce()
				+" 판매금액:"+i2.amount(5));
		
//		System.out.println(i2.itemname+"판매금액:"+i2.amount(10));
		
	}

}
