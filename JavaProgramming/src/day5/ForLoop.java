package day5;

public class ForLoop {

	public static void main(String[] args) {
		// 1---10 number print
		
 /*for(int a=1;a<=10;a++)
 {
	 System.out.println(a);
 }*/
		
// Print only even numbers
		
 /*for( int a=2;a<=10;a=a+2)
 {
	 System.out.println(a);
 }*/
//Print only odd number
		/*for(int a=1; a<10;a+=2)
		{
			System.out.println(a);
		}*/
//Print only even and odd number between 10 --use if condition
		//for (int i=2;i<=10;i+=2)
		/*for (int i=1;i<=10;i+=2)
		{
			//if(i%2==0)
			if(i%2!=0)
			{
				System.out.println(i);
			}*/
	//Print numbers from 10-- 1 in desc order
		/*for(int i=10; i>=1;i--)
		{
			System.out.println(i);
		}*/
	//print even/odd numbers from 50-1 in desc order
		//for(int i=50;i>=1;i-=2)
		for (int i=49; i>=1;i--)
		{
			//if (i%2==0)
			if (i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

}
