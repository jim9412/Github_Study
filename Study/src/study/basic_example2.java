package study;

import java.util.Arrays;
import java.util.Scanner;

public class basic_example2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���ڸ� �����Ͻÿ�");
	int number = sc.nextInt(); 
	System.out.println(number);
	
	//���ڷ� �ٲ��ִ� ������ �ϴ� �޼��� : Integer.parseInt()
	//������ �ٲ��ִ� ������ �ϴ� �޼��� : Integer.toBinaryString() ��Ʈ ���� &, |,^
	sc.close();
	
	String str = new String("12345");
	System.out.println(str);
	str= null;
	System.out.println(str);
	
	byte b1 = 127;
	//byte b2 = b1 +2 ; overflow
	byte b2 = (byte)(b1 + 2); //���� ĳ����
	System.out.println(b1);
	System.out.println(b2);
	
	int[] ball = new int[5];
	for(int i=0; i<ball.length; i++) {
		ball[i] = (int)(Math.random()*20 ) + 1;
	}
	System.out.println(Arrays.toString(ball));
	Arrays.sort(ball); //�������� ����
	System.out.println(Arrays.toString(ball));
	}

	//System.arraycopy �޼�Ʈ�� ����ӵ��� ���� ������
}