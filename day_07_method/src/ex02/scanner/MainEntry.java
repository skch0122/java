package ex02.scanner;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {  //시작점 (진입점)
	
		Scanner sc = new Scanner(System.in);
		
//		String msg = sc.next();
//		System.out.println("next() = "+ msg+  ","+su);
		String msg = sc.nextLine();int su = sc.nextInt();
		System.out.println("nextLine() = "+ msg + ","+su);
	
	}//main end
}//class end
