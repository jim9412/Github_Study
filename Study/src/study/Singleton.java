package study;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	//외부에서 new로 인스턴스 생성하는 것을 막음
	private Singleton() {
	}
	
	public static void add() {
		System.out.println("add메서드 호출");
	}
	//해당 클래스의 멤버의 주소를 넘겨주기위해서 외부에서 호출할 수 있는 getter메서드
	public static Singleton getInstance() {
		return singleton;
	}
}
