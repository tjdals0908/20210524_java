package ex10_interface;

//클래스는 다중상속 불가 

//인터페이스 : 구현부가 없다(추상메서드) , 다중상속이 가능하다 , 객체생성 불가 
interface Attack{
	String name ="포켓몬 공격";			//public static final 생략가능  디폴트값으로 되어있다 
	void attack() ;	//abstrac 생략 가능 (디폴트값이라 abstrac 안붙여도 된다 )
	default void gameTime() {			//디폴트를 넣으면 추상메서드 x 구현화 시킬수 있음 *(일반메서드화)
		System.out.println("24시간 공격가능");
	}
}

interface Sound{
	String name = "포켓몬 소리";
	 void sound();
}

//피카
class Pikachu implements Attack ,Sound{
	@Override
	public void attack() {
		System.out.println("전기공격");
	}
	@Override
	public void sound() {
		System.out.println("피카피카");
	}
	

}

//꼬부기
class Squirtle implements Attack,Sound{
	@Override
	public void attack() {
		System.out.println("물공격");
	}

	@Override
	public void sound() {
		System.out.println("꼬북 꼬북");
	}		
}

class GamePlay{
	void attack(Attack attack) {
		attack.attack();
	}
	void sound(Sound sound) {
		sound.sound();
	}

}




public class J2021_0504_03Interface {
	public static void main(String[] args) {
		System.out.println(Attack.name);
		System.out.println(Sound.name);

		Pikachu pika = new Pikachu();
		Squirtle sq = new Squirtle();
	
		Attack attack= new Pikachu();
		Sound sound = new Pikachu();

		GamePlay gp = new GamePlay();
		gp.attack(pika);
		gp.attack(sq);
		
		
//		attP.attack();
//		soundP.sound();
//		
//		attS.attack();
//		soundS.sound();
		
		
		
		
	}

}
