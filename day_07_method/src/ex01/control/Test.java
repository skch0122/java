package ex01.control;

/*
//////////////////////////////////////////////////////////continue �׽�Ʈ
public class Test {
	public static void main(String[] args) {

for(int i = 1; i<=100; i++)
{
	if(i%2!=0)
		continue;
	else System.out.println(i);
	 //if(i==3) break;
//	if(i==3) continue;			//continue �������� �ٷ� �����������̵�.
//	System.out.println(i);
/*
}//for end
	}//main end

}//class end
*/
public class Test {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				count++;
				continue;
			}
			if (count % 10 == 0)
				System.out.println();
			System.out.print(i + "\t");
		}
	}//main end
}//class end
