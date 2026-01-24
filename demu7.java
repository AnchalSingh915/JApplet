import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="demu7.class" width="500" height="500"></applet>*/
public class demu7 extends JApplet implements ActionListener
{
   JPanel jp;
   JLabel lfno,lsno,lres;
   JTextField tfno,tsno,tres;
   JButton bsum,bsub,bmul,bdiv,bexit;
    public void init()
    {
    jp=new JPanel();
    getContentPane().add(jp);
    lfno=new JLabel("enter the first no");
	lsno=new JLabel("enter the second no");
	lres=new JLabel("The Result is ");
	tfno=new JTextField(5);
	tsno=new JTextField(5);
	tres=new JTextField(5);
	bsum=new JButton("sum");
	bsub=new JButton("sub");
	bmul=new JButton("mul");
	bdiv=new JButton("div");
	bexit=new JButton("Exit");
	lfno.setBounds(50,50,200,30);
	tfno.setBounds(300,50,100,30);
	lsno.setBounds(50,100,200,30);
	tsno.setBounds(300,100,100,30);
	lres.setBounds(50,150,200,30);
	tres.setBounds(300,150,100,30);
	bsum.setBounds(50,200,100,30);
	bsub.setBounds(300,200,100,30);
	bmul.setBounds(500,200,100,30);
	bdiv.setBounds(700,200,100,30);
	bexit.setBounds(900,200,100,30);
	jp.setLayout(null);
	jp.setBackground(Color.red);
	jp.setForeground(Color.pink);
	
	jp.add(lfno);
	jp.add(tfno);
	jp.add(lsno);
	jp.add(tsno);
	jp.add(lres);
	jp.add(tres);
	jp.add(bsum);
	jp.add(bsub);
	jp.add(bmul);
	jp.add(bdiv);
	jp.add(bexit);
	bsum.addActionListener(this);
	bsub.addActionListener(this);
	bmul.addActionListener(this);
	bdiv.addActionListener(this);
	bexit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	     
		  if(ae.getSource()==bsum)
		 {
		   int a=Integer.parseInt(tfno.getText());
		   int b=Integer.parseInt(tsno.getText());
		   int c=a+b;
		   tres.setText(Integer.toString(c));
	        jp.setBackground(Color.green);
	        jp.setForeground(Color.red);
		   
          }
		  if(ae.getSource()==bsub)
		 {
		   int a=Integer.parseInt(tfno.getText());
		   int b=Integer.parseInt(tsno.getText());
		   int c=a-b;
		   tres.setText(Integer.toString(c));
	        jp.setBackground(Color.blue);
	        jp.setForeground(Color.pink);
		   
          }
		  if(ae.getSource()==bmul)
		 {
		   int a=Integer.parseInt(tfno.getText());
		   int b=Integer.parseInt(tsno.getText());
		   int c=a*b;
		   tres.setText(Integer.toString(c));
	        jp.setBackground(Color.white);
	        jp.setForeground(Color.black);
		   
          }
		  if(ae.getSource()==bdiv)
		 {
		   int a=Integer.parseInt(tfno.getText());
		   int b=Integer.parseInt(tsno.getText());
		   int c=a/b;
		   tres.setText(Integer.toString(c));
	        jp.setBackground(Color.pink);
	        jp.setForeground(Color.white);
		   
          }
      if(ae.getSource()==bexit)
     {
	  System.exit(0);
	  jp.setBackground(Color.yellow);
	        jp.setForeground(Color.blue);
      }	  
          		  
    }
}
	
		   