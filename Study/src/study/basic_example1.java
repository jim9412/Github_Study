package study;

public class basic_example1 {

	public static void main(String[] args) {

		char ch = 'a';
		int year = 0;
		int age = 50;
		long result = 10;
		float result2 = 10.1f;
		double result3 = 10.1;
		System.out.println(year + age);
		System.out.println("char :" + ch);
		String str = new String("자바");
		System.out.println(str);
		System.out.println(str.toString());

		// 사용자정의 클래스이거나 toString()재정의를 하지 않은
		// 클래스의 참조 변수는 출력을 하게 되면, 클래스타입@16진수(주소)가 나온다
		Object obj1 = new Object();
		System.out.println(obj1);
	}
}
