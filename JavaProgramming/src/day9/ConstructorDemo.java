package day9;

public class ConstructorDemo {
	/*int x;
	int y;
	String str;
	ConstructorDemo()
	{
		x=100;
		y=200;
		str="welcome";
	}
	void displayData()
	{
		System.out.println(x);
        System.out.println(y);
        System.out.println(str);
	}

	public static void main(String[] args) 
	{
     ConstructorDemo cd=new ConstructorDemo();
     cd.displayData();
	}*/
	
	int x;
	int y;
	int z;
	String str;
	ConstructorDemo(int a, int b, int c, String s)
	{
		x=a;
		y=b;
		z=c;
		str=s;
	}
	void displayData()
	{
		System.out.print(x+" "+y+" "+z+" "+str);
		/*System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("str");*/
	}

	public static void main(String[] args) 
	{
     ConstructorDemo cd=new ConstructorDemo(10,20,30,"Prasu");
     cd.displayData();
	}
	
	
	
	

}
