import java.io.*;
import java.lang.*;

class name
{ String x;
  public void getName()
  {
try {

    System.out.print("enter the name: ");
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br =new BufferedReader(ir);
     x=br.readLine();
   }
   catch (Exception z)
   {
     System.out.println("Input Error");
   }
  }
  public void showName()
  {
    System.out.print("Welcome  ");
    System.out.print(x.charAt(0)+" ");
    for (int  i =1; i<x.length() ;i++)
    {
    if (x.charAt(i) == ' ')
    {
      System.out.print(x.charAt(i+1)+"\n");
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
