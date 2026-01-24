import java.awt.*;
import javax.swing.*;
/*<applet code="demu5.class" width="500" height="500"></applet>*/
public class demu5 extends JApplet
{
   JPanel jp;
   JLabel ln,ln1,lad,lgen,lmop;
   JTextField tn;
   JPasswordField tn1;
    TextArea tadd;
	Checkbox ma,fe;
	CheckboxGroup cbg;
	Choice cpay;
    public void init()
    {
    jp=new JPanel();
    getContentPane().add(jp);
    ln=new JLabel("enter the user name");
    tn=new JTextField(10);
	ln1=new JLabel("enter the password name");
    tn1=new JPasswordField(15);
	tn1.setEchoChar('$');
	lad=new JLabel("Enter the Address");
	tadd=new TextArea(100,50);
	lgen=new JLabel("Gender");
	cbg=new CheckboxGroup();
	ma=new Checkbox("male",cbg,true);
	fe=new Checkbox("female",cbg,false);
	lmop=new JLabel("mode of payment");
	cpay=new Choice();
	cpay.add("cash");
    cpay.add("check");
	cpay.add("dd");
	cpay.add("digital");
    ln.setBounds(50,50,200,50);
    tn.setBounds(300,50,400,50);
	ln1.setBounds(50,150,200,50);
    tn1.setBounds(300,150,400,50);
	lad.setBounds(50,250,200,50);
	tadd.setBounds(300,250,200,50);
	lgen.setBounds(50,350,200,50);
	ma.setBounds(300,350,100,50);
	fe.setBounds(450,350,100,50);
	lmop.setBounds(50,450,200,50);
	cpay.setBounds(300,450,100,50);
	
    jp.setLayout(null);  
    jp.setBackground(Color.yellow);
    jp.setForeground(Color.red);
    jp.add(ln);
    jp.add(tn);
	jp.add(ln1);
    jp.add(tn1);
	jp.add(lad);
	jp.add(tadd);
	jp.add(lgen);
	jp.add(ma);
	jp.add(fe);
	jp.add(lmop);
	jp.add(cpay);
 }
}