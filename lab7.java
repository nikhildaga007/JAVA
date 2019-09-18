import java.lang.*;

class rational
{
  int p, q;
  public rational()
  {
    p=q=1;
  }
  public rational (int x, int y)
  {
    p= x;
    q= y;

    if (q == 0)
    {
      System.out.print("Not a rational number \n");
    }
    else
    {
      System.out.print("Its a rational number \n");
    }
  }
    public void showRational()
    {
      System.out.print("the rational number is "+p+"/"+q+"="+(float)p/(float)q+"\n");

    }
}

class lab7
{
  public static void main(String[] args)
  {
  rational b= new rational(10,2);
  b .showRational();
  }
}
