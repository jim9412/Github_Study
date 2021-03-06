package study;

import java.util.Arrays;

public class Student{
	int age;
	String name;
	int[] subject;
	public Student(int age, String name, int[] subject) {
		this.age =age;
		this.name = name;
		this.subject =subject;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			
			boolean result = Arrays.equals(this.subject, student.subject);
			if( (this.age == student.age) && (this.name.equals(student.name)) && result) {
			return true;
			}
		}	
		return false;
	}
	
}