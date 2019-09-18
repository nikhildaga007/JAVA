
class MyTime
{
	int hh, mm, ss;
	public void getTime(int h, int m, int s)
  {
		ss = (s%60);
		mm = (m%60) + (s/60);
		hh = h + (m/60);
    if (hh>24)
    {
      System.out.print((hh/24)+"Day(s)"+(hh%24)+"Hrs"+mm+"min"+ss+"sec");
    }
    else
    {
      System.out.print(hh+"Hrs"+mm+"min"+ss+"sec");
    }
	}
    static MyTime addTime(MyTime x, MyTime y)
		{
			MyTime temp= new MyTime();
			temp.hh=x.hh+y.hh;
			temp.mm=x.mm+y.mm;
			temp.ss=x.ss+y.ss;
			return temp;
		}
		static MyTime minusTime(MyTime a, MyTime b)
		{
			MyTime temp1= new MyTime();
			temp1.hh=a.hh-b.hh;
			temp1.mm=a.mm-b.mm;
			temp1.ss=a.ss-b.ss;
			return temp1;
		}

	public void showTime()
	{
		System.out.print("Time : "+hh+":"+mm+":"+ss+"\n");
	}
}

class lab4
{

	public static void main(String[] args)
   {

		 MyTime a = new MyTime();
	     MyTime b = new MyTime();
	     a.getTime(25, 15, 67);
	     System.out.print("\nA = \n");
	     System.out.print("A = ");
	     a.showTime();
	     b.getTime(17, 54, 12);
	     System.out.print("\nB = \n");
	     System.out.print("B = ");
	     b.showTime();
	     MyTime c = MyTime.addTime(a,b);
	     System.out.print("\nC = A+B\n");
	     System.out.print("C = A+B = ");
	     c.showTime();
			 MyTime d = MyTime.subTime(a,b);
	 	 	 System.out.print("\nD = A-B\n");
	 	 	 System.out.print("D = A-B = ");
	 	 	 d.showTime();
	 }
}
