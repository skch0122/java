package ex03.method;

import java.util.Scanner;

/*
//1-6 �Ű����� ����, ����Ÿ�� �ִ� ��� //////////////////////////////////////////////////////////////////
public class Ex03 {

	public static int disp(){
		System.out.println("display()call");;
		
		return 100+50;
		
	}//disp end
	public static void main(String[] args) {
		int sum = disp();
		System.out.println(sum);
		System.out.println("hap = "+disp());
	}// main end

}//class end

//1-6 �Ű����� ����, ����Ÿ�� �ִ� ��� //////////////////////////////////////////////////////////////////
*/
/*
///////3�� 5 �� ������ ����մ� �޼ҵ��ϳ� ���� ���Ѱ���� ���Ϲ޾Ƽ� ��� 
public class Ex03 {
	public static int gob(int a,int b){
		return a*b;
	}
	public static void main(String[] args){
		int sum = gob(3,5);
		System.out.println(sum);
	}
		}
///////3�� 5 �� ������ ����մ� �޼ҵ��ϳ� ���� ���Ѱ���� ���Ϲ޾Ƽ� ��� 
*/
/*
///////////////////////////////////////�������� kosta�־ �������� ���Ϲ����� ���

public class Ex03 {
	public static String show(){		//�Ű��������� return �޴�
		String str = "kosta";
		return str;
	}//show end
	public static void main(String[] args){
		String a = show();
		System.out.println(a);
	}//main end
}//class end
///////////////////////////////////////�������� kosta�־ �������� ���Ϲ����� ���
*/
/*
//1-7 �Ű����� �ְ�, ����Ÿ�� �ִ� ���//////////////////////////

public class Ex03 {
	public static int plus(int x, int y, int z) {
		int hap = x+y+z;
		return hap;
	}// plus end
	public static void main(String[]args){
		int hap1=plus(1,2,3);
		System.out.println(hap1);
	}//main end
}// class end
//1-7 �Ű����� �ְ�, ����Ÿ�� �ִ� ���//////////////////////////
*/

/*
///////////////////////////// ���� 5.���밪 ���ϴ� �Լ� 
public class Ex03 {
	public static int abs(int a){
		if(a<0) {
			int mi = a * (-1);
			System.out.println(mi);
		}
		else System.out.println(a);
		return a;
	}//abs end
	public static void main(String[] args){
		abs(-9);
		
	}//main end
}//end class

///////////////////////////// ���� 5. ���밪 ���ϴ� �Լ� 
*/

///////////���� 6. String name(String,int){���޹��� String���� int �� ��ŭ ����ϰ� ���ڿ��� �����Ѵ�. return String;}

public class Ex03 {
	public static String name(String str, int a) {
		System.out.println("�Է¹�������:" + str + "\n ���� �� ����:" + a + "��");
		for (int c = 1; c <= a; c++) {
			System.out.println(str);
		}
		return str ;
	}// name end

	public static void main(String[] args) {
		name("kosta", 5);
	}// main end
}// class end
///////////���� 6.String name(String,int){���޹��� String���� int �� ��ŭ ����ϰ� ���ڿ��� �����Ѵ�. return String;}


/////////////////////////���� 7���� ex04 ��Ű���� ����.
