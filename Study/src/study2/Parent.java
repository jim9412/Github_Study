package study2;

public class Parent {

	int x = 100;
	
	public void type(Object obj) {
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;
			System.out.println("조상클래스의 멤버 x값 : " + this.x);
		}else {
			System.out.println("상속관계에 있지 않은 클래스입니다.");
		}
	}
	
	public void method() {
		System.out.println("조상메서드 호출");
	}
	
}
