import java.lang.*;

class lab2
	{
		static int a;
	        int b;
		public lab2(int x,int y)

		{
		this.a=x;
		this.b=y;
		
		}
		public void show()
		{
		System.out.print("\na = "+a+"\nb= "+b+"\n");
		}
		public static void main(String args[])
		{
			lab2 obj1= new lab2(10,15);
			obj1.show();
			lab2 obj2= new lab2(5,20);
			obj2.show();
			obj1.show();

		}	

       	}	
