package study;

public class SingletonEx {

	public static void main(String[] args) {
		//Singleton singleton1 = new Singleton();
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton1.equals(singleton2)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		//싱글톤패턴 사용 이유 : 하나의 인스턴스 생성 후 공유, ex) 사용자 환경설정, 커넥션풀, 스레드풀, OS의 시간이나 날짜 등
	}

}
