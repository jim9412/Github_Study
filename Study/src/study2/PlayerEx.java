package study2;

public class PlayerEx {

	public static void main(String[] args) {
		//������ ������
		Player player1 = new Player("�̵���", 40, 20, 60);
		player1.info();
		
		//������ ���� 
		Player player2 = new Striker("ȫ�浿", 30, 15,50, 30);
		player2.info(); //player Ŭ������ shoot �޼��尡 ���� ������ ���� �ȵ�, �� �ٺ��� ����� ���Ѵ�.
		//�޼��忡�� ��Ӱ��迡 �ִٸ�, �ڼ�Ŭ���� �������̵��� �ϰ� �Ǹ�, ���� �����ϰ� �ִ� �ν��Ͻ��� �޼��带 ȣ���Ѵ�.
		System.out.println();
		
		Player player3 = new Midfielder("�罼ȣ", 40, 20, 60, 60);
		player3.info();
		
		Player player4 = new Defender("������", 40, 30, 90, 40);
		player4.info();
		
	}

}