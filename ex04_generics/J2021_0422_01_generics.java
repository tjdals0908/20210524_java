package ex04_generics;

//사각형 클래스 
//필드 : 가로(int) 세로(int) , 넓이area
//제네릭타입 : 인스턴스 생성시 형을 결정하는거 
//T: type, V:value , K: key: , E :element
class Rectangle<T>{
	private T height; 
	private T width;
	private double area;
	
// Rectangle(){};	
	public Rectangle(T height, T width) {
		super();
		this.height = height;
		this.width = width;
		area = getArea(width,height);
		
	}


	public T getHeight() {
		return height;
	}
	public void setHeight(T height) {
		this.height = height;
	}

	public T getWidth() {
		return width;
	}

	public void setWidth(T width) {
		this.width = width;
	}

	public double getArea(T width, T hegiht) {
		double result =0;
		
		if(width instanceof Integer) {		//width 가 Integer형이라면 
			result = (int)width* (int)height;
		}else if (width instanceof Double) 
			result =(double)width * (double)height;
		
		return result;
	}


	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", area=" + area + "]";
	}

	
	
	
	
	
}


public class J2021_0422_01_generics {

	public static void main(String[] args) {

		
		Rectangle<Integer> r1 = new Rectangle<>(5,6);
		System.out.println(r1);
		
		
		Rectangle<Double> r2 = new Rectangle<>(5.1,6.2);
		System.out.println(r2);
		
	}

}
