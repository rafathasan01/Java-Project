import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class DataBaseAccess
{
		Connection con;
		String query,pswd, pswd1, pswd2,name,S_status,price,busId;
		Statement stmt;
		PreparedStatement prsmt;
		ResultSet rs;
		final String driver = "com.mysql.jdbc.Driver";
		//String url = "jdbc:mysql://localhost:3306/";   //Before database creation
		final String url = "jdbc:mysql://localhost:3306/Bus_ticket_management"; //After database creation
		//final String url = "jdbc:http://localhost/phpmyadmin/db_structure.php?server=1&db=bus_ticket_management"; 
		final String user = "root";
		final String pass = "";
		
		public DataBaseAccess() throws SQLException,ClassNotFoundException{
			try{
				Class.forName(driver).newInstance();
				con = DriverManager.getConnection(url,user,pass);
				query = null;
				stmt = null;
				rs = null;
			}catch(SQLException e){
				System.out.println(e.getMessage());
			}
			catch(ClassNotFoundException e){
				System.out.println(e.getMessage());
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
		}
		
		public void insertQuery(String query) throws SQLException{
			try{
				stmt = con.createStatement();
				int result = stmt.executeUpdate(query);
				System.out.println(result + " row inserted");
			}
			catch(SQLException e){
				System.out.println(e.getMessage());
			}
		}
		public void selectQuery(String query) throws SQLException{
			try{
				stmt = con.createStatement();
				rs=stmt.executeQuery(query);
				while(rs.next())
				{
					//String name=rs.getString("fname");
					name=rs.getString("fname");
				    pswd=rs.getString("pass");
					pswd1=rs.getString("pass");
					pswd2=rs.getString("pass");
					//System.out.println("Name :"+name);
					System.out.println("Name :"+name);
					System.out.println("Password : "+pswd);
					System.out.println("Password : "+pswd1);
					System.out.println("Password : "+pswd2);
				}
				//int result = stmt.executeUpdate(query);
				//System.out.println(result + " row inserted");
			}
			catch(SQLException e){
				System.out.println(e.getMessage());
			}
		}
		
		public void getInfoData(String query,ArrayList<CusInfo> ins) throws SQLException
		{
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String email = rs.getString("email");
				String pass = rs.getString("pass");
				System.out.println(fname);
				System.out.println(lname);
				System.out.println(email);
				System.out.println(pass);
				CusInfo in = new CusInfo(fname,lname,email,pass);
				ins.add(in);
			}
		}
		public void getBusInfoData(String query,ArrayList<BusInfo> bsin) throws SQLException
		{
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				String busid = rs.getString("busid");
				String busName = rs.getString("busName");
				String fromWhere = rs.getString("fromWhere");
				String toWhere = rs.getString("toWhere");
				String deptTime = rs.getString("deptTime");
				String arrTime = rs.getString("arrTime");
				String totalSeat = rs.getString("totalSeat");
				String fare = rs.getString("fare");
				System.out.println(busid);
				System.out.println(busName);
				System.out.println(fromWhere);
				System.out.println(toWhere);
				System.out.println(deptTime);
				System.out.println(arrTime);
				System.out.println(totalSeat);
				System.out.println(fare);
				BusInfo bsn = new BusInfo(busid, busName, fromWhere, toWhere, deptTime, arrTime, totalSeat, fare);
				bsin.add(bsn);
			}
		}
		public void getEmpInfoData(String query,ArrayList<EmpInfo> empin) throws SQLException
		{
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				String ename = rs.getString("ename");
				String empJob = rs.getString("empJob");
				String empPhone = rs.getString("empPhone");
				String empEmail = rs.getString("empEmail");
				String empSal = rs.getString("empSal");
				String empPass = rs.getString("pass");
				System.out.println(ename);
				System.out.println(empJob);
				System.out.println(empPhone);
				System.out.println(empEmail);
				System.out.println(empSal);
				System.out.println(pass);
				EmpInfo emin = new EmpInfo(ename,empJob,empPhone,empEmail,empSal,pass);
				empin.add(emin);
			}
		}
		public void getAdminInfoData(String query,ArrayList<AdminInfo> admin) throws SQLException
		{
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				String adminName = rs.getString("adminName");
				String adminEmail = rs.getString("adminEmail");
				String adminPhone = rs.getString("adminPhone");
				String pass = rs.getString("pass");
				System.out.println(adminName);
				System.out.println(adminEmail);
				System.out.println(adminPhone);
				System.out.println(adminEmail);
				System.out.println(pass);
				AdminInfo adin = new AdminInfo(adminName,adminEmail,adminPhone,pass);
				admin.add(adin);
			}
		}
		public void seatQuery(String query) throws SQLException{
			try{
				stmt = con.createStatement();
				rs=stmt.executeQuery(query);
				while(rs.next())
				{
					//String name=rs.getString("fname");
				    S_status=rs.getString("status");
					//System.out.println("Name :"+name);
					System.out.println("seat status : "+S_status);
				}
				//int result = stmt.executeUpdate(query);
				//System.out.println(result + " row inserted");
			}
			catch(SQLException e){
				System.out.println(e.getMessage());
			}
		}
		public void busQuery(String query) throws SQLException{
			try{
				stmt = con.createStatement();
				rs=stmt.executeQuery(query);
				while(rs.next())
				{
					//String name=rs.getString("fname");
				    busId=rs.getString("busid");
					System.out.println("Bus id : "+busId);
					price=rs.getString("fare");
				}
				//int result = stmt.executeUpdate(query);
				//System.out.println(result + " row inserted");
			}
			catch(SQLException e){
				System.out.println(e.getMessage());
			}
		}
		
	public void getTicketSaleInfoData(String query,ArrayList<TicketSaleInfo> tin) throws SQLException
		{
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				String fname = rs.getString("fname");
				String seat_num = rs.getString("seat_num");
				String busid = rs.getString("busid");
				String date = rs.getString("date");
				System.out.println(fname);
				System.out.println(seat_num);
				System.out.println(busid);
				System.out.println(date);
				TicketSaleInfo tsin = new TicketSaleInfo(fname,seat_num,busid,date);
				tin.add(tsin);
			}
		}

		
}	