package study;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	//�ܺο��� new�� �ν��Ͻ� �����ϴ� ���� ����
	private Singleton() {
	}
	
	public static void add() {
		System.out.println("add�޼��� ȣ��");
	}
	//�ش� Ŭ������ ����� �ּҸ� �Ѱ��ֱ����ؼ� �ܺο��� ȣ���� �� �ִ� getter�޼���
	public static Singleton getInstance() {
		return singleton;
	}
}
