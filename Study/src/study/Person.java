package study;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age= age;
	}

	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// 동등객체 판단을 위해 1차적으로 hashcode 
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		//return this.name.hashCode() + this.age;  //하위 호환 1.7 버전 까지
		return Objects.hash(this.name, this.age);  //신규 버전
	}
	
	// 2차적으로 equals 체크
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Person) {
			Person	person = (Person)obj;
			
			if( (this.name.equals(person.name)) && (this.age == person.age)){
			return true;
			}
		}	
		return false;
	}
	//주소보다 의미있는 데이터 출력하기 위한 오버라이딩, 안하면 @15b123 16진수 주소가 추가됨
	@Override
	public String toString() {
		return "이름 :" + this.getName() +  
				"\r\n" + "나이 :" +this.getAge();
	}
}
