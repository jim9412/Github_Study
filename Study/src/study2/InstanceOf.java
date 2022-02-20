package study2;

public class InstanceOf {
	public static void main(String[] args) {
		SportCar sportCar = new SportCar();
		
		if(sportCar instanceof SportCar) {
			System.out.println("SportCar로 형변환 가능");
		}
		
		if(sportCar instanceof Object) {
			System.out.println("Object로 형변환 가능");
		}
		
		if(sportCar instanceof Car) {
			System.out.println("car로 형변환 가능");
		}
	
		//instanceof 연산자의 결과가 true라는 것은 실제 형변환이 가능하다는 것. 즉, 상속관계에 있다는 것
	}
}
