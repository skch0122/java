package ex03.method;

import java.util.Scanner;

/*
public class MethodTest {

	public static void show() { 					 //////     		1-4 �Ű����� ����, ����Ÿ�� ���� ��� 
	System.out.println("show method");
	}//show end
	
	//1-5 �Ű����� �ְ�, ����Ÿ�� ���� ���
	public static void display(String name){		
		System.out.println(name+" �̱���");
	}//
	public static void main(String[] args) {
		System.out.println("start main~~~~~~~~~~");
		show();
		display("display method");
		System.out.println("end main");
		display("�Ǵٽ� ȣ�Ⱑ��");
	}//main end

}//class end
*/

/*
////////////////////////////////////////////���� 1 . �Ű����� 3�� String,int,String�Է¹ޱ�(�̸�,����,�ּ����)
public class MethodTest {
	public static void infomation(String n, int age, String a){
		System.out.println(n+"���� ���̴�"+age+"�̸� �ּҴ� "+ a+"�Դϴ�.");
	}//infomation end
	public static void main(String[] args) { 
		infomation("�ֻ��" , 25 , "���νü�����");
		
			}//main end
}//class end
////////////////////////////////////////////���� 1. �Ű����� 3�� String,int,String�Է¹ޱ�(�̸�,����,�ּ����)
*/
/*
///////////////////////���� 2 . add��� �Լ��� ���ΰ����Է¹޾Ƽ� ���ϱ�
public class MethodTest {

	public static void add(int a,int b){
		int sum = a+b;
		System.out.println(a+"+"+b+"="+sum);
	}//add end
	public static void main(String[]args){
		add(1,2);
	}//main end
}//class end
///////////////////////���� 2 . add��� �Լ��� ���ΰ����Է¹޾Ƽ� ���ϱ�////////////////////////////
*/	
/*
//////////////���� 3 . max �Լ�������µ�  �ΰ����� ū�����//////////////////////////////////////

public class MethodTest {
	public static void max(int a, int b) {
		if (a < b)
			System.out.println(b);
		else
			System.out.println("�ִ밪�� =" + a);
	}// max end

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		max(num, num2);
	}// main end
}// class end
//////////////���� 3 . max �Լ�������µ�  �ΰ����� ū�����//////////////////////////////////////
*/
////////////////���� 4. show()�޼ҵ忡�� "KOSTA" ���ڿ� �����ϴ� �Լ� //////////////////////////////

public class MethodTest {
	public static String show(){
		String str = "kosta";
		System.out.println(str);
		return str;
	}//show end
	public static void main(String[] args) {
		show();
	}
}//class end
////////////////���� 4. show()�޼ҵ忡�� "KOSTA" ���ڿ� �����ϴ� �Լ� //////////////////////////////
	