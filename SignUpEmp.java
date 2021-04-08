import javax.swing.*;
import java.awt.event.*; 
import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
class SignUpEmp extends JFrame implements ActionListener
{
	WelcomePanel Q;
	String ename, EmpJob, EmpPhone, EmpEmail, EmpSal, Pass;
	JLabel lblfname=new JLabel("Name :");
	JLabel lblempJob=new JLabel("Job : ");
	JLabel lblempPhone=new JLabel("Phone:");
	JLabel lblempEmail = new JLabel("Email:");
	JLabel lblempSal=new JLabel("Sallary :");
	JLabel lblpass=new JLabel("Password :");
	JLabel lblempsignup=new JLabel("PLEASE FILL UP THE FORM TO REGESTER AS AN EMPLOYEE :");
	JButton cancel = new JButton("Cancel");
	JTextField Emname=new JTextField();
	JTextField empJob=new JTextField();
	JTextField empPhone=new JTextField();
	JTextField empEmail=new JTextField();
	JTextField empSal=new JTextField();
	JPasswordField pass=new JPasswordField();
	JButton save1=new JButton("Save");
	ImageIcon signup=new ImageIcon(getClass().getResource("signup.jpg"));
	JLabel img=new JLabel(signup);
	JFrame m = new JFrame("Employee Signup");
	
	public SignUpEmp()
	{
		m.setSize(500,500);
		lblfname.setBounds(40,40,100,30);
		lblempJob.setBounds(40,80,100,30);
		lblempPhone.setBounds(40,120,100,30);
		lblempEmail.setBounds(40,160,100,30);
		lblempSal.setBounds(40,200,100,30);
		lblpass.setBounds(40,240,100,30);
		lblempsignup.setBounds(10,0,450,50);
		Emname.setBounds(150,40,250,30);
		empJob.setBounds(150,80,250,30);
		empPhone.setBounds(150,120,250,30);
		empEmail.setBounds(150,160,250,30);
		empSal.setBounds(150,200,250,30);
		pass.setBounds(150,240,250,30);
		save1.setBounds(80,290,100,30);
		cancel.setBounds(200,290,100,30);
		img.setBounds(0,0,500,500);
		save1.setBackground(Color.green);
		m.setLocationRelativeTo(null);
		m.setVisible(true);
		m.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		save1.addActionListener(this);
		cancel.addActionListener(this);
		m.add(lblfname);m.add(Emname);m.add(lblempJob);m.add(empJob);m.add(lblempPhone);m.add(empPhone);m.add(lblempEmail);m.add(empEmail);m.add(lblempSal);m.add(empSal);m.add(lblpass);m.add(lblempsignup);
		m.add(pass);m.add(save1);m.add(cancel);m.add(img);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==save1)
		{
			ename=ename.getText();
			EmpJob=empJob.getText();
			EmpPhone=empPhone.getText();
			EmpEmail=empEmail.getText();
			EmpSal=empSal.getText();
			Pass=pass.getText();
			String query = "insert into empinfo(ename,empJob,empPhone,empEmail,empSal,pass) values('"+ename + "','"+EmpJob+"','"+ EmpPhone+"','"+ EmpEmail+"','"+ EmpSal+"','"+Pass+"')";
			try{
				DataBaseAccess da1 = new DataBaseAccess();
				da1.insertQuery(query);
			}
			catch(Exception et){
				System.out.println(et.getMessage());
			}
		JOptionPane.showMessageDialog(null,"Account created");
		}
		if(e.getSource()==cancel)
		{
			new Admin();
			m.setVisible(false);
			
		}
	}
	/*public static void main(String [] args)
	{
		new SignUpEmp();
	}*/
}