import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
class FirstWelcome extends JFrame implements ActionListener
{
	JButton admin = new JButton("Log in Admin");
	JButton employee = new JButton("Log in Employee");
	JButton customer = new JButton("Log in Customer");
	JFrame r = new JFrame("Welcome");
	ImageIcon l =new ImageIcon(getClass().getResource("1.jpg"));
	JLabel login= new JLabel(l);
	
	public FirstWelcome()
	{
		r.setSize(800,400);
		login.setBounds(0,0,800,400);
		admin.setBounds(300,80,200,40);
		employee.setBounds(300,160,200,40);
		customer.setBounds(300,240,200,40);
		admin.addActionListener(this);
		employee.addActionListener(this);
		customer.addActionListener(this);
		r.add(admin);r.add(employee);r.add(customer);r.add(login);
		r.setLocationRelativeTo(null);
		r.setVisible(true);
		r.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==admin)
		{
			new AdminPanel();
			r.setVisible(false);
			System.out.println("Log in to Admin");
		}
		if(e.getSource()==employee)
		{
			new EmployeePanel();
			r.setVisible(false);
			System.out.println("Log in to Employee");
		}
		if(e.getSource()==customer)
		{
			new WelcomePanel();
			r.setVisible(false);
			System.out.println("Log in to Customer");
		}
	}
	public static void main(String []args)
	{
		new FirstWelcome();
	}
}