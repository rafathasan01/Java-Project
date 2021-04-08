import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.*;
public class TicketSaleList1 extends JFrame implements ActionListener
{
	Employee a;
	JFrame r = new JFrame("Ticket Sale");
	ArrayList<TicketSaleInfo> tin;
	DataBaseAccess da;
	JTable jt;
	DefaultTableModel dtM;
	JButton back = new JButton("Back");
	JLabel lblbid=new JLabel("BUS NAME");
	JLabel lblbname=new JLabel("SEAT NO");
	JLabel lblbfw=new JLabel("BUS ID");
	JLabel lblbtw=new JLabel("DATE");
	JLabel lbledetails=new JLabel("ALL TICKET SOLD LIST :");
	
	public TicketSaleList1()
	{
		
		back.setBounds(200,400,100,30);
		back.addActionListener(this);
		String [] col = {"Bus Id","Bus Name","From Where","To Where","Dept. Time","Arr. Time","Total Seat","Fare"};
		this.dtM = new DefaultTableModel(col,0);
		tin = new ArrayList<TicketSaleInfo>();
		setLocationRelativeTo(null);
		jt = new JTable(dtM);
		jt.setBounds(16,70,450,300);
		lblbid.setBounds(20,30,75,50);
		lblbname.setBounds(132,30,75,50);
		lblbfw.setBounds(244,30,75,50);
		lblbtw.setBounds(356,30,75,50);
		lbledetails.setBounds(10,0,200,50);
		r.add(jt);r.add(lblbid);r.add(lblbname);r.add(lblbfw);r.add(lblbtw);r.add(lbledetails);
		r.add(back);
		r.setSize(500,500);
		r.setLayout(null);
		r.setVisible(true);
		r.setLocationRelativeTo(null);
		r.setDefaultCloseOperation(EXIT_ON_CLOSE);
		try
		{
			String url = "jdbc:mysql://localhost:3306/bus_ticket_management";
			String query = "Select * from ticket_sold;";
			this.da = new DataBaseAccess();
			da.getTicketSaleInfoData(query, tin);
			
			for(int i=0;i<tin.size();i++)
			{
				Object [] rd = new Object[4];
				rd[0] = tin.get(i).getfname();
				rd[1] = tin.get(i).getseat_num();
				rd[2] = tin.get(i).getbusid();
				rd[3] = tin.get(i).getdate();
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
			this.setVisible(false);
			new Employee();
		}
	}
	public static void main(String []args)
	{
		new TicketSaleList1();
	}
	
}