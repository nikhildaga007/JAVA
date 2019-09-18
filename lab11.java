import java.io.*;
import java.lang.*;

class name
{ String x;
  public void getName()
  {

    System.out.println("enter the name: ");
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br =new BufferedReader(ir);
     x=br.readLine();
  }
  public void showName()
  {
    System.out.println("Welcome");
    System.out.print(x.charAt(0));
    for (int i=1; i<x.length()-1; i++)
    {
      char ch=x.charAt(i);
      if (ch == " ")
      {
        System.out.println(" "+x.charAt(i+1));
      }

    }
  }
}

class lab11
{
  public static void main(String[] args) {
    name a=new name();
    a.getName();
    a.showName();
  }
}
