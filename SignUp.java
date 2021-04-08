import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
class SignUp extends JFrame implements ActionListener
{
	WelcomePanel Q;
	String Fname,Lname,Email,Pass;
	JLabel lblfname=new JLabel("First Name :");
	JLabel lbllname=new JLabel("Last Name: ");
	JLabel lblemail=new JLabel("E-mail :");
	JLabel lblpass = new JLabel("Password :");
	JLabel lblcpass=new JLabel("Confirm Pass :");
	JLabel lblcussignup=new JLabel("PLEASE FILL UP THE FORM TO REGESTER AS AN CUSTOMER :");
	JButton cancel = new JButton("Back");
	JTextField fname=new JTextField();
	JTextField lname=new JTextField();
	JPasswordField pass=new JPasswordField();
	JPasswordField cpass=new JPasswordField();
	JTextField email=new JTextField();
	JButton save=new JButton("Save");
	ImageIcon signup=new ImageIcon(getClass().getResource("signup.jpg"));
	JLabel img=new JLabel(signup);
	JFrame s = new JFrame("Sign Up");
	
	public SignUp()
	{
		s.setSize(500,500);
		lblfname.setBounds(40,40,100,30);
		lbllname.setBounds(40,80,100,30);
		lblemail.setBounds(40,120,100,30);
		lblpass.setBounds(40,160,100,30);
		lblcpass.setBounds(40,200,100,30);
		lblcussignup.setBounds(10,0,450,50);
		fname.setBounds(150,40,250,30);
		lname.setBounds(150,80,250,30);
		email.setBounds(150,120,250,30);
		pass.setBounds(150,160,250,30);
		cpass.setBounds(150,200,250,30);
		save.setBounds(80,290,100,30);
		cancel.setBounds(200,290,100,30);
		img.setBounds(0,0,500,500);
		save.setBackground(Color.green);
		s.setLocationRelativeTo(null);
		s.setVisible(true);
		s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		save.addActionListener(this);
		cancel.addActionListener(this);
		s.add(lblcpass);s.add(lblfname);s.add(lbllname);s.add(cancel);s.add(lblemail);s.add(lblpass);s.add(fname);s.add(lname);s.add(email);s.add(lblcussignup);
		s.add(pass);s.add(cpass);s.add(save);s.add(img);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==save)
		{
			Fname=fname.getText();
			Lname=lname.getText();
			Email=email.getText();
			Pass=pass.getText();
			String query = "insert into custminfo(fname,lname,email,pass) values('"+Fname + "','"+Lname+"','"+ Email+"','"+Pass+"')";
			try{
				DataBaseAccess da = new DataBaseAccess();
				da.insertQuery(query);
			}
			catch(Exception et){
				System.out.println(et.getMessage());
			}
		JOptionPane.showMessageDialog(null,"Account created");
		}
		if(e.getSource()==cancel)
		{
			new WelcomePanel();
			s.setVisible(false);
			
		}
	}
	/*public static void main(String [] args)
	{
		new SignUp();
	}*/
}