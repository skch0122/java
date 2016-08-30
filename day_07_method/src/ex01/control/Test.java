package ex01.control;

/*
//////////////////////////////////////////////////////////continue 테스트
public class Test {
	public static void main(String[] args) {

for(int i = 1; i<=100; i++)
{
	if(i%2!=0)
		continue;
	else System.out.println(i);
	 //if(i==3) break;
//	if(i==3) continue;			//continue 를만나면 바로 증감식으로이동.
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
