package day3;

public class OperatorsDay1 {
public static void main (String[] args)
{//Arithmatic Operators
	int a=40; 
	int b=20;
	System.out.println("The Sum of a and b is:"+a+b);
	System.out.println("The Sum of a and b is:"+ (a+b)); 
	System.out.println("The Diff of a and b is:"+(a-b));
	System.out.println("The Mult of a and b is:"+(a*b));
	System.out.println("The div of a and b is:"+(a/b));
	System.out.println("The Mod of a and b is:"+(a%b));
	

 //Relational Operators
  int c=30;
  int d=30;
  System.out.println(c>=d);
  System.out.println(c<=d);
  System.out.println(c!=d);
  System.out.println(c==d);
  
  //Logical operators (&&,||, !)
  boolean x=false;
  boolean y=true;
  System.out.println(x&&y);
  System.out.println(x||y);
  System.out.println(!x);
  System.out.println(!y);  
  boolean a1=10>30;
  boolean b1=60>50;
  System.out.println(a1&&b1);
  System.out.println(a1||b1);
		  
  }
		 
}
