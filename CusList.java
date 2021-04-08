import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.*;
public class CusList extends JFrame implements ActionListener
{
	Employee a;
	JFrame g = new JFrame("Customer List");
	ArrayList<CusInfo> ins;
	DataBaseAccess da;
	JTable jt;
	DefaultTableModel dtM;
	JButton back = new JButton("Back");
	JLabel lblcfname=new JLabel("FIRST NAME");
	JLabel lblclname=new JLabel("LAST NAME");
	JLabel lblcemail=new JLabel("EMAIL");
	JLabel lblcpass=new JLabel("PASSWORD");
	JLabel lblcdetails=new JLabel("CUSTOMER DETAILS :");
	
	public CusList()
	{
		back.setBounds(200,400,100,30);
		back.addActionListener(this);
		String [] col = {"First Name","Last Name","Email","Password"};
		this.dtM = new DefaultTableModel(col,0);
		ins = new ArrayList<CusInfo>();
		setLocationRelativeTo(null);
		jt = new JTable(dtM);
		jt.setBounds(16,70,450,300);
		lblcfname.setBounds(20,30,75,50);
		lblclname.setBounds(132,30,75,50);
		lblcemail.setBounds(244,30,75,50);
		lblcpass.setBounds(356,30,75,50);
		lblcdetails.setBounds(10,0,200,50);
		g.add(jt);g.add(lblcfname);g.add(lblclname);g.add(lblcemail);g.add(lblcpass);g.add(lblcdetails);
		g.add(back);
		g.setSize(500,500);
		g.setLayout(null);
		g.setVisible(true);
		g.setLocationRelativeTo(null);
		g.setDefaultCloseOperation(EXIT_ON_CLOSE);
		try
		{
			String url = "jdbc:mysql://localhost:3306/Bus_ticket_management";
			String query = "Select * from custminfo;";
			this.da = new DataBaseAccess();
			da.getInfoData(query, ins);
			
			for(int i=0;i<ins.size();i++)
			{
				Object [] rd = new Object[4];
				rd[0] = ins.get(i).getFname();
				rd[1] = ins.get(i).getLname();
				rd[2] = ins.get(i).getEmail();
				rd[3] = ins.get(i).getPass();
				dtM.addRow(rd);
			}
			
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==back)
		{
			g.setVisible(false);
			new Admin();
		}
	}
	public static void main(String []args)
	{
		new CusList();
	}
	
}