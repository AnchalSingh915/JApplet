import java.awt.*;
import javax.swing.*;
/*<applet code="demu6.class" width="500" height="500"></applet>*/
public class demu6 extends JApplet
{
   JPanel jp;
   JLabel ln,ln1,lad,lgen,lmon,ldate,lyear;
   JTextField tn;
   JPasswordField tn1;
    TextArea tadd;
	Checkbox ma,fe;
	CheckboxGroup cbg;
	Choice month;
	Choice date;
	Choice year;
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
    lmon=new JLabel("date of birth");
	month=new Choice();
	month.add("Jan");
	month.add("Feb");
	month.add("March");
	month.add("April");
	month.add("May");
	month.add("June");
	month.add("July");
	month.add("Aug");
	month.add("Sep");
	month.add("Oct");
	month.add("Nov");
	month.add("Dec");
	ldate=new JLabel("date of your birth");
	date=new Choice();
	for(int i=1;i<=31;i++)
	date.add(Integer.toString(i));
	 year=new Choice();
	for(int y=1980;y<=2026;y++)
	year.add(Integer.toString(y));
    ln.setBounds(50,50,200,50);
    tn.setBounds(300,50,400,50);
	ln1.setBounds(50,150,200,50);
    tn1.setBounds(300,150,400,50);
	lad.setBounds(50,250,200,50);
	tadd.setBounds(300,250,200,50);
	lgen.setBounds(50,350,200,50);
	ma.setBounds(300,350,100,50);
	fe.setBounds(450,350,100,50);
	lmon.setBounds(50,450,200,50);
	date.setBounds(300,450,100,50);
	month.setBounds(450,450,100,50);
	year.setBounds(600,450,100,50);
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
	jp.add(lmon);
	jp.add(date);
	jp.add(month);
	jp.add(year);
	}
}