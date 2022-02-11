package study;

public class StringBuilder {

	public static void main(String[] args) {
		//버퍼를 이용하기 때문에 하나의 인스턴스를 가지고 문자열 조작

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
