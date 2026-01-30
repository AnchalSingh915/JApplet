import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*; 
/*<applet code="demu9.class" width="500" height="500"></applet>*/
public class demu9 extends JApplet implements ActionListener
{
   JPanel jp;
   JLabel lwel,lfno,lres;
   JTextField tfno,tsno,tres;
   JButton bprime,bneon,barmstrong,bspy,bbuzz,bpalindrome,bniven,bodev,bmul,brev,bexit;
    public void init()
    {
    jp=new JPanel();
    getContentPane().add(jp);
	lwel=new JLabel("<html><u>WELCOME TO NUMBER SYSTEM</u></html>");
    lfno=new JLabel("ENTER THE NUMBER");
	lres=new JLabel("THE RESULT IS");
	tfno=new JTextField(5);
	Font f1=new Font("arial",Font.BOLD,30);
	Font f2=new Font("arial",Font.BOLD,20);
	Font f3=new Font("arial",Font.BOLD,20);
	tres=new JTextField(5);
	bprime=new JButton("prime");
	bodev=new JButton("odd or even");
	bbuzz=new JButton("buzz");
	barmstrong=new JButton("armstong");
	bpalindrome=new JButton("palindrome");
	bniven=new JButton("niven");
	bneon=new JButton("neon");
	bspy=new JButton("spy");
	bexit=new JButton("Exit");
	lwel.setBounds(400,10,800,100);
	lfno.setBounds(200,100,300,70);
	tfno.setBounds(600,100,300,70);
	lres.setBounds(200,250,300,70);
	tres.setBounds(600,250,300,70);
	bprime.setBounds(200,350,200,70);
	bodev.setBounds(600,350,200,70);
	bbuzz.setBounds(1000,350,200,70);
	barmstrong.setBounds(200,450,200,70);
	bpalindrome.setBounds(600,450,200,70);
	bniven.setBounds(1000,450,200,70);
	bneon.setBounds(200,550,200,70);
	bspy.setBounds(600,550,200,70);
	bexit.setBounds(1000,550,200,70);
	jp.setLayout(null);
	lwel.setFont(f1);
	lfno.setFont(f2);
	lres.setFont(f3);
	jp.setBackground(Color.red);
	jp.setForeground(Color.pink);
	jp.add(lwel);
	jp.add(lfno);
	jp.add(tfno);
	jp.add(lres);
	jp.add(tres);
	jp.add(bprime);
	jp.add(bodev);
	jp.add(bbuzz);
	jp.add(barmstrong);
	jp.add(bpalindrome);
	jp.add(bniven);
	jp.add(bneon);
	jp.add(bspy);
	jp.add(bexit);
	bprime.addActionListener(this);
	bodev.addActionListener(this);
	bbuzz.addActionListener(this);
	barmstrong.addActionListener(this);
	bpalindrome.addActionListener(this);
	bniven.addActionListener(this);
	bneon.addActionListener(this);
	bspy.addActionListener(this);
	bexit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	     
		  if(ae.getSource()==bprime)
		  {
	       int a=Integer.parseInt(tfno.getText());
		   int y=0,z=0;
           for(y=1;y<=a;y++)
		   {
              if(a%y==0)
              z=z+1;
           }
           if(z==2)		   
		   tres.setText(Integer.toString(a)+"  is prime");
	       else
			tres.setText(Integer.toString(a)+"  is not prime");
	        jp.setBackground(Color.green);
	        jp.setForeground(Color.red);
			 }
		   if(ae.getSource()==bodev)
		  {
	       int a=Integer.parseInt(tfno.getText());
           if(a%2==0)		   
		   tres.setText(Integer.toString(a)+"  is even");
	       else
			tres.setText(Integer.toString(a)+"  is odd");
	        jp.setBackground(Color.pink);
	        jp.setForeground(Color.black);
			 }
          if(ae.getSource()==bbuzz)
		  {
	       int a=Integer.parseInt(tfno.getText());
           if(a%7==0 ||a%10==7)		   
		   tres.setText(Integer.toString(a)+"  is buzz");
	       else
			tres.setText(Integer.toString(a)+"  is non buzz");
	        jp.setBackground(Color.green);
	        jp.setForeground(Color.red);
			 }
		   if(ae.getSource()==barmstrong)
		  {
	       int a=Integer.parseInt(tfno.getText());
		   int y=0,z=0,x=0;
		   x=a;
		   for(;a>0;)
		   {
			 y=a%10;
			 z=z+y*y*y;
			 a=a/10;
		   }
           if(z==x)		   
		   tres.setText(Integer.toString(x)+"  is armstong");
	       else
			tres.setText(Integer.toString(x)+"  is non armstrong");
	        jp.setBackground(Color.blue);
	        jp.setForeground(Color.yellow);
			 }
			  if(ae.getSource()==bpalindrome)
		  {
	       int a=Integer.parseInt(tfno.getText());
		   int y=0,z=0,x=0;
		   x=a;
		   for(;a>0;)
		   {
			 y=a%10;
			 z=z*10+y;
			 a=a/10;
		   }
           if(z==x)		   
		   tres.setText(Integer.toString(x)+" is palindrome");
	       else
			tres.setText(Integer.toString(x)+" is non palindrome");
	        jp.setBackground(Color.yellow);
	        jp.setForeground(Color.black);
			 }
			 	  if(ae.getSource()==bniven)
		  {
	       int a=Integer.parseInt(tfno.getText());
		   int y=0,z=0,x=0;
		   x=a;
		   for(;a>0;)
		   {
			 y=a%10;
			 z=z+y;
			 a=a/10;
		   }
           if(x%z==0)		   
		   tres.setText(Integer.toString(x)+"  is niven");
	       else
			tres.setText(Integer.toString(x)+"  is non niven");
	        jp.setBackground(Color.white);
	        jp.setForeground(Color.black);
			 }
		   if(ae.getSource()==bneon)
		  {
	       int a=Integer.parseInt(tfno.getText());
		   int l=0,y=0,z=0;
		   l=a*a;
		   for(;l>0;)
		   {
			 y=l%10;
			 z=z+y;
			 l=l/10;
		   }
           if(z==a)		   
		   tres.setText(Integer.toString(a)+"  is neon");
	       else
			tres.setText(Integer.toString(a)+"  is non neon");
	        jp.setBackground(Color.green);
	        jp.setForeground(Color.red);
			 }
		   if(ae.getSource()==bspy)
		  {
	       int a=Integer.parseInt(tfno.getText());
		   int y=0,z=1,x=0,p=0;
		   p=a;
		   for(;a>0;)
		   {
			 x=a%10;
			 y=y+x;
			 z=z*x;
			 a=a/10;
		   }
           if(z==y)		   
		   tres.setText(Integer.toString(p)+"  is spy");
	       else
			tres.setText(Integer.toString(p)+"  is non spy");
	        jp.setBackground(Color.yellow);
	        jp.setForeground(Color.red);
			 }
		  
      if(ae.getSource()==bexit)
     {
	  
	  jp.setBackground(Color.white);
	  jp.setForeground(Color.blue);
			System.exit(0);
		//	((jp) getParent()).dispose();
		/*try {
            // Navigate to a thank you page or a specific URL
            java.net.URL exitURL = new java.net.URL(getDocumentBase(), "thanks.html");
            getAppletContext().showDocument(exitURL);
        } catch (java.net.MalformedURLException mue) {
            mue.printStackTrace();
        }*/
      }	  
          		  
    }
}
	
		   