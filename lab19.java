import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements ActionListner
{
  myframe()
  {
  	Button b1 = new Button("red");
  	Button b2 = new Button("blue");
  	Button b3 = new Button("reset");
    setTitle("sue");
    setSize(600,600);
    setBackground(Color.yellow);
    addLayout(new FlowLayout());
    add(b1);add(b2);add(b3);
    b1.addActionListner(this);
    b2.addActionListner(this);
    b3.addActionListner(this);
    addWindowListener(new win1());
    setVisible(true);

  }
  public void actionPerformed(ActionEvent ae)
  {
  	if (ae.getSource()=="b1")
  	{
  		setBackground(Color.red);
  	}
  	else if(ae.getSource()=="b2")
  	{
  		setBackground(Color.blue);
  	}
  	else
  	{
  		setBackground(Color.yellow);	
  	}
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