import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.*;
public class EmpList extends JFrame implements ActionListener
{
	Employee a;
	JFrame i = new JFrame("Employee List");
	ArrayList<EmpInfo> empin;
	DataBaseAccess da1;
	JTable jt;
	DefaultTableModel dtM;
	JButton back = new JButton("Back");
	JLabel lblename=new JLabel("NAME");
	JLabel lblepost=new JLabel("POST");
	JLabel lblephone=new JLabel("PHONE");
	JLabel lbleemail=new JLabel("EMAIL");
	JLabel lblesal=new JLabel("SALLARY");
	JLabel lblepass=new JLabel("PASSWORD");
	JLabel lbledetails=new JLabel("EMPLOYEE DETAILS :");
	
	
	public EmpList()
	{
		back.setBounds(200,400,100,30);
		back.addActionListener(this);
		String [] col = {"Employee Name","Post","Phone","Email","Salary","Password"};
		this.dtM = new DefaultTableModel(col,0);
		empin = new ArrayList<EmpInfo>();
		setLocationRelativeTo(null);
		jt = new JTable(dtM);
		jt.setBounds(16,70,450,300);
		lblename.setBounds(20,30,75,50);
		lblepost.setBounds(100,30,75,50);
		lblephone.setBounds(170,30,75,50);
		lbleemail.setBounds(250,30,75,50);
		lblesal.setBounds(320,30,75,50);
		lblepass.setBounds(392,30,75,50);
		lbledetails.setBounds(10,0,200,50);
		i.add(jt);i.add(lblename);i.add(lblepost);i.add(lblephone);i.add(lbleemail);i.add(lblesal);i.add(lblepass);i.add(lbledetails);
		i.add(back);
		i.setSize(500,500);
		i.setLayout(null);
		i.setVisible(true);
		i.setLocationRelativeTo(null);
		i.setDefaultCloseOperation(EXIT_ON_CLOSE);
		try
		{
			String url = "jdbc:mysql://localhost:3306/Bus_ticket_management";
			String query = "Select * from empinfo;";
			this.da1 = new DataBaseAccess();
			da1.getEmpInfoData(query, empin);
			
			for(int i=0;i<empin.size();i++)
			{
				Object [] rd = new Object[6];
				rd[0] = empin.get(i).getename();
				rd[1] = empin.get(i).getempJob();
				rd[2] = empin.get(i).getempPhone();
				rd[3] = empin.get(i).getempEmail();
				rd[4] = empin.get(i).getempSal();
				rd[5] = empin.get(i).getpass();
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
			i.setVisible(false);
			new Admin();
		}
	}
	public static void main(String []args)
	{
		new EmpList();
	}
	
}