package ex08_inher;

//동물 
class Animal{
	private String name;

}

//토끼
class Rabbit extends Animal{
	private String name ="토끼";
	@Override
	public String toString() {
		return  name ;
	}
}

//사자 
class Lion extends Animal{
	private String name ="사자";
	@Override
	public String toString() {
		return name ;
	}
}

class AnimalCare{
	//먹이 주기 메서드
	void eating(Animal name) {
		System.out.println(name+"먹이 주기");
	}
	
	//목욕시키기 메서드 
	void washing(Animal name) {
		System.out.println(name+"목욕시키기");
	}
}




public class J2021_0504_03Animal {
	public static void main(String[] args) {
		
		Rabbit r1 = new Rabbit();
		Lion l1 = new Lion();
		
		AnimalCare care = new AnimalCare();
//		care.eating(r1);
//		care.eating(l1);
//
//		care.washing(r1);
//		care.washing(l1);
		
		
		Animal ani = new Rabbit();
		care.eating(ani);
		ani = new Lion();
		care.washing(ani);
	}
	
	
}
