package ex01.control;

public class Ex03Break {
	public static void main(String[] args) {
		boolean t = true;
		first:{
			second:{
				third:{
				int k = 100;
				System.out.println("1 Before the break");
				if(t) break second;
				System.out.println("2 This won't execute");
				}//third end
			System.out.println("3 third end out");
			}//second end
		System.out.println("4 second end out");
		}//first end
		}//main end

}//class end
