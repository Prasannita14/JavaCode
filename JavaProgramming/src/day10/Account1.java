package day10;

public class Account1 {
	private int acc_no;
	private String name;
	private float amount;
	
public  void setacc_no(int acc_no)
{
	this.acc_no=acc_no;
}
public int getacc_no()
{
	return acc_no;
}
public void setname(String name)
{
	this.name=name;
}
public String getname()
{
	return name;
}
public void setamount(float amount)
{
	this.amount=amount;
}
public float getamount()
{
	return amount;
}

	public static void main(String[] args) 
	{
    Account1 accobject=new Account1();
    accobject.setacc_no(157011234);
    accobject.setname("Prasu");
    accobject.setamount(1234.50f);
    System.out.println(accobject.getacc_no());
    System.out.println(accobject.getname());
    System.out.println(accobject.getamount());
	}

}
