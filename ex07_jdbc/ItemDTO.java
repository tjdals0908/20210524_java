package ex07_jdbc;

import java.util.Date;

import javax.xml.crypto.Data;



public class ItemDTO {

	private String itemcode;
	private String itemname;
	private int price;
	private String bigo;
	private Date regdate;
	
	public ItemDTO() {
		super();
	}
	


	public ItemDTO(String itemcode, String itemname, int price, String bigo, Date regdate) {
		super();
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.price = price;
		this.bigo = bigo;
		this.regdate = regdate;
	}


	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBigo() {
		return bigo;
	}

	public void setBigo(String bigo) {
		this.bigo = bigo;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	
	

	public String toString() {
		return "ItemDTO [itemcode=" + itemcode + ", itemname=" + itemname + ", price=" + price + ", bigo=" + bigo
				+ ", regdate=" + regdate + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
