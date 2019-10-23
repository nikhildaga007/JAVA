/* write a java program to create 2 thread class by extending thread class to print amity and bca 100 times respectivly with a sleep of 1000 ms each. pass the value bca and amity along with the sleep value through the constructor for the thread class. */
 import java.lang.*;

 class Mythread extends Thread
{
  String s;
  int t;
  public Mythread(String s, int t)
  {
    this.s=s;
    this.t=t;
  }
  public void run()
  {
    for (int i=1 ; i<=100 ; i++)
    {
      System.out.println(s);
      try
      {
        Thread.sleep(t);
      }
      catch (Exception e)
      {
        System.out.print("Error");
      }
    }
  }
}

class lab16
{

  public static void main(String[] args)
  {
  Mythread t1=new Mythread("Bca",1000);
  Mythread t2=new Mythread("Amity",1000);
  t1.start();
  t2.start();
  }
}
