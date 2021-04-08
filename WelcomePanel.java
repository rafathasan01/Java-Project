import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
class WelcomePanel extends JFrame implements ActionListener{
	String Uname,ps;
	JButton btnlogin=new JButton("Log IN");
	JButton btnsignup=new JButton("Sign Up");
	JLabel lblun=new JLabel ("Username :");
	JLabel lblpass=new JLabel ("Password :");
	JTextField uname=new JTextField();
	JPasswordField upass=new JPasswordField();
	JFrame w = new JFrame("Welcome");
	ImageIcon login =new ImageIcon(getClass().getResource("login.jpg"));
	JLabel blogin=new JLabel(login);
	JButton back = new JButton("Back");

public WelcomePanel()
	{
	w.setSize(400,300);
	back.addActionListener(this);
	w.add(back);
	lblun.setBounds(10,30,200,30);
	lblpass.setBounds(10,70,200,30);
	uname.setBounds(120,30,230,30);
	upass.setBounds(120,70,230,30);
	btnlogin.setBounds(150,120,100,30);
	btnsignup.setBounds(150,160,100,30);
	back.setBounds(150,200,100,30);
	blogin.setBounds(0,0,400,300);
	btnlogin.setBackground(Color.black);
	btnlogin.setForeground(Color.white);
	btnsignup.setBackground(Color.blue);
	btnsignup.setForeground(Color.white);
	btnlogin.addActionListener(this);
	btnsignup.addActionListener(this);
	w.add(lblpass);w.add(lblun);w.add(uname);w.add(upass);w.add(btnlogin);w.add(btnsignup);w.add(blogin);
	w.setLocationRelativeTo(null);
	w.setVisible(true);
	w.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
public void actionPerformed(ActionEvent e)
	
	{{{
	if(e.getSource()==btnlogin)
		{
			Uname=uname.getText();
			ps=upass.getText();
			String query = "select fname,pass from custminfo where pass ='"+ps+"'; ";
			try{
				DataBaseAccess da = new DataBaseAccess();
				da.selectQuery(query);
				if(da.pswd.equals(ps))
				{new Customer();
			 w.setVisible(false);
			 }
							
			}
			catch(Exception et){
				JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}//JOptionPane.showMessageDialog(null,"You are logged in");
		}
	}
	if(e.getSource()==btnsignup)
		{//JOptionPane.showMessageDialog(null,"Fill form to sign up");
		new SignUp();
		w.setVisible(false);
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
	new WelcomePanel();
}
}


