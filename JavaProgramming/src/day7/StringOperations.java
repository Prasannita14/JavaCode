package day7;

public class StringOperations {

	public static void main(String[] args) {
		 /*String s1="  welcome  ";
		 String s2="Chuniya  ";
		 String s3="have some dinner";
		 //System.out.println(s1+s2+s3);
		 
		 System.out.println(s1.concat(s2).concat(s3));
		 System.out.println(s1.trim());
		 
		 //System.out.println(s1);
		 //System.out.println(s1.length());*/
		String s1 ="soni@gmail,com";
		String s2="welcome";
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		String a[]=s1.split(",");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(s1.substring(1,4));
		System.out.println(s1.replace("home","lelcome"));
		System.out.println(s1.replace('w', 'e'));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("Com"));
		//System.out.println(s1.charAt(2));
		//int res =s1.trim().length();
		//System.out.println(res);
		

	}

}
