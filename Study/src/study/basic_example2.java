package study;

import java.util.Arrays;
import java.util.Scanner;

public class basic_example2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자를 기입하시오");
	int number = sc.nextInt(); 
	System.out.println(number);
	
	//숫자로 바꿔주는 역할을 하는 메서드 : Integer.parseInt()
	//진수로 바꿔주는 역할을 하는 메서드 : Integer.toBinaryString() 비트 연산 &, |,^
	sc.close();
	
	String str = new String("12345");
	System.out.println(str);
	str= null;
	System.out.println(str);
	
	byte b1 = 127;
	//byte b2 = b1 +2 ; overflow
	byte b2 = (byte)(b1 + 2); //강재 캐스팅
	System.out.println(b1);
	System.out.println(b2);
	
	int[] ball = new int[5];
	for(int i=0; i<ball.length; i++) {
		ball[i] = (int)(Math.random()*20 ) + 1;
	}
	System.out.println(Arrays.toString(ball));
	Arrays.sort(ball); //오름차순 정렬
	System.out.println(Arrays.toString(ball));
	}

	//System.arraycopy 메서트가 복사속도가 가장 빠르다
}
