package study2;

public class InstanceOf {
	public static void main(String[] args) {
		SportCar sportCar = new SportCar();
		
		if(sportCar instanceof SportCar) {
			System.out.println("SportCar�� ����ȯ ����");
		}
		
		if(sportCar instanceof Object) {
			System.out.println("Object�� ����ȯ ����");
		}
		
		if(sportCar instanceof Car) {
			System.out.println("car�� ����ȯ ����");
		}
	
		//instanceof �������� ����� true��� ���� ���� ����ȯ�� �����ϴٴ� ��. ��, ��Ӱ��迡 �ִٴ� ��
	}
}
