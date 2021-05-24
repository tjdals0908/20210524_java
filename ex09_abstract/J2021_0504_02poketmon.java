package ex09_abstract;

// 포켓몬 
abstract class Poketmon{
	//일반 메서드 
//	void gameName() {
//		System.out.println("포켓몬 게임");
//	}
	abstract void attack();
	abstract void sound();
}

//피카츄
class Pikachu extends Poketmon {
	@Override
	void attack() {
		System.out.println("전기공격");
	}
	@Override
	void sound() {
		System.out.println("피카피카");
	}
}

//꼬부기
class Squirtle extends Poketmon{
	@Override
	void attack() {
		System.out.println("물공격");
	}
	@Override
	void sound() {
		System.out.println("꼬북꼬북");
	}
}

//게임
class GamePlay{
	void attackPlay(Poketmon poketmon){
		poketmon.attack();
	}
	
	void soundPlay(Poketmon poketmon){
		poketmon.sound();

	}
}


public class J2021_0504_02poketmon {
	public static void main(String[] args) {

		Pikachu p1 = new Pikachu();

		Squirtle s1 = new Squirtle();

		GamePlay game = new GamePlay();
		game.attackPlay(p1);
		game.soundPlay(p1);

		System.out.println();
		game.attackPlay(s1);
		game.soundPlay(s1);

		
//		Poketmon p1 = new Poketmon();	부모는 객체 못만들어서 자식 객체로 써서 간접 접근 가능 
		

	}

}
