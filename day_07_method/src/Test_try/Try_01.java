package Test_try;
import java.util.*;
class Exception_Test 
{
	public static void main(String[] args) 
	{
		try{//try책보기.				//문제가 생길만한 코드를 넣고  문제가생기면 catch로 넘어가서 해결

		System.out.println("※x에는 정상값  y에는 0을주면 에러※");
		Scanner sc = new Scanner(System.in);
	
		int x = sc.nextInt();
		int y = sc.nextInt();
	//		if(y==0){
	//		System.out.println("두번째 수가 0 이면 0 으로 나눌수 없다.");
//			System.exit(0);
	//		}

		int result = x/y;

		System.out.println("result=" + result);
	}//try end
		catch(ArithmeticException e){
		System.out.println("ArithmeticException 여기서 걸렸음");
		
		}
		catch(RuntimeException e){
		System.out.println("RuntimeException 여기서 걸렸음");
			
		
		}catch(Exception e){	//try문은 꼭1개있어야하는데  catch는 두개있어도됨
			//1. 사용자 메세지 가능

			//System.out.println("두번째 수가 0 이면 0 으로 나눌수 없습니다.");
			//2. Exception클래스의 인스턴스를 이용해서 메세지 처리
			//System.out.println(e.getMessage());
			e.printStackTrace();//문제가발생한곳에 단계적으로 찾아서 출력해줌
		}finally{
			System.out.println("finally 구문은 무조건 실행.");
			//file, database, io,......닫기가 필요한 부분에서 처리
			/////////////////////////
		 }

	}//main end
}//class end

