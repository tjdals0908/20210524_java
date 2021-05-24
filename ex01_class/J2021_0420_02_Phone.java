package ex01_class;
//핸드폰 클래스 
//필드: 이름(name), 용량(capacity), 화소(pixel)

//생성자 , 게터,세터, tostring 
//기능 
class Phone {

	private String name;
	private int capacity;
	private int pixel;

// 생성자
	Phone(){};	//기본생성자는 기본적으로 만들어주자 
	
	public Phone(String name, int capacity, int pixel) {
		this(name,capacity);				//- 생성자 호출시 반드시 가장 먼저 실행되어야 한다 
											//- this (name,capacity)가 있는 메서드 호출  (나자신의 생성자호출)
		this.pixel = pixel;
		System.out.println(this);			//this는 객체 자기자신을 가리키는것 
	}

	public Phone(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
	
	public Phone(String name) {
		this.name = name;
	}

//	toString 
	public String toString() {
		return "Phone [name=" + name + ", capacity=" + capacity + ", pixel=" + pixel + "]";
	}
	
	//getter setter
	public String getName() {
		return name;
	}
	public int getCapacity() {
		return capacity;
	}
	public int getPixel() {
		return pixel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	
	
	
	
	
	
}



public class J2021_0420_02_Phone {

	public static void main(String[] args) {
		Phone phone =new Phone();
		
		Phone p1 = new Phone("갤럭시",128,1200);
		System.out.println(p1);
		
		p1.setCapacity(256);
		System.out.println(p1);
		
		
		
		
	}

}
