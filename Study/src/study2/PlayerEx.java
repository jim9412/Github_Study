package study2;

public class PlayerEx {

	public static void main(String[] args) {
		//다형성 미적용
		Player player1 = new Player("이동국", 40, 20, 60);
		player1.info();
		
		//다형성 적용 
		Player player2 = new Striker("홍길동", 30, 15,50, 30);
		player2.info(); //player 클래스에 shoot 메서드가 없기 떄문에 생성 안됨, 즉 근본은 벗어나지 못한다.
		//메서드에서 상속관계에 있다면, 자손클래스 오버라이딩을 하게 되면, 현재 참조하고 있는 인스턴스의 메서드를 호출한다.
		System.out.println();
		
		Player player3 = new Midfielder("양슨호", 40, 20, 60, 60);
		player3.info();
		
		Player player4 = new Defender("김진우", 40, 30, 90, 40);
		player4.info();
		
	}

}
