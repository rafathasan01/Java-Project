import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
class Admin extends JFrame implements ActionListener
{ 
    JFrame f = new JFrame ("Admin");
	JButton emplist = new JButton("Employee List");
	JButton buslist=new JButton("Bus List");
	JButton cusslist=new JButton("Customer List");
	JButton ticktsale=new JButton("Ticket Sale");
	JButton addemp=new JButton("Add Employee");
	JButton rmvemp=new JButton("Delete Employee");
	JButton logout=new JButton("Log Out");
	
	
	ImageIcon admin=new ImageIcon(getClass().getResource("admin.jpg"));
	JLabel img=new JLabel(admin);
	

	public Admin()
	{
		f.setSize(500,500);
		emplist.setBounds(140,30,200,50);
		cusslist.setBounds(140,90,200,50);
		buslist.setBounds(140,150,200,50);
		ticktsale.setBounds(140,210,200,50);
		addemp.setBounds(140,270,200,50);
		logout.setBounds(140,340,200,50);
		img.setBounds(0,0,500,500);
		cusslist.setBackground(Color.cyan);
		buslist.setBackground(Color.cyan);
		ticktsale.setBackground(Color.cyan);
		emplist.setBackground(Color.cyan);
		addemp.setBackground(Color.cyan);
		rmvemp.setBackground(Color.cyan);
		logout.setBackground(Color.cyan);
		cusslist.addActionListener(this);
		buslist.addActionListener(this);
		ticktsale.addActionListener(this);
		emplist.addActionListener(this);
		addemp.addActionListener(this);
		rmvemp.addActionListener(this);
		logout.addActionListener(this);
		f.add(cusslist);f.add(buslist);f.add(ticktsale);f.add(emplist);f.add(addemp);add(rmvemp);f.add(logout);f.add(img);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{{{{
	{
	{
		{
			if(e.getSource()==emplist)
			{
				//JOptionPane.showMessageDialog(null,"Fill form to sign up");
		       new EmpList();
		       f.setVisible(false);
				
			}
		}
	if(e.getSource()==cusslist)
		{//JOptionPane.showMessageDialog(null,"Fill form to sign up");
		 new CusList();
		 f.setVisible(false);
		}
	}
	if(e.getSource()==buslist)
		{//JOptionPane.showMessageDialog(null,"Fill form to sign up");
		 new BusList();
		 f.setVisible(false);
		}
	}
	if(e.getSource()==ticktsale)
		{//JOptionPane.showMessageDialog(null,"Fill form to sign up");
		 new TicketSaleList();
		 f.setVisible(false);
		}
	}
	if(e.getSource()==addemp)
		{//JOptionPane.showMessageDialog(null,"Fill form to sign up");
		 new SignUpEmp();
		 f.setVisible(false);
		}
	}
	/*if(e.getSource()==rmvemp)
		{//JOptionPane.showMessageDialog(null,"Fill form to sign up");
		 new Empdel();
		 f.setVisible(false);
		}*/
	}
	if(e.getSource()==logout)
		{
			new FirstWelcome();
			f.setVisible(false);
		}
	}
	public static void main(String [] args)
	{
		Admin a = new Admin();
	}
}

