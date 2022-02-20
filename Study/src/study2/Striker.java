package study2;

public class Striker extends Player{
	private int def;

	public Striker(String name, int age, int backNumber, int speed, int def) {
		super(name, age, backNumber, speed); //플레이어의 생성자
		this.def = def;
	}
	
	public int getDef() {
		return this.def;
	}
	
	@Override
	public void info() {
		super.info(); //Player's info
		System.out.println("패스 횟수 : "+ this.getDef());
	}
	
}
