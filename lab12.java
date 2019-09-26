import java.lang.*;

class divide
{
 int c;
    public void getnum(int a, int b)
    {
      try
         {
            c=a/b;
         }

          catch (Exception e)
            {
              System.out.print("error in the denominator \n");
              System.exit(0);
            }
    }
    public void shownum()
    {
      System.out.println("\nthe ans is "+c);
    }

}

class lab12
{
  public static void main(String[] args)
  {
    divide obj = new divide();
    obj.getnum(10,0);
    obj.shownum();
  }

}
