package day10;

public class Orders {
 private int order_id;
 private String user_name;
 private int user_phone;
 public void setorder_id(int order_id)
 {
	 this.order_id=order_id;
 }
 public int getorder_id()
 {
	 return order_id;
 }
 public void setuser_phone(int user_phone)
 {
	 this.user_phone=user_phone;
 }
 public int getuser_phone()
 {
	 return user_phone;
 }
 public void setuser_name(String user_name)
 {
	 this.user_name=user_name;
 }
 public String getuser_name()
		 {
	 return user_name;
		 }
 
	public static void main(String[] args) {
   Orders ordobject=new Orders();
		   ordobject.setorder_id(12345);
		   ordobject.setuser_name("prasannita");
		   ordobject.setuser_phone(1234567818);
		   System.out.println(ordobject.getorder_id());
		   System.out.println(ordobject.getuser_name());
		   System.out.println(ordobject.getuser_phone());
		   
	}

}
