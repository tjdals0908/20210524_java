package ex12_inner;

interface Item{
	void namePrint(String itemname);
	
}

class ItemImpl implements Item{


	public void namePrint(String itemname) {
		System.out.println(itemname);
	}
	
}



public class J2021_0507_04Item {

	public static void main(String[] args) {
		
//		Item Item = new ItemImpl();
//		Item.namePrint("새우깡");
		
		Item it = new Item() {
			public void namePrint(String itemname) {
				System.out.println(itemname);
			}
		};
		
		it.namePrint("새우깡");
		
	}
	
	
	
	
	

}
