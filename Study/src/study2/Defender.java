package study2;

public class Defender extends Player{
	private int shoot;

	public Defender(String name, int age, int backNumber, int speed, int shoot) {
		super(name, age, backNumber, speed); //플레이어의 생성자
		this.shoot = shoot;
	}
	
	public int getShoot() {
		return this.shoot;
	}
	
	@Override
	public void info() {
		super.info(); //Player's info
		System.out.println("방어 횟수 : "+ this.getShoot());
	}
	
}
