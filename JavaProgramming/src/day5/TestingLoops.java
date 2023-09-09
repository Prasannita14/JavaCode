package day5;

public class TestingLoops {

	public static void main(String[] args) {
 /*for(int i=1;i<=10;i++)
 {
	 if (i==5)
	 {
	 System.out.println(i);
	 }
for(int i=1; i<=10; i++)
{
	if(i==2 || i==5 ||i==10)
	{System.out.println(i);
	}*/
for (int i=1; i<=10; i++)
{
	/*if(i!=2 || i!=5 || i!=10)  if we want to print all numbers when 
		i!=2,5,10--> we will need to use and operator here*/
	if (i!=2 && i!=5 && i!=10 )
	{
		System.out.println(i);
	}
}
	}
}
	


