package study;

public class StringBuilder {

	public static void main(String[] args) {
		//���۸� �̿��ϱ� ������ �ϳ��� �ν��Ͻ��� ������ ���ڿ� ����

		StringBuffer sBuffer = new StringBuffer("JAVA");
		
		sBuffer.append("Program");
		System.out.println(sBuffer);
		
		sBuffer.insert(1, 100);
		System.out.println(sBuffer);
		
		sBuffer.reverse();
		System.out.println(sBuffer);
		
		sBuffer.delete(0,3);
		System.out.println(sBuffer);
		
	}
	
}
