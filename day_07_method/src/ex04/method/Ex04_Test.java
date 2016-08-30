package ex04.method;

import java.util.Scanner;

/////////////////////////////문제 7 . +, - 는 리턴 타입 없이 생성 하고   ,        * , / 는 리턴타입 있는 함수 생성
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
		System.out.println("첫번째 값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		System.out.println("두번째 값을 입력하세요");
		int su2 = sc.nextInt();
		System.out.println("연산자를 입력하세요.");
		char ch = sc.next().charAt(0);
		switch(ch){
		case '+':  plus(su1,su2);break;
		case '-':	mi(su1,su2);break;
		case '*': 	gob(su1,su2);break;
		case '/':  nanu(su1,su2);break;
		default: System.out.println("잘 못 입 력 하 셨 습 니 다  .");
		}//switch end
	}//try end
	catch(Exception e){
		System.out.println("0은 입력하실수 없습니다.");
		System.exit(0);
	
	}
	}//main end 
}//class end
/////////////////////////////문제 7 . +, - 는 리턴 타입 없이 생성 하고   ,        * , / 는 리턴타입 있는 함수 생성
