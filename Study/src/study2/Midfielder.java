package study2;

public class Midfielder extends Player{
	private int shoot;

	public Midfielder(String name, int age, int backNumber, int speed, int shoot) {
		super(name, age, backNumber, speed); //�÷��̾��� ������
		this.shoot = shoot;
	}
	
	public int getShoot() {
		return this.shoot;
	}
	
	@Override
	public void info() {
		super.info(); //Player's info
		System.out.println("��ȿ ���� : "+ this.getShoot());
	}
	
}
