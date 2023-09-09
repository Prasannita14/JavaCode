package day9;

public class GreetingsMain {

	public static void main(String[] args) {
//No params No return 
		Greetings gr=new Greetings();
        gr.greeting1();
		
//No params return value
		/*Greetings gr=new Greetings();
    String str=gr.greeting2();
{
	System.out.println(str);
}*/
		//Or we can directly print the value while passing method in SYSO statement.
		/*Greetings gr=new Greetings();
		{
			System.out.println(gr.greeting2());
		}*/
//takes params , no return value
		/*Greetings gr=new Greetings();
		gr.greeting3("Supu");
		}*/
//takes params, return value
 /*Greetings gr=new Greetings();
 String str=gr.Greeting4("Prasannita");
 {
	 System.out.println(str);
 }*/
	//or
 /*Greetings gr=new Greetings();
 {
	 System.out.println(gr.Greeting4("Prasannita"));
 }*/
	}


}	


