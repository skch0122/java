package ex03.method;
///////////////////////////////////////함수사용///////////////////////////////////////////////////////
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		System.out.println("main start");
		Scanner sc = new Scanner(System.in);
		System.out.println("x=");	int x = sc.nextInt();
		System.out.println("y=");	int y = sc.nextInt();
		
		plus(); //함수호출
		
		System.out.println("main method"+x+","+y);
		System.out.println("main end");
		}//main end
//	1-4 매개변수 없고, 리턴타입 없는 경우 ///////////////////////	
	public static void plus(){			//매개변수없고 void가있어서 리턴타입없다.
		int hap =100+ 10;	 System.out.println("plus method hap="+hap);
	}//plus method end
}//class end
///////////////////////////////////////함수사용///////////////////////////////////////////////////////
