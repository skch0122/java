package ex04.method;

import java.util.Scanner;

/*		
public class MainArgs {			///�Է¹����� �ִ� ���.   �ڵ���  �����ʸ��콺Ŭ���� RUNAS���� RunConfiguration
	//���� arguments���� �Է�â�� �Է�.
	public static void main(String[] args) {
//		String strx = args[0];
//		String stry = args[1];
//		int x= Integer.parseInt(strx);
//		int y= Integer.parseInt(stry);

		//�ѹ����Է��ϴ¹�.
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		System.out.println(x+y);
		System.out.println(x-y); 
		//�ѹ����Է��ϴ¹�.

	}//main end

}//class end
*/
//���� 1. ������ �Է� �޴� �Է� �޼ҵ� input()
//		  �Է� ������ ó���ϴ� �޼ҵ� process()
//		  ��� ����ϴ� �޼ҵ� output()
//		  main �޼ҵ忡���� �� �Լ� ȣ���ϱ�.
public class MainArgs {					
	public static void input(){						//������ �Է� �޴� �Է� �޼ҵ� input()
		Scanner sc = new Scanner(System.in);
		System.out.println("kor,eng,name:");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		String name = sc.nextLine();
		process(kor,eng,name);
	}
	public static void process(int kor, int eng, String name){		///		  �Է� ������ ó���ϴ� �޼ҵ� process()
		int sum = kor + eng;
		double avg = sum / 2.0;
		System.out.println(name+"�� ����ǥ!!");
		output(avg);
	}
	public static void output(double avg){
	
		switch((int)avg/10){
		case 10: System.out.println("A����");  break;
		case 9: System.out.println("A����");  break;
		case 8: System.out.println("B����");  break;
		case 7: System.out.println("C����");  break;
		case 6: System.out.println("D����");  break;
		default : System.out.println("F����");  break;
		}
	}
	public static void main(String[]args){
		input();
	}	//main end
}//class end