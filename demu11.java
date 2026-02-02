import java.awt.*;
import javax.swing.*;
import java.awt.event .*; 
/*<applet code="demu11.class" width="1000" height="1000"></applet>*/
public class demu11 extends JApplet implements ItemListener
{
	JLabel jl;
	JComboBox jcb;
	JPanel jp;
	JTable tb;
	int vs=0,hs=0;
	JScrollPane jsp;
	final String Heading[]={"name","age","address","qualification","city","contact number"};
	final String data1[][]={{"Sahar","20","Bamarauli","graduate","prayagraj","9898766754"},{"Naindip","22","sulem sarai","graduate","prayagraj","8765433289"},{"Dilip","20","preetamnagar","graduate","prayagraj","8765433289"}};
    final String data2[][]={{"Adiba","20","kareli","graduate","prayagraj","9898766754"},{"Riya","22","sulem sarai","graduate","prayagraj","8765433289"},{"Diya","20","preetamnagar","graduate","prayagraj","12323756644"}};
	final String data3[][]={{"priya","18","manauri","graduate","prayagraj","9898766754"},{"Saroj","19","Lukarganj","10+2","prayagraj","8765433289"},{"Fatima","17","Telierganj","10+2","prayagraj","9987123666"}};
	final String data4[][]={{"Sahar","18","manauri","graduate","prayagraj","9898766754"},{"Naindip","19","Lukarganj","10+2","prayagraj","8765433289"},{"Preeti","17","Telierganj","10+2","prayagraj","9977456787"}};
	final String data5[][]={{"Bebika","18","manauri","graduate","prayagraj","9898766754"},{"Manisha","19","Lukarganj","10+2","prayagraj","8765433289"},{"Dipti","17","Telierganj","10+2","prayagraj","3456789786"}};
	final String data6[][]={{"Puja","18","manauri","graduate","prayagraj","9898766754"},{"Kavya","19","Lukarganj","10+2","prayagraj","8765433289"},{"Ujjwal","17","Telierganj","10+2","prayagraj","9898567434"}};
	final String data7[][]={{"Ayush","18","manauri","graduate","prayagraj","9898766754"},{"Karan","19","Lukarganj","10+2","prayagraj","8765433289"},{"Kiran","17","Telierganj","10+2","prayagraj","7989856434"}};
	final String data8[][]={{"Babli","18","manauri","graduate","prayagraj","9898766754"},{"Dheeraj","19","Lukarganj","10+2","prayagraj","8765433289"},{"Deepak","17","Telierganj","10+2","prayagraj","2345676544"}};
	final String data9[][]={{"Lavkush","18","manauri","graduate","prayagraj","9898766754"},{"Kriti","19","Lukarganj","10+2","prayagraj","8765433289"},{"Sita","17","Telierganj","10+2","prayagraj","9898766754"}};
	final String data10[][]={{"Ram","18","manauri","graduate","prayagraj","9898766754"},{"Bharat","19","Lukarganj","10+2","prayagraj","8765433289"},{"Naina","17","Telierganj","10+2","prayagraj","8764422232"}};
	final String data11[][]={{"Shunaina","18","manauri","graduate","prayagraj","9898766754"},{"Pankaj","19","Lukarganj","10+2","prayagraj","8765433289"},{"Geeta","17","Telierganj","10+2","prayagraj","3334444232"}};
	final String data12[][]={{"Dipti","18","manauri","graduate","prayagraj","9898766754"},{"Kunal","19","Lukarganj","10+2","prayagraj","8765433289"},{"Firoz","17","Telierganj","10+2","prayagraj","9765423332"}};
	final String data13[][]={{"Vinod","18","manauri","graduate","prayagraj","9898766754"},{"Yuraj","19","Lukarganj","10+2","prayagraj","8765433289"},{"Faiz","17","Telierganj","10+2","prayagraj","1234445567"}};
	final String data14[][]={{"Tarun","18","manauri","graduate","prayagraj","9898766754"},{"Taruni","19","Lukarganj","10+2","prayagraj","8765433289"},{"Akash","17","Telierganj","10+2","prayagraj","2345432345"}};
	final String data15[][]={{"Sakshi","18","manauri","graduate","prayagraj","9898766754"},{"Deep","19","Lukarganj","10+2","prayagraj","8765433289"},{"Gopal","17","Telierganj","10+2","prayagraj","9898767654"}};
	final String data16[][]={{"Heema","18","manauri","graduate","prayagraj","9898766754"},{"Meena","19","Lukarganj","10+2","prayagraj","8765433289"},{"Jatin","17","Telierganj","10+2","prayagraj","2345543234"}};
	public void init()
	{
		jp=new JPanel();
		getContentPane().add(jp);
		jl=new JLabel("Choose a batch");
		jl.setBounds(20,50,100,20);
		jp.setLayout(null);
		jp.add(jl);
		String batch[]={"a31","a32","a49","a48","a50","a51","a52","a35","a36","a37","a38","a39","a40","a41","a42","a43"};
		jcb=new JComboBox(batch);
		jcb.setBounds(120,50,100,20);
		jp.add(jcb);
		tb=new JTable(data1,Heading);
		tb.setBackground(Color.blue);
		vs=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		hs=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		jsp=new JScrollPane(tb,vs,hs);
		jsp.setBounds(50,100,400,400);
		jp.add(jsp);
		 getContentPane().add(hs);
		jcb.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
      String str=(String)jcb.getSelectedItem();
      showStatus(str);
     if(str.equals("a31"))
    {
	tb=new JTable(data1,Heading);
	tb.setBackground(Color.pink);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
    if(str.equals("a32"))
    {
	tb=new JTable(data2,Heading);
	tb.setBackground(Color.yellow);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
    if(str.equals("a49"))
    {
	tb=new JTable(data3,Heading);
	tb.setBackground(Color.green);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a48"))
    {
	tb=new JTable(data4,Heading);
	tb.setBackground(Color.red);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a50"))
    {
	tb=new JTable(data5,Heading);
	tb.setBackground(Color.blue);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a42"))
    {
	tb=new JTable(data16,Heading);
	tb.setBackground(Color.white);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a51"))
    {
	tb=new JTable(data6,Heading);
	tb.setBackground(Color.orange);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a52"))
    {
	tb=new JTable(data7,Heading);
	tb.setBackground(Color.red);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a35"))
    {
	tb=new JTable(data8,Heading);
	tb.setBackground(Color.pink);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a36"))
    {
	tb=new JTable(data9,Heading);
	tb.setBackground(Color.yellow);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a37"))
    {
	tb=new JTable(data15,Heading);
	tb.setBackground(Color.blue);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a38"))
    {
	tb=new JTable(data10,Heading);
	tb.setBackground(Color.pink);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a39"))
    {
	tb=new JTable(data11,Heading);
	tb.setBackground(Color.white);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a40"))
    {
	tb=new JTable(data12,Heading);
	tb.setBackground(Color.red);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	 if(str.equals("a41"))
    {
	tb=new JTable(data13,Heading);
	tb.setBackground(Color.green);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
	if(str.equals("a43"))
    {
	tb=new JTable(data14,Heading);
	tb.setBackground(Color.pink);
	jp.remove(jsp);
	jsp=new JScrollPane(tb,vs,hs);
	jsp.setBounds(50,100,400,400);
	jp.add(jsp);
    }
  }
}
	