import java.lang.*;
class fact
{
public static double call_fact(int a)
  {
    if (a == 0)
  		return 1;
  	else
  		return a * call_fact(a-1);
  }
}

class lab3
{
  public static void main(String[] args)
   {
    double ans=fact.call_fact(5);
    System.out.print("the factorial is ="+ans);
   }
}
