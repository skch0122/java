package ex04.method;

import java.util.Scanner;

/////////////////////////////���� 7 . +, - �� ���� Ÿ�� ���� ���� �ϰ�   ,        * , / �� ����Ÿ�� �ִ� �Լ� ����
public class Ex04_Test {
		public static void plus( int a , int b){		
		int plus=a+b;
		System.out.println("a + b="+plus);
		}
	public static void mi( int a , int b){
		int mi=a-b;
		System.out.println("a - b="+mi);
	}
	public static int gob(int a , int b){
		int gob=a*b;
		System.out.println("a * b="+gob);
		return gob;
	}
	public static int nanu( int a , int b){
		int nanu=a/b;
		System.out.println("a / b="+nanu);
		return nanu;
	}
	public static void main(String[] args) {
		try{
		System.out.println("ù��° ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		int su2 = sc.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���.");
		char ch = sc.next().charAt(0);
		switch(ch){
		case '+':  plus(su1,su2);break;
		case '-':	mi(su1,su2);break;
		case '*': 	gob(su1,su2);break;
		case '/':  nanu(su1,su2);break;
		default: System.out.println("�� �� �� �� �� �� �� �� ��  .");
		}//switch end
	}//try end
	catch(Exception e){
		System.out.println("0�� �Է��ϽǼ� �����ϴ�.");
		System.exit(0);
	
	}
	}//main end 
}//class end
/////////////////////////////���� 7 . +, - �� ���� Ÿ�� ���� ���� �ϰ�   ,        * , / �� ����Ÿ�� �ִ� �Լ� ����
