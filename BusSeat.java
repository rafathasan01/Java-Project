import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
public class BusSeat extends JFrame implements ActionListener {
	String busid;
	String Name;
	String B="booked";
	String price;
	int tc=0;
	
	
	String date ="16 dec 2018";
	String A1="available";String A2="available";String A3="available";
	String B1="available";String B2="available";String B3="available";
	String C1="available";String C2="available";String C3="available";
	String D1="available";String D2="available";String D3="available";
	String E1="available";String E2="available";String E3="available";
	String F1="available";String F2="available";String F3="available";
	Frame f = new Frame("Bus Seat");
	String query,query2,query3;
	Button a1 = new Button ("A1");
	Button a2 = new Button ("A2");
	Button a3 = new Button ("A3");
	Button b1 = new Button ("B1");
	Button b2 = new Button ("B2");
	Button b3 = new Button ("B3");
	Button c1 = new Button ("C1");
	Button c2 = new Button ("C2");
	Button c3 = new Button ("C3");
	Button d1 = new Button ("D1");
	Button d2 = new Button ("D2");
	Button d3 = new Button ("D3");
	Button e1 = new Button ("E1");
	Button e2 = new Button ("E2");
	Button e3 = new Button ("E3");
	Button f1 = new Button ("F1");
	Button f2 = new Button ("F2");
	Button f3 = new Button ("F3");
	Button back = new Button("Back");
	Button go = new Button ("Go");
	public BusSeat()
	{
		//empty;
	}
	public BusSeat(String busid,String price)
	{
		back.setBounds(90,650,50,30);
		back.addActionListener(this);
		go.setBounds(150,650,50,30);
		go.addActionListener(this);
		this.busid=busid;
		this.price=price;
		a1.setBounds(50,100,40,30);
		a1.setBackground(Color.green);
		 query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'a1'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			a1.setBackground(Color.red);
			A1="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
		String query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'a1'; ";
	/*try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			a1.setBackground(Color.red);
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}	*/	
		a2.setBounds(130,100,40,30);
        a2.setBackground(Color.green);
        query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'a2'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			a2.setBackground(Color.red);
			A2="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
        a3.setBounds(170,100,40,30);
		a3.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'a3'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			a3.setBackground(Color.red);
			A3="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
		b1.setBounds(50,200,40,30);
		b1.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'b1'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			b1.setBackground(Color.red);
			B1="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			b2.setBounds(130,200,40,30);
		b2.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'b2'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			b2.setBackground(Color.red);
			B2="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			b3.setBounds(170,200,40,30);
		b3.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'b3'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			b3.setBackground(Color.red);
			B3="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			c1.setBounds(50,300,40,30);
		c1.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'c1'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			c1.setBackground(Color.red);
			C1="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
		c2.setBounds(130,300,40,30);
		c2.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'c2'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			c2.setBackground(Color.red);
			C2="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			c3.setBounds(170,300,40,30);
		c3.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'c3'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			c3.setBackground(Color.red);
			C3="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			d1.setBounds(50,400,40,30);
		d1.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'd1'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			d1.setBackground(Color.red);
			D1="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			d2.setBounds(130,400,40,30);
		d2.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'd2'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			d2.setBackground(Color.red);
			D2="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			d3.setBounds(170,400,40,30);
		d3.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'd3'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			d3.setBackground(Color.red);
			D3="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
		e1.setBounds(50,500,40,30);
		e1.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'e1'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			e1.setBackground(Color.red);
			E1="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			e2.setBounds(130,500,40,30);
		e2.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'e2'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			e2.setBackground(Color.red);
			E2="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			e3.setBounds(170,500,40,30);
		e3.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'e3'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			e3.setBackground(Color.red);
			E3="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			f1.setBounds(50,600,40,30);
		f1.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'f1'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			f1.setBackground(Color.red);
			F1="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			f2.setBounds(130,600,40,30);
		f2.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'f2'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			f2.setBackground(Color.red);
			F2="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
			
			f3.setBounds(170,600,40,30);
		f3.setBackground(Color.green);

		query = "select status from BusSeat where Busid ='"+busid+"' and seat_num = 'f3'; ";
	try{
		DataBaseAccess da = new DataBaseAccess();
		da.seatQuery(query);
		if(da.S_status.equals("booked"))
		{
			f3.setBackground(Color.red);
			F3="booked";
		}
	  }
	catch(Exception et){
				//JOptionPane.showMessageDialog(null,"Wrong Password!!");
				System.out.println(et.getMessage());
			}
			
		f.add(a1); 
        f.add(a2);	
        f.add(a3);
        f.add(b1);f.add(b2);f.add(b3);f.add(c1);f.add(c2);f.add(c3);f.add(d1);f.add(d2);f.add(d3);f.add(e1);f.add(e2);f.add(e3);f.add(f1);f.add(f2);f.add(f3);f.add(back);f.add(go);	
        a1.addActionListener(this);
		a2.addActionListener(this);
		a3.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		d1.addActionListener(this);
		d2.addActionListener(this);
		d3.addActionListener(this);
		e1.addActionListener(this);
		e2.addActionListener(this);
		e3.addActionListener(this);
		f.setSize(300,1000);  
        f.setLayout(null);  
        f.setVisible(true);
        f.setLocationRelativeTo(null); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==a1)
		{
			if(A1.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				a1.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='a1'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','a1',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==a2)
		{
			if(A2.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				a2.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='a2'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','a2',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==a3)
		{
			if(A3.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				a3.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='a3'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','a3',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==b1)
		{
			if(B1.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				b1.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='b1'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','b1',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==b2)
		{
			if(B2.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				b2.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='b2'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','b2',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==b3)
		{
			if(B3.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				b3.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='b3'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','b3',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==c1)
		{
			if(C1.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				c1.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='c1'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','c1',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==c2)
		{
			if(C2.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				c2.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='c2'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','c2',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==c3)
		{
			if(C3.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				c3.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='c3'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','c3',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==d1)
		{
			if(D1.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				d1.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='d1'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','d1',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==d2)
		{
			if(D2.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				d2.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='d2'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','d2',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==d3)
		{
			if(D3.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				d3.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='d3'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','d3',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==e1)
		{
			if(E1.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				e1.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='e1'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','e1',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==e2)
		{
			if(E2.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				e2.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='e2'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','e2',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==e3)
		{
			if(E3.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				e3.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='e3'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','e3',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==f1)
		{
			if(F1.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				f1.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='f1'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','f1',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==f2)
		{
			if(F2.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				f2.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='f2'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','f2',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		if(e.getSource()==f3)
		{
			if(F3.equals("booked"))
			{
				JOptionPane.showMessageDialog(null,"Already Booked!!");
			}
			else
			{
				f3.setBackground(Color.red);
				query2="UPDATE `busseat` SET `status`='"+B+"' WHERE `seat_num`='f3'";
				query3="INSERT INTO `ticket_sold`(`fname`, `seat_num`, `busid`, `date`) VALUES ('"+Name+"','f3',"+busid+",'"+date+"')";
				try
				{
		           DataBaseAccess da = new DataBaseAccess();
				   Name=da.name;
				   da.insertQuery(query2);
				   da.insertQuery(query3);
				   tc++;
				}
				catch(Exception et)
				{
				System.out.println(et.getMessage());
				}
				
			}
		}
		{
		if(e.getSource()==back)
		{
			f.setVisible(false);
			new Customer();
		}
		if(e.getSource()==go)
		{
			f.setVisible(false);
			int Pri=Integer.parseInt(price);
			System.out.println(price);
			System.out.println(tc);
			System.out.println("cost : "+Pri);
			int cost = Pri*tc;
			new Bill(Name,cost);
		}
	}
		
		
	}
	
/*public static void main(String[] args)   
	{
		String a = "1111";
		String b = "80";
		new BusSeat(a,b);
	}*/
}  
  