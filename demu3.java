import java.awt.*;
import javax.swing.*;
/*<applet code="demu3.class"width="500" height="500"></applet>*/
public class demu3 extends JApplet
{
   JPanel jp;
   JLabel ln;
   JTextField tn;
   public void init()
  {
    jp=new JPanel();
    getContentPane().add(jp);
    ln=new JLabel("enter the name");
    tn=new JTextField(10);
    ln.setBounds(200,200,100,15);
    tn.setBounds(400,200,100,50);
    jp.setLayout(null);  
    jp.setBackground(Color.blue);
    jp.setForeground(Color.red);
    jp.add(ln);
    jp.add(tn);
 }
}