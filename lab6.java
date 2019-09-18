class rational
{
  int p, q;
  public void getRational(int x, int y)
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
    static rational addRational(rational a , rational b)
    {
      rational temp=new rational();
      temp.p=a.p+b.p;
      temp.q=a.q+b.q;
      return temp;
    }
}

class lab6
{
  public static void main(String[] args)
  {
  rational a= new rational();
  rational b= new rational();
  a.getRational(10,2);

  a.showRational();
  }
}
