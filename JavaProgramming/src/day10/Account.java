package day10;

public class Account {
	private int acc_no;
	private String name;
	private double amount;
	//setter method
	void setaccno(int accno)
	{
		acc_no=accno;
	}
   //getter method
	
		int getaccno()
		{
			return acc_no;
		}
	
	public static void main(String[] args) 
	{
    Account accobj=new Account();
    accobj.setaccno(12345678);
    System.out.println(accobj.getaccno());
    }

}
