package day10;

public class Orders1 {
	private int order_id;
	private int user_phone;
	private String user_name;
	private int parent_order_id;
	

	public int getOrder_id() {
		return order_id;
	}


	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}


	public int getUser_phone() {
		return user_phone;
	}


	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public int getParent_order_id() {
		return parent_order_id;
	}


	public void setParent_order_id(int parent_order_id) {
		this.parent_order_id = parent_order_id;
	}


	public static void main(String[] args) {
  Orders1 ord1object=new Orders1();
  ord1object.setOrder_id(1234);
  ord1object.setUser_phone(1234561234);
  ord1object.setUser_name("supu");
  ord1object.setParent_order_id(123456);
  System.out.println(ord1object.getOrder_id());
  System.out.println(ord1object.getUser_phone());
  System.out.println(ord1object.getUser_name());
  System.out.println(ord1object.getParent_order_id());
	}

}
