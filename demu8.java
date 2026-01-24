import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="demu8.class" width="500" height="500"></applet>*/
public class demu8 extends JApplet implements ActionListener
{
   JPanel jp;
   JLabel lwel,lfno,lres;
   JTextField tfno,tsno,tres;
   JButton bsum,bmul,brev,bexit;
    public void init()
    {
    jp=new JPanel();
    getContentPane().add(jp);
	lwel=new JLabel("WELCOME TO NUMBER SYSTEM");
    lfno=new JLabel("enter the digit no");
	lres=new JLabel("The Result is ");
	tfno=new JTextField(5);
	tres=new JTextField(5);
	bsum=new JButton("sum");
	bmul=new JButton("mul");
	brev=new JButton("rev");
	bexit=new JButton("Exit");
	lwel.setBounds(50,50,400,30);
	lfno.setBounds(50,150,200,30);
	tfno.setBounds(300,150,100,30);
	lres.setBounds(50,200,200,30);
	tres.setBounds(300,200,100,30);
	bsum.setBounds(50,250,100,30);
	bmul.setBounds(500,250,100,30);
	brev.setBounds(700,250,100,30);
	bexit.setBounds(900,250,100,30);
	jp.setLayout(null);
	jp.setBackground(Color.red);
	jp.setForeground(Color.pink);
	jp.add(lwel);
	jp.add(lfno);
	jp.add(tfno);
	jp.add(lres);
	jp.add(tres);
	jp.add(bsum);
	jp.add(bmul);
	jp.add(brev);
	jp.add(bexit);
	bsum.addActionListener(this);
	bmul.addActionListener(this);
	bexit.addActionListener(this);
	brev.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	     
		  if(ae.getSource()==bsum)
		 {
		   int a=Integer.parseInt(tfno.getText());
		   int y=0,z=0;
		   for(;a>0;)
		   {
           y=a%10;
           z=z+y;
           a=a/10;
		   }		   
		   tres.setText(Integer.toString(z));
	        jp.setBackground(Color.green);
	        jp.setForeground(Color.red);
		   
          }
		  
		  if(ae.getSource()==bmul)
		 {
		   int a=Integer.parseInt(tfno.getText());
		   int y=0,z=1;
		   for(;a>0;)
		   {
		   y=a%10;
		   z=z*y;
		   a=a/10;
		   }
		   tres.setText(Integer.toString(z));
	        jp.setBackground(Color.white);
	        jp.setForeground(Color.black);
          }
		  if(ae.getSource()==brev)
		 {
		   int a=Integer.parseInt(tfno.getText());
           System.out.println("hello");
      		   int y=0,z=0;
		   for(;a>0;)
		   {
		   y=a%10;
		   z=z*10+y;
		   a=a/10;
		   }
		   System.out.println("hello");
		   tres.setText(Integer.toString(z));
	        jp.setBackground(Color.pink);
	        jp.setForeground(Color.black);
          }
		  
      if(ae.getSource()==bexit)
     {
	  System.exit(0);
	  jp.setBackground(Color.yellow);
	        jp.setForeground(Color.blue);
      }	  
          		  
    }
}
	
		   