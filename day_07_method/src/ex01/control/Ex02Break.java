package ex01.control;

public class Ex02Break {

	public static void main(String[] args) {
		UP: 
			for (int i = 1; i < 11; i++)
		{
			for (int j = 1; j < 6; j++) {

				System.out.print(j + "\t");

				if (j == 3) break UP;		//���� up��ġ�� ��������������. 
			} // j end
			System.out.println("�����j ���̾�.");
		} // i end
System.out.println("����� ���� ���̾�.");
	}// main end

}// class end
