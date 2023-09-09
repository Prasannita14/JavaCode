package day8;

public class StudentMain {

	public static void main(String[] args) {
		//First approach (using reference variable)
		/*Student stu=new Student();
		{
			stu.sid=101;
			stu.name="Supu";
			stu.section="b";
			stu.grade='A';
			stu.show();
		}
		{
			stu.sid=102;
			stu.name="Prasu";
			stu.section="c";
			stu.grade='C';
			stu.show();
		}
	}*/

		//Second approach (using setData methos)
	/*Student stu=new Student();
	stu.setData(1011, "Suparna", 'A');
	stu.show();
	}*/

	//Third approach using constructer
Student stu=new Student(101,"Prasu",'A');
stu.show();
	}
}

	

