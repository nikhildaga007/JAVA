import java.lang.*;

class allInteger
{
  int x;
  public void getVal(int a)
  {
    x=a;
  }
  public void showVal()
  {
    System.out.print("the interger is="+x+"\n");
  }
}

class allNumbers extends allInteger
{
  float y;
  int j;
  public void getVal(float b)
  {
    y=b;
  }
  public void showVal()
  {
    System.out.print("the fraction number is="+y+"\n");
  }
}

class lab8
{
  public static void main(String[] args)
  {
      allNumbers obj= new allNumbers();
      obj.getVal((float)8);
      obj.showVal();
  }
}
