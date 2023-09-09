package day9;

public class ConstructorOverloading {
	int x,y;
	double d;
	ConstructorOverloading()
	{
		x=10;
		y=20;
	}
	ConstructorOverloading(int a, int b)
	{
		x=a;
		y=b;
	}
	ConstructorOverloading(int a, double c)
	{
		x=a;
		d=c;
	}
	ConstructorOverloading(double c, int b,int a)
	{
		x=b;
		d=c;
	}
	void display() {
		System.out.println(x);
	    System.out.println(y);
	    System.out.println(d);
	}

	public static void main(String[] args) {
/*ConstructorOverloading cd= new ConstructorOverloading ();
cd.display();*/
/*ConstructorOverloading cd= new ConstructorOverloading (200,300);
cd.display();*/

/*ConstructorOverloading cd= new ConstructorOverloading (200,20.15);
cd.display();*/
		/*ConstructorOverloading cd= new ConstructorOverloading (20.15,200,300);
		cd.display();*/
//ConstructorOverloading cd= new ConstructorOverloading (20.12,20.13);
//it will throw error
		//cd.display();
	}

}
