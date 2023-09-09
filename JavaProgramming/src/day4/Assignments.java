package day4;
//largest of 2 numbers using if-else
public class Assignments {

	public static void main(String[] args) {
		/*int a=20, b=30;
		if(a>b)
		{
			System.out.println("A is largest");
		}
		else
		{
			System.out.println("B is largest");
		}*/
	
	
// largest of 2 numbers using ternary operator
	/*int c=0,d=40;
	int x=c>d? c:d;
	System.out.println(x);*/
		
/*smallest of 3 numbers
	int a=10; int b=10; int c=10;
	if (a<b && a<c)
	{
		System.out.println("A is smaller :"+a);
	}
	else if(b<a && b<c)
	{
		System.out.println("b is Smaller:"+b);
	}
	else if (c<b && c<a)
	{
		System.out.println("C is smaller");
	}
	else
	{
		System.out.println("Happiness");
	}*/
	
	//Print month name using switch case statement
		int monthname=18;
		switch(monthname)
		{
		case 1:System.out.println("Jan"); 
		case 2: System.out.println("Feb"); 
		case 3: System.out.println("Mar"); break;
		case 4: System.out.println("April"); break;
		case 5: System.out.println("May"); break;
		case 6: System.out.println("June"); break;
		case 7: System.out.println("July"); break;
		case 8: System.out.println("Aug"); break;
		case 9: System.out.println("Sept"); break;
		case 10: System.out.println("Oct"); break;
		case 11: System.out.println("Nov"); break;
		case 12: System.out.println("Dec");break;
		default: System.out.println("Forgiveness");
		}
	
	
	}
}
