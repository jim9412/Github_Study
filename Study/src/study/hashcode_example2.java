package study;

import java.util.HashSet;

public class hashcode_example2 {
	
	public static void main(String[] args) {
		//사용자 정의 클래스에서는 hashCode() 와 equals()를 오버라이딩 해야한다
		HashSet hashSet = new HashSet();
		
		//String str1 = new String("가");
		//String str2 = new String("가");
		Person person1 = new Person("홍길동", 50);
		Person person2 = new Person("홍길동", 50);
		
		hashSet.add(person1);
		hashSet.add(person2);
		System.out.println("저장된 객체 수 :" + hashSet.size());
		// person 객체 추가하면 논리적으로 같지만 해쉬코드가 달라 둘다 저장함
		// 오버라이딩 필요함 ( 중복 저장 방지 )
		/*
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		*/
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person1);
		System.out.println(person1);

	}

}

