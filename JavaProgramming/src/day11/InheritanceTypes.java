package day11;

	class A
	{
		int a=100;
		void display()
		{
			System.out.println(a);
		}
	}
	class B extends A
	{
		int b=200;
		void show()
		{
			System.out.println(b);
		}
	class D extends B
	{
		int d=300;
		void print()
		{
			System.out.println(d);
		}
	}
	}
	public class InheritanceTypes {

	public static void main(String[] args) 
	{
		/*B bobj=new B();
		System.out.println(bobj.a);
        System.out.println(bobj.b);
		bobj.show();
		bobj.display();*/
        D cobj= new D();
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
        cobj.show();
        cobj.display();
        cobj.print();
	}

}

