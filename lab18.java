import java.awt.*;
import java.lang.*;
import java.awt.event.*;

class myframe extends Frame
{
  myframe()
  {
    setTitle("sue");
    setSize(600,600);
    setBackground(Color.yellow);
    setVisible(true);
    addWindowListener(new win1());
  }

}

class win1 extends WindowAdapter
{
  public void windowClosing(WindowEvent we)
  {
    System.exit(0);
  }
}
class lab18
{
  public static void main(String[] args) {
    myframe obj= new myframe();
  }
}
