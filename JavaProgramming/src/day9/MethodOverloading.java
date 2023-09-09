package day9;

public class MethodOverloading {
	int x,y,z;
	double d;
	void sum()//method 1
	{
		x=10;
		y=12;
		System.out.println(x+y);
	}
	void sum(int a, int b)//method 2
	{
		x=a;
		y=b;
		System.out.println(x/y);
	}
	void sum(int c,double b)//method 3
	{
		x=c;
		d=b;
		System.out.println(x+d);
	}
	void sum(double b, int e)//method 4
	{
		d=b;
		y=e;
		System.out.println(d+y);
	}
 
	public static void main(String[] args) {
   MethodOverloading md=new MethodOverloading();
   md.sum();
   md.sum(100,200);
   md.sum(500,50.10);
   md.sum(20.25,50);
	}

}
