package Test_try;
import java.util.*;
class Exception_Test 
{
	public static void main(String[] args) 
	{
		try{//tryå����.				//������ ���游�� �ڵ带 �ְ�  ����������� catch�� �Ѿ�� �ذ�

		System.out.println("��x���� ����  y���� 0���ָ� ������");
		Scanner sc = new Scanner(System.in);
	
		int x = sc.nextInt();
		int y = sc.nextInt();
	//		if(y==0){
	//		System.out.println("�ι�° ���� 0 �̸� 0 ���� ������ ����.");
//			System.exit(0);
	//		}

		int result = x/y;

		System.out.println("result=" + result);
	}//try end
		catch(ArithmeticException e){
		System.out.println("ArithmeticException ���⼭ �ɷ���");
		
		}
		catch(RuntimeException e){
		System.out.println("RuntimeException ���⼭ �ɷ���");
			
		
		}catch(Exception e){	//try���� ��1���־���ϴµ�  catch�� �ΰ��־��
			//1. ����� �޼��� ����

			//System.out.println("�ι�° ���� 0 �̸� 0 ���� ������ �����ϴ�.");
			//2. ExceptionŬ������ �ν��Ͻ��� �̿��ؼ� �޼��� ó��
			//System.out.println(e.getMessage());
			e.printStackTrace();//�������߻��Ѱ��� �ܰ������� ã�Ƽ� �������
		}finally{
			System.out.println("finally ������ ������ ����.");
			//file, database, io,......�ݱⰡ �ʿ��� �κп��� ó��
			/////////////////////////
		 }

	}//main end
}//class end

