package study;

import java.util.HashSet;

public class hashcode_example2 {
	
	public static void main(String[] args) {
		//����� ���� Ŭ���������� hashCode() �� equals()�� �������̵� �ؾ��Ѵ�
		HashSet hashSet = new HashSet();
		
		//String str1 = new String("��");
		//String str2 = new String("��");
		Person person1 = new Person("ȫ�浿", 50);
		Person person2 = new Person("ȫ�浿", 50);
		
		hashSet.add(person1);
		hashSet.add(person2);
		System.out.println("����� ��ü �� :" + hashSet.size());
		// person ��ü �߰��ϸ� ���������� ������ �ؽ��ڵ尡 �޶� �Ѵ� ������
		// �������̵� �ʿ��� ( �ߺ� ���� ���� )
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
