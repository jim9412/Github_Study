package study;

import java.util.Comparator;
import java.util.Objects;

public class CompareEx {

	//��øŬ���� (���� ��� Ŭ����)
	static class Student {
		int sno;
		String name;
		
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
	}
	
	public static void main(String[] args) {
		Student student1 = new Student(1, "ȫ�浿");
		Student student2 = new Student(1, "ȫ�浿");
		Student student3 = new Student(3, "���浿");

		//����(Comparator<T>�������̽��� �͸��� ��ü�� ����)
		int result = Objects.compare(student1, student3, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.sno < o2.sno)
					return -1;
				else if(o1.sno == o2.sno)
					return 0;
				else return 1;
			}
		});
		
		if(result==1) {
			System.out.println("o1.sno�� Ů�ϴ�");
		}else if(result ==0 ) {
			System.out.println("o1.sno�� o2.sno�� �����ϴ�");
		}else System.out.println("o2.sno�� Ů�ϴ�");
	
		System.out.println();
		
	}

}
