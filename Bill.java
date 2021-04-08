import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
public class Bill extends JFrame implements ActionListener
{
	JFrame r = new JFrame("Bill");
	String name;
	int Price;
	//JLabel l1,l2,l3,l4;
    
    JLabel l3= new JLabel("Seat No :");
    JLabel l4= new JLabel("Date :");
	JButton b1 = new JButton("Save");
	JButton b2 = new JButton("Log Out");
public Bill()
{
	//empty;
}
    
public Bill(String name,int cost)
{
	this.name=name;
	this.Price=cost;

    JLabel l2= new JLabel("Total Price : "+Price);
    b1.setBounds(40,160,80,30);
	b2.setBounds(140,160,80,30);
	l2.setBounds(50,70,100,30);
	l3.setBounds(50,90,100,30);
	l4.setBounds(50,110,100,30);
	
	r.add(l2);//r.add(l3);r.add(l4);
	r.add(b1);r.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	r.setSize(400,400);
	r.setLocationRelativeTo(null);
	r.setLayout(null);  
    r.setVisible(true);
	r.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		new FirstWelcome();
		r.setVisible(false);
	}
	if(e.getSource()==b2)
	{
		new WelcomePanel();
		r.setVisible(false);
	}
}
public static void main (String[] args)
{
	new Bill();
}	
}
