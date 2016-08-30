package ex03.method;

import java.util.Scanner;

/*
//1-6 매개변수 없고, 리턴타입 있는 경우 //////////////////////////////////////////////////////////////////
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

//1-6 매개변수 없고, 리턴타입 있는 경우 //////////////////////////////////////////////////////////////////
*/
/*
///////3과 5 를 변수에 담고잇는 메소드하나 만들어서 곱한결과를 리턴받아서 출력 
public class Ex03 {
	public static int gob(int a,int b){
		return a*b;
	}
	public static void main(String[] args){
		int sum = gob(3,5);
		System.out.println(sum);
	}
		}
///////3과 5 를 변수에 담고잇는 메소드하나 만들어서 곱한결과를 리턴받아서 출력 
*/
/*
///////////////////////////////////////변수값에 kosta넣어서 문자형을 리턴받은후 출력

public class Ex03 {
	public static String show(){		//매개변수없고 return 받는
		String str = "kosta";
		return str;
	}//show end
	public static void main(String[] args){
		String a = show();
		System.out.println(a);
	}//main end
}//class end
///////////////////////////////////////변수값에 kosta넣어서 문자형을 리턴받은후 출력
*/
/*
//1-7 매개변수 있고, 리턴타입 있는 경우//////////////////////////

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
//1-7 매개변수 있고, 리턴타입 있는 경우//////////////////////////
*/

/*
///////////////////////////// 문제 5.절대값 구하는 함수 
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

///////////////////////////// 문제 5. 절대값 구하는 함수 
*/

///////////문제 6. String name(String,int){전달받은 String값을 int 수 만큼 출력하고 문자열을 리턴한다. return String;}

public class Ex03 {
	public static String name(String str, int a) {
		System.out.println("입력받은값은:" + str + "\n 증가 될 값은:" + a + "번");
		for (int c = 1; c <= a; c++) {
			System.out.println(str);
		}
		return str ;
	}// name end

	public static void main(String[] args) {
		name("kosta", 5);
	}// main end
}// class end
///////////문제 6.String name(String,int){전달받은 String값을 int 수 만큼 출력하고 문자열을 리턴한다. return String;}


/////////////////////////문제 7번은 ex04 패키지에 있음.
