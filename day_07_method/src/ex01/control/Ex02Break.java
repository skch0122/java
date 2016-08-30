package ex01.control;

public class Ex02Break {

	public static void main(String[] args) {
		UP: 
			for (int i = 1; i < 11; i++)
		{
			for (int j = 1; j < 6; j++) {

				System.out.print(j + "\t");

				if (j == 3) break UP;		//위에 up위치로 완전빠져나간다. 
			} // j end
			System.out.println("여기는j 밖이야.");
		} // i end
System.out.println("여기는 완전 밖이야.");
	}// main end

}// class end
