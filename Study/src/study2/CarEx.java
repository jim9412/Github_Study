package study2;

public class CarEx {
	public static void main(String[] args) {
		Car car = null;
		SportCar sportCar = new SportCar();
		SportCar sportCar2 = null;
		
		PoliceCar policeCar = new PoliceCar();
		
		sportCar.speedUp();
		
		car = (Car)sportCar;//업 캐스팅 ( 자손 -> 조상 ), 조작할 수 있는 멤버가 줄어든다
//		car.speedUP(); Car에 speedUp 메서드가 없기떄문에 에러 
//		sportCar2 = car; 다운 캐스팅 ( 조상 -> 자손 ), 조작할 수 있는 멤버가 늘어난다. 하지만 타입 미스매치로 에러
		sportCar2 = (SportCar)car; // 다운캐스팅 할 때, 반드시 명시적으로 형변환 코드를 작성해야함.
		sportCar2.speedUp(); //
		
//		sportCar1 = (SportCar)policeCar 서로 상속관계가 아니기 때문에 형변환이 이루어질 수 없음.
		
	}
}
