package ex03.method;

import java.util.Scanner;

/*
public class MethodTest {

	public static void show() { 					 //////     		1-4 매개변수 없고, 리턴타입 없는 경우 
	System.out.println("show method");
	}//show end
	
	//1-5 매개변수 있고, 리턴타입 없는 경우
	public static void display(String name){		
		System.out.println(name+" 이군요");
	}//
	public static void main(String[] args) {
		System.out.println("start main~~~~~~~~~~");
		show();
		display("display method");
		System.out.println("end main");
		display("또다시 호출가능");
	}//main end

}//class end
*/

/*
////////////////////////////////////////////문제 1 . 매개변수 3개 String,int,String입력받기(이름,나이,주소출력)
public class MethodTest {
	public static void infomation(String n, int age, String a){
		System.out.println(n+"님의 나이는"+age+"이며 주소는 "+ a+"입니다.");
	}//infomation end
	public static void main(String[] args) { 
		infomation("최상경" , 25 , "용인시수지구");
		
			}//main end
}//class end
////////////////////////////////////////////문제 1. 매개변수 3개 String,int,String입력받기(이름,나이,주소출력)
*/
/*
///////////////////////문제 2 . add라는 함수명에 값두개를입력받아서 더하기
public class MethodTest {

	public static void add(int a,int b){
		int sum = a+b;
		System.out.println(a+"+"+b+"="+sum);
	}//add end
	public static void main(String[]args){
		add(1,2);
	}//main end
}//class end
///////////////////////문제 2 . add라는 함수명에 값두개를입력받아서 더하기////////////////////////////
*/	
/*
//////////////문제 3 . max 함수를만드는데  두개값중 큰값출력//////////////////////////////////////

public class MethodTest {
	public static void max(int a, int b) {
		if (a < b)
			System.out.println(b);
		else
			System.out.println("최대값은 =" + a);
	}// max end

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		max(num, num2);
	}// main end
}// class end
//////////////문제 3 . max 함수를만드는데  두개값중 큰값출력//////////////////////////////////////
*/
////////////////문제 4. show()메소드에서 "KOSTA" 문자열 리턴하는 함수 //////////////////////////////

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
////////////////문제 4. show()메소드에서 "KOSTA" 문자열 리턴하는 함수 //////////////////////////////
	