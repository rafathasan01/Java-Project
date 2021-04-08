import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
class Employee extends JFrame implements ActionListener
{
	JButton cusslist=new JButton("Customer List");
	JButton buslist=new JButton("Bus List");
	JButton ticktsale=new JButton("Ticket Sale");
	JButton logout = new JButton("Log Out");
	
	ImageIcon employee=new ImageIcon(getClass().getResource("employee.jpg"));
	JLabel img=new JLabel(employee);
	JFrame s = new JFrame ("Employee");
	
	public Employee()
	{
		s.setSize(500,500);
		cusslist.setBounds(140,110,200,50);
		buslist.setBounds(140,180,200,50);
		ticktsale.setBounds(140,250,200,50);
		logout.setBounds(140,320,200,50);
		img.setBounds(0,0,500,500);
		cusslist.setBackground(Color.cyan);
		buslist.setBackground(Color.cyan);
		ticktsale.setBackground(Color.cyan);
		logout.setBackground(Color.cyan);
		cusslist.addActionListener(this);
		buslist.addActionListener(this);
		ticktsale.addActionListener(this);
		logout.addActionListener(this);
		s.add(cusslist);s.add(buslist);s.add(ticktsale);s.add(logout);s.add(img);
		s.setLocationRelativeTo(null);
		s.setVisible(true);
		s.setLayout(null);
		s.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
	{
	{
	{
	
	if(e.getSource()==cusslist)
		{//JOptionPane.showMessageDialog(null,"Fill form to sign up");
		 new CusList1();
		 s.setVisible(false);
		}
	}
	if(e.getSource()==buslist)
		{//JOptionPane.showMessageDialog(null,"Fill form to sign up");
		 new BusList1();
		 s.setVisible(false);
		}
	}
	if(e.getSource()==ticktsale)
		{//JOptionPane.showMessageDialog(null,"Fill form to sign up");
		 new TicketSaleList1();
		 s.setVisible(false);
		}
	}
	if(e.getSource()==logout)
		{
			new FirstWelcome();
			s.setVisible(false);
		}
	}
	public static void main(String [] args)
	{
		Employee e = new Employee();
	}
}