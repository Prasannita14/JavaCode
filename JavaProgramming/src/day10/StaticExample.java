package day10;

public class StaticExample {
	static int a=10;
	int b=100;
	static void m1()
	{
		System.out.println("this is m1 static method");
	}

	void m2()
	{
		System.out.println("this is m2 non-static method");
	}
/* non static methos can access  everything directly, just call the method m through 
	method using object*/
	void m()
	  {
		  System.out.println(StaticExample.a);
		  System.out.println(b);
		  m1();
		  m2();
	  }
  
	public static void main(String[] args) {
  //System.out.println(a);
  //System.out.println(b);
  //m1();
  //m2();
  StaticExample se=new StaticExample();
  //System.out.println(se.b);
  //se.m2();
  se.m();
	}
  
  
  
}


