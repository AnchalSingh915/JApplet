import java.awt.*;
import javax.swing.*; 
/*<applet code="demu10.class" width="1000" height="1000"></applet>*/
public class demu10 extends JApplet implements Runnable
{
   Thread th;
   JLabel lbl1,lbl2,lbl3;
   JPanel jp;
   int ctr=0,ctr1=0,ctr2=0;
   int i=0,j=4,t=4,p=4;
   Color c[],c1[],c2[],c3[];
   String names[]={"Nand","Deepak","Rahul","Pragati","Diya"};
   String chocolate[]={"dairy milk","kitkat","5star","haselnut","munch"};
   String company[]={"Google","Vivo","Reliance","Deloitte","TCS"};
   public void init()
   {
	   jp=new JPanel();
	   getContentPane().add(jp);
	   
	   c=new Color[5];
	   c1=new Color[5];
	   c2=new Color[5];
	   c3=new Color[5];
	   lbl1=new JLabel();
	   lbl2=new JLabel();
	   lbl3=new JLabel();
	   Font f=new Font("Arial",Font.ITALIC,50);
	   lbl1.setFont(f);
	   lbl1.setForeground(Color.orange);
	   getContentPane().add(lbl1);
	    lbl2.setFont(f);
	   lbl2.setForeground(Color.blue);
	   getContentPane().add(lbl2);
	    lbl3.setFont(f);
	   lbl3.setForeground(Color.yellow);
	   getContentPane().add(lbl3);
	   c[0]=new Color(0,225,0);
	   c[1]=new Color(0,0,225);
	   c[2]=new Color(225,0,0);
	   c[3]=new Color(0,255,0);
	   c[4]=new Color(0,1,255);
	    c2[0]=new Color(0,225,0);
	   c2[1]=new Color(0,0,225);
	   c2[2]=new Color(225,0,0);
	   c2[3]=new Color(0,255,0);
	   c2[4]=new Color(0,1,255);
	    c3[0]=new Color(0,225,0);
	   c3[1]=new Color(0,0,225);
	   c3[2]=new Color(225,0,0);
	   c3[3]=new Color(0,255,0);
	   c3[4]=new Color(0,1,255);
	   c1[0]=new Color(23,22,140);
	   c1[1]=new Color(11,45,22);
	   c1[2]=new Color(22,90,110);
	   c1[3]=new Color(146,25,23);
	   c1[4]=new Color(12,117,25);
	   lbl1.setBounds(50,50,1000,200);
	   lbl2.setBounds(50,150,1000,200);
	   lbl3.setBounds(50,350,1000,200);
	   jp.setLayout(null);
	   jp.add(lbl1);
	   jp.add(lbl2);
	   jp.add(lbl3);
	   th=new Thread(this);
	   th.start();
   }
		   public void run()
		   {
			   try
			   {
				   for( ; ; )
				   {
					   display();
					   th.sleep(1000);
				   }
			   }
			   catch(Exception e)
			   {
				   System.out.println("error message");
			   }
		   }
		   public void display()
		   {
			   lbl1.setText(names[ctr++]);
			   lbl2.setText(chocolate[ctr1++]);
			   lbl3.setText(company[ctr2++]);
			   lbl1.setForeground(c[j--]);
			   lbl2.setForeground(c2[t--]);
			   lbl3.setForeground(c3[p--]);
			   jp.setBackground(c1[i++]);
			   if(ctr>4)
				   ctr=0;
			   if(ctr1>4)
				   ctr1=0;
			   if(ctr2>4)
				   ctr2=0;
			   if(i>4)
				   i=0;
			   if(j<=0)
				   j=4;
			   if(t<=0)
				   t=4;
			   if(p<=0)
				   p=4;
		   }
	   }
   