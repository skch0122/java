package ex03.method;
///////////////////////////////////////�Լ����///////////////////////////////////////////////////////
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		System.out.println("main start");
		Scanner sc = new Scanner(System.in);
		System.out.println("x=");	int x = sc.nextInt();
		System.out.println("y=");	int y = sc.nextInt();
		
		plus(); //�Լ�ȣ��
		
		System.out.println("main method"+x+","+y);
		System.out.println("main end");
		}//main end
//	1-4 �Ű����� ����, ����Ÿ�� ���� ��� ///////////////////////	
	public static void plus(){			//�Ű��������� void���־ ����Ÿ�Ծ���.
		int hap =100+ 10;	 System.out.println("plus method hap="+hap);
	}//plus method end
}//class end
///////////////////////////////////////�Լ����///////////////////////////////////////////////////////
