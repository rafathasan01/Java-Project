import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.*;
public class AdminList extends JFrame implements ActionListener
{
	Employee a;
	JFrame f = new JFrame ("AdminList");
	ArrayList<AdminInfo> admin;
	DataBaseAccess da2;
	JTable jt;
	DefaultTableModel dtM;
	JButton back = new JButton("Back");
	
	public AdminList()
	{
		back.setBounds(200,400,100,30);
		back.addActionListener(this);
		String [] col = {"Admin Name","Email","Phone","Password"};
		this.dtM = new DefaultTableModel(col,0);
		admin = new ArrayList<AdminInfo>();
		setLocationRelativeTo(null);
		jt = new JTable(dtM);
		jt.setBounds(60,60,250,250);
		f.add(jt);
		f.add(back);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		try
		{
			String url = "jdbc:mysql://localhost:3306/Bus_ticket_management";
			String query = "Select * from admininfo;";
			this.da2 = new DataBaseAccess();
			da2.getAdminInfoData(query, admin);
			
			for(int i=0;i<admin.size();i++)
			{
				Object [] rd = new Object[4];
				rd[0] = admin.get(i).getadminName();
				rd[1] = admin.get(i).getadminEmail();
				rd[2] = admin.get(i).getadminPhone();
				rd[3] = admin.get(i).getpass();
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
			f.setVisible(false);
			new Employee();
		}
	}
	public static void main(String []args)
	{
		new AdminList();
	}
	
}