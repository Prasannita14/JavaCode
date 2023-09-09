package day3;

public class TernaryOperator {

	public static void main(String[] args) {
		//var=exp ? result1:result2;
		int a=200; int b=100;
		a=1000;
		b=2000;
		//int x=a>b? a:b;
		//int x=b<a? a:b;
		//int x=a!=b? a:b;
		//int x=a==b? a:b;
		//int x=(1==1)? 100:200;
		//int y=(1!=1)? 100:200;
		
		int age=17;
		String validage= (age==18)? "Eligible for vote": "Not Eligible for vote";
		System.out.println(validage);
	}

}
