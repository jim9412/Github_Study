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
		String str = new String("�ڹ�");
		System.out.println(str);
		System.out.println(str.toString());

		// ��������� Ŭ�����̰ų� toString()�����Ǹ� ���� ����
		// Ŭ������ ���� ������ ����� �ϰ� �Ǹ�, Ŭ����Ÿ��@16����(�ּ�)�� ���´�
		Object obj1 = new Object();
		System.out.println(obj1);
	}
}
