package day11;
class Bank
{
	double roi()
	{
		return 1.0;
	}
}
class ICICI extends Bank
{
	double roi()
	{
		return 1.2;
	}
}
class AXIS extends Bank
{
	double roi()
	{
		return 1.5;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		ICICI ic=new ICICI ();
		System.out.println(ic.roi());
		AXIS ax=new AXIS();
		System.out.println(ax.roi());
   
	}

}

