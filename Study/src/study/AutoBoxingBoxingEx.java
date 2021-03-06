package study;

import java.util.List;
import java.util.Vector;

public class AutoBoxingBoxingEx {

	public static void main(String[] args) {
		// AutoBoxing
		Integer obj1 = 100;
		Integer obj2 = 100;
		
		List list = new Vector();
		list.add(obj1);
		list.add(obj2);
		list.add(500);
		System.out.println(list);
		
		// get메서드는 리턴타입이 <E>
		// int value1 = list.get(0);
		// 해결법 (Integer) 강제 캐스팅
		int value1 = (Integer)list.get(0);
		
		int value2 = obj2.intValue(); //정상코드
		int value3 = obj2; //자동 언박싱
		System.out.println(value2);
		System.out.println(value3);
		
		int result = obj1 + 500;
		//객체 + 기본타입은 컴파일러가 자동 언박싱;
		
		
	}

}
