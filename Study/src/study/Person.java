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
	
	// ���ü �Ǵ��� ���� 1�������� hashcode 
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		//return this.name.hashCode() + this.age;  //���� ȣȯ 1.7 ���� ����
		return Objects.hash(this.name, this.age);  //�ű� ����
	}
	
	// 2�������� equals üũ
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
	//�ּҺ��� �ǹ��ִ� ������ ����ϱ� ���� �������̵�, ���ϸ� @15b123 16���� �ּҰ� �߰���
	@Override
	public String toString() {
		return "�̸� :" + this.getName() +  
				"\r\n" + "���� :" +this.getAge();
	}
}