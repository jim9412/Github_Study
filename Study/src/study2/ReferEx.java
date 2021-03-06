package study2;

public class ReferEx {
	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		
		//멤버변수는 근본을 벗어나지 못함
		System.out.println(parent.x); //100
		System.out.println(child.x);  //200
		
		//멤버메서드는 현재 참조하고 있는 인스턴스의 영향을 받음
		parent.method(); //자손 메서드, 참고하고 있는 인스턴스에 따라 메서드 호출
		child.method();  //자손 메서드
	
		parent.type(new Car()); // 아무것도 안나옴, 상속관계에 있지 않음
		
	
	}
}
