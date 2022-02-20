package study2;

public class Striker extends Player{
	private int def;

	public Striker(String name, int age, int backNumber, int speed, int def) {
		super(name, age, backNumber, speed); //�÷��̾��� ������
		this.def = def;
	}
	
	public int getDef() {
		return this.def;
	}
	
	@Override
	public void info() {
		super.info(); //Player's info
		System.out.println("�н� Ƚ�� : "+ this.getDef());
	}
	
}
