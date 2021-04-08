import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.*;
public class BusList1 extends JFrame implements ActionListener
{
	Employee a;
	JFrame d = new JFrame("Bus List");
	ArrayList<BusInfo> bsin;
	DataBaseAccess da;
	JTable jt;
	DefaultTableModel dtM;
	JButton back = new JButton("Back");
	JLabel lblbid=new JLabel("BUS ID");
	JLabel lblbname=new JLabel("NAME");
	JLabel lblbfw=new JLabel("FROM");
	JLabel lblbtw=new JLabel("TO");
	JLabel lblbdt=new JLabel("DEPT.");
	JLabel lblbat=new JLabel("ARR.");
	JLabel lblbts=new JLabel("SEAT");
	JLabel lblbfare=new JLabel("FARE");
	JLabel lbledetails=new JLabel("BUS DETAILS :");
	
	public BusList1()
	{
		
		back.setBounds(200,400,100,30);
		back.addActionListener(this);
		String [] col = {"Bus Id","Bus Name","From Where","To Where","Dept. Time","Arr. Time","Total Seat","Fare"};
		this.dtM = new DefaultTableModel(col,0);
		bsin = new ArrayList<BusInfo>();
		setLocationRelativeTo(null);
		jt = new JTable(dtM);
		jt.setBounds(16,70,450,300);
		lblbid.setBounds(18,30,75,50);
		lblbname.setBounds(75,30,75,50);
		lblbfw.setBounds(135,30,75,50);
		lblbtw.setBounds(190,30,75,50);
		lblbdt.setBounds(245,30,75,50);
		lblbat.setBounds(300,30,75,50);
		lblbts.setBounds(355,30,75,50);
		lblbfare.setBounds(410,30,75,50);
		lbledetails.setBounds(10,0,200,50);
		d.add(jt);d.add(lblbid);d.add(lblbname);d.add(lblbfw);d.add(lblbtw);d.add(lblbdt);d.add(lblbat);d.add(lblbts);d.add(lblbfare);d.add(lbledetails);
		d.add(back);
		d.setSize(500,500);
		d.setLayout(null);
		d.setVisible(true);
		d.setLocationRelativeTo(null);
		d.setDefaultCloseOperation(EXIT_ON_CLOSE);
		try
		{
			String url = "jdbc:mysql://localhost:3306/bus_ticket_management";
			String query = "Select * from businfo;";
			this.da = new DataBaseAccess();
			da.getBusInfoData(query, bsin);
			
			for(int i=0;i<bsin.size();i++)
			{
				Object [] rd = new Object[8];
				rd[0] = bsin.get(i).getbusid();
				rd[1] = bsin.get(i).getbusName();
				rd[2] = bsin.get(i).getfromWhere();
				rd[3] = bsin.get(i).gettoWhere();
				rd[4] = bsin.get(i).getdeptTime();
				rd[5] = bsin.get(i).getarrTime();
				rd[6] = bsin.get(i).gettotalSeat();
				rd[7] = bsin.get(i).getfare();
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
			d.setVisible(false);
			new Employee();
		}
	}
	public static void main(String []args)
	{
		new BusList1();
	}
	
}