package study2;

public class CarEx {
	public static void main(String[] args) {
		Car car = null;
		SportCar sportCar = new SportCar();
		SportCar sportCar2 = null;
		
		PoliceCar policeCar = new PoliceCar();
		
		sportCar.speedUp();
		
		car = (Car)sportCar;//�� ĳ���� ( �ڼ� -> ���� ), ������ �� �ִ� ����� �پ���
//		car.speedUP(); Car�� speedUp �޼��尡 ���⋚���� ���� 
//		sportCar2 = car; �ٿ� ĳ���� ( ���� -> �ڼ� ), ������ �� �ִ� ����� �þ��. ������ Ÿ�� �̽���ġ�� ����
		sportCar2 = (SportCar)car; // �ٿ�ĳ���� �� ��, �ݵ�� ���������� ����ȯ �ڵ带 �ۼ��ؾ���.
		sportCar2.speedUp(); //
		
//		sportCar1 = (SportCar)policeCar ���� ��Ӱ��谡 �ƴϱ� ������ ����ȯ�� �̷���� �� ����.
		
	}
}