package study2;

public class Parent {

	int x = 100;
	
	public void type(Object obj) {
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;
			System.out.println("����Ŭ������ ��� x�� : " + this.x);
		}else {
			System.out.println("��Ӱ��迡 ���� ���� Ŭ�����Դϴ�.");
		}
	}
	
	public void method() {
		System.out.println("����޼��� ȣ��");
	}
	
}
