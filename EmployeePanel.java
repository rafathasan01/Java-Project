import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
class EmployeePanel extends JFrame implements ActionListener{
	String Uname2,ps2;
	JButton btnlogin=new JButton("Log IN");
	JLabel lblun=new JLabel ("Username :");
	JLabel lblpass=new JLabel ("Password :");
	JTextField uname2=new JTextField();
	JPasswordField upass2=new JPasswordField();
	JFrame w = new JFrame("Employee");
	ImageIcon login =new ImageIcon(getClass().getResource("login.jpg"));
	JLabel blogin=new JLabel(login);
	JButton back = new JButton("Back");

public EmployeePanel()
	{
	w.setSize(400,300);
	back.addActionListener(this);
	w.add(back);
	lblun.setBounds(10,30,200,30);
	lblpass.setBounds(10,70,200,30);
	uname2.setBounds(120,30,230,30);
	upass2.setBounds(120,70,230,30);
	btnlogin.setBounds(150,140,100,30);
	back.setBounds(150,180,100,30);
	blogin.setBounds(0,0,400,300);
	btnlogin.setBackground(Color.black);
	btnlogin.setForeground(Color.white);
	btnlogin.addActionListener(this);
	w.add(lblpass);w.add(lblun);w.add(uname2);w.add(upass2);w.add(btnlogin);w.add(blogin);
	w.setLocationRelativeTo(null);
	w.setVisible(true);
	w.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
public void actionPerformed(ActionEvent e)
	
	{
	{
	if(e.getSource()==btnlogin)
		{
			Uname2=uname2.getText();
			ps2=upass2.getText();
			String query = "select ename,pass from empinfo where pass ='"+ps2+"'; ";
			try{
				DataBaseAccess da1 = new DataBaseAccess();
				da1.selectQuery(query);
				if(da1.pswd1.equals(ps2))
				{new Employee();
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
	new EmployeePanel();
}
}


