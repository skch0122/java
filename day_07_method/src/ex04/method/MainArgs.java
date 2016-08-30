package ex04.method;

import java.util.Scanner;

/*		
public class MainArgs {			///입력받을수 있는 방법.   코딩후  오른쪽마우스클릭후 RUNAS에서 RunConfiguration
	//에서 arguments들어가서 입력창에 입력.
	public static void main(String[] args) {
//		String strx = args[0];
//		String stry = args[1];
//		int x= Integer.parseInt(strx);
//		int y= Integer.parseInt(stry);

		//한번에입력하는법.
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		System.out.println(x+y);
		System.out.println(x-y); 
		//한번에입력하는법.

	}//main end

}//class end
*/
//과제 1. 데이터 입력 받는 입력 메소드 input()
//		  입력 데이터 처리하는 메소드 process()
//		  결과 출력하는 메소드 output()
//		  main 메소드에서는 각 함수 호출하기.
public class MainArgs {					
	public static void input(){						//데이터 입력 받는 입력 메소드 input()
		Scanner sc = new Scanner(System.in);
		System.out.println("kor,eng,name:");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		String name = sc.nextLine();
		process(kor,eng,name);
	}
	public static void process(int kor, int eng, String name){		///		  입력 데이터 처리하는 메소드 process()
		int sum = kor + eng;
		double avg = sum / 2.0;
		System.out.println(name+"의 성적표!!");
		output(avg);
	}
	public static void output(double avg){
	
		switch((int)avg/10){
		case 10: System.out.println("A학점");  break;
		case 9: System.out.println("A학점");  break;
		case 8: System.out.println("B학점");  break;
		case 7: System.out.println("C학점");  break;
		case 6: System.out.println("D학점");  break;
		default : System.out.println("F학점");  break;
		}
	}
	public static void main(String[]args){
		input();
	}	//main end
}//class end