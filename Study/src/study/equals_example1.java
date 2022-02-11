package study;

public class equals_example1 {
	
	public static void main(String[] args) {
		
		Student student1 = new Student(10, "ȫ�浿", new int[] {90, 90});
		Student student2 = new Student(10, "ȫ�浿", new int[] {90, 100});
		
		
		System.out.println(student1.equals(student2));
		
		
		
	}

}

