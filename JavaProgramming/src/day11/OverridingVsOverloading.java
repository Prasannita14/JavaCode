package day11;
class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}
class XYZ  extends ABC
{
	void m1(int a)
	{
		System.out.println(a*a);
	}
	void m2(int b,int c)
	{
		System.out.println(b+c);
	}
}

public class OverridingVsOverloading {
   public static void main(String[] args) {
   XYZ xyz=new XYZ();
   xyz.m1(100);
   xyz.m2(10);
   xyz.m2(10,20);
	}

}