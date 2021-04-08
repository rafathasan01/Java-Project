import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class Customer extends JFrame implements ActionListener
{
		String tm,msg,dt,des,oper;
	    JFrame f;
		JButton logout = new JButton("Log Out");
		JButton go = new JButton("Go");
		JLabel l1 = new JLabel("Time");
		JLabel l2 = new JLabel("Date");
		JLabel l3 = new JLabel("From");
		JLabel l4 = new JLabel("To");
		JLabel l5 = new JLabel("Operator");
		String From[]={"-------","Dhaka","Chottogram","Khulna","Sylhet","Rajshahi","Barishal","Rangpur"};
		String Date[]={"-------","10 Dec 2018","11 Dec 2018","12 Dec 2018","13 Dec 2018","14 Dec 2018","15 Dec 2018","16 Dec 2018"};
		String Time[]={"-------","10:00 am","11:00 am","12:00 pm","1:00pm","2:00 pm","3:00 pm","4:00 pm","5:00 pm","6:00 pm","7:00 pm","8:00 pm","9:00 pm","10:00 pm","11:00 pm"};
		String To[]={"-------","Dhaka","Chottogram","Khulna","Sylhet","Rajshahi","Barishal","Rangpur"};
		String Operator[]={"-------","Hanif","Desh Travels","Green Line","Saudia","Royal Coach","Shohag","Eagle","Ena"};
		JComboBox cb = new JComboBox(Time);
		JComboBox cb1= new JComboBox(Date);
		JComboBox cb2= new JComboBox(From);
		JComboBox cb3= new JComboBox(To);
		JComboBox cb4= new JComboBox(Operator);
		
	public Customer()
	{
		l1.setBounds(20,50,90,20);
		l2.setBounds(20,80,90,20);
		l3.setBounds(20,110,90,20);
		l4.setBounds(20,140,90,20);
		l5.setBounds(20,170,90,20);
		cb.setBounds(80,50,140,20);
		cb1.setBounds(80,80,140,20);
		cb2.setBounds(80,110,140,20);
		cb3.setBounds(80,140,140,20);
		cb4.setBounds(80,170,140,20);
		logout.setBounds(200,200,100,30);
		go.setBounds(100,200,100,30);
		add(cb);add(cb1);add(cb2);add(cb3);add(cb4);add(l1);add(l2);add(l3);add(l4);
		add(l5);add(logout);add(go);
		
		go.addActionListener(this);
		logout.addActionListener(this);
		cb.addActionListener(this);
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		cb3.addActionListener(this);
		cb4.addActionListener(this);
		this.setLayout(null);
		this.setSize(400,400);
		this.setVisible(true);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== cb2)
		{
			JComboBox from = (JComboBox)e.getSource();
			msg = (String)from.getSelectedItem();
			System.out.println("From :"+msg);
			/*switch(msg)
			{
				case "Dhaka": System.out.println("From Dhaka");
				break;
			}*/
		}
		if(e.getSource()== cb)
		{
			JComboBox time = (JComboBox)e.getSource();
			tm = (String)time.getSelectedItem();
			System.out.println("AT :"+tm);
			/*switch(tm)
			{
				case "10:00 am": System.out.println("AT 10 am");
				break;
				case "11:00 am": System.out.println("AT 11 am");
				break;
			}*/
		}
		if(e.getSource()== cb1)
		{
			JComboBox date=(JComboBox)e.getSource();
			dt=(String)date.getSelectedItem();
			System.out.println("Date :"+dt);
			
		}
		if(e.getSource()==cb3)
		{
			JComboBox to=(JComboBox)e.getSource();
			des=(String)to.getSelectedItem();
			System.out.println("TO :"+des);
		}
		if(e.getSource()==cb4)
		{
			JComboBox op=(JComboBox)e.getSource();
			oper=(String)op.getSelectedItem();
			System.out.println("Operator :"+oper);
		}
		if(e.getSource()==logout)
		{
			new FirstWelcome();
			this.setVisible(false);
		}
		if(e.getSource()==go)
		{
			String query = "select `busid`,`fare` from `businfo` where `busname`='"+oper+"' and `fromWhere`='"+msg+"' and `toWhere`='"+des+"' and `deptTime`='"+tm+"' ";
			try
			{
				DataBaseAccess da = new DataBaseAccess();
				da.busQuery(query);
			    String id=da.busId;
				String pr=da.price;
				if(id!=null)
					
				{new BusSeat(id,pr);
				this.setVisible(false);}
				
			 else 
			 {
				 JOptionPane.showMessageDialog(null,"No available Buses....try another!!");
			 }
			 
							
			}
			catch(Exception et){
				JOptionPane.showMessageDialog(null,"No available Buses....try another!!");
				System.out.println(et.getMessage());
			}
			System.out.println("Finding Bus");
		}
	}
	/*public static void main(String []args)
	{
		new Customer();
	}*/
}