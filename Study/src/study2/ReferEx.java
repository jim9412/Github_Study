package study2;

public class ReferEx {
	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		
		//��������� �ٺ��� ����� ����
		System.out.println(parent.x); //100
		System.out.println(child.x);  //200
		
		//����޼���� ���� �����ϰ� �ִ� �ν��Ͻ��� ������ ����
		parent.method(); //�ڼ� �޼���, �����ϰ� �ִ� �ν��Ͻ��� ���� �޼��� ȣ��
		child.method();  //�ڼ� �޼���
	
		parent.type(new Car()); // �ƹ��͵� �ȳ���, ��Ӱ��迡 ���� ����
		
	
	}
}