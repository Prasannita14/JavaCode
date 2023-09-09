package day6;

public class MultiDimArray {

	public static void main(String[] args) {
 /*int a[][]=new int[3][2];
 a[0][0]=100;
 a[0][1]=200;
 a[1][0]=300;
 a[1][1]=400;
 a[2][0]=500;
 a[2][1]=600;
 {
	 //System.out.println(a.length);
	 {
		// System.out.println(a[0].length);
	 }
 }
 System.out.println(a[2][1]);
	}*/
	int a[][]= {{100,200,300,400,500},
			{300,400,40,50,60},
			{500,600,50,70,80}};
	
		for (int r=0; r<a.length; r++) 
			// row length=3, r=0
		{
       for(int c=0;c<a[r].length;c++)				//column length=3
		
	
		{
			System.out.print(a[r][c] + "   ");
		}
	System.out.println();
	}
	}
}


