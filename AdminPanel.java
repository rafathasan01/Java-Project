import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
class AdminPanel extends JFrame implements ActionListener{
	JFrame w = new JFrame("Admin Panel");
	String Uname1,ps1;
	JButton btnlogin=new JButton("Log IN");
	JLabel lblun=new JLabel ("Username :");
	JLabel lblpass=new JLabel ("Password :");
	JTextField uname1=new JTextField();
	JPasswordField upass=new JPasswordField();
	
	ImageIcon login =new ImageIcon(getClass().getResource("login.jpg"));
	JLabel blogin=new JLabel(login);
	JButton back = new JButton("Back");

public AdminPanel()
	{
	w.setSize(400,300);
	back.addActionListener(this);
	w.add(back);
	lblun.setBounds(10,30,200,30);
	lblpass.setBounds(10,70,200,30);
	uname1.setBounds(120,30,230,30);
	upass.setBounds(120,70,230,30);
	btnlogin.setBounds(150,140,100,30);
	back.setBounds(150,180,100,30);
	blogin.setBounds(0,0,400,300);
	btnlogin.setBackground(Color.black);
	btnlogin.setForeground(Color.white);
	btnlogin.addActionListener(this);
	w.add(lblpass);w.add(lblun);w.add(uname1);w.add(upass);w.add(btnlogin);w.add(blogin);
	w.setLocationRelativeTo(null);
	w.setVisible(true);
	w.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
public void actionPerformed(ActionEvent e)
	
	{
	{
	if(e.getSource()==btnlogin)
		{
			Uname1=uname1.getText();
			ps1=upass.getText();
			String query = "select fname,pass from admininfo where pass ='"+ps1+"'; ";
			try{
				DataBaseAccess da2 = new DataBaseAccess();
				da2.selectQuery(query);
				if(da2.pswd2.equals(ps1))
				{new Admin();
			 w.setVisible(false);
			 }
							
			}
			catch(Exception et){
				JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}//JOptionPane.showMessageDialog(null,"You are logged in");
		}
	}
	if(e.getSource()==back)
		{
		w.setVisible(false);
		new FirstWelcome();
		}
	
	}

public static void main(String []args)
{
	new AdminPanel();
}
}


