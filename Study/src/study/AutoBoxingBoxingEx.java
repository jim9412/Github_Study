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
		
		// get�޼���� ����Ÿ���� <E>
		// int value1 = list.get(0);
		// �ذ�� (Integer) ���� ĳ����
		int value1 = (Integer)list.get(0);
		
		int value2 = obj2.intValue(); //�����ڵ�
		int value3 = obj2; //�ڵ� ��ڽ�
		System.out.println(value2);
		System.out.println(value3);
		
		int result = obj1 + 500;
		//��ü + �⺻Ÿ���� �����Ϸ��� �ڵ� ��ڽ�;
		
		
	}

}