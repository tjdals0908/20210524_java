package ex07_jdbc.Salel;

public class SalesDTO {
	
	
	private String saledate;
	private int seq;
	private int qty ;
	private int amount;
	private String itemcode;
	private String regdate;
	
	public SalesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesDTO(String saledate, int seq, int qty, int amount, String itemcode, String regdate) {
		super();
		this.saledate = saledate;
		this.seq = seq;
		this.qty = qty;
		this.amount = amount;
		this.itemcode = itemcode;
		this.regdate = regdate;
	}

	public String getSaledate() {
		return saledate;
	}

	public void setSaledate(String saledate) {
		this.saledate = saledate;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "SalesDTO [saledate=" + saledate + ", seq=" + seq + ", qty=" + qty + ", amount=" + amount + ", itemcode="
				+ itemcode + ", regdate=" + regdate + "]";
	}
	
	
	
	
	

	
	
	

}
