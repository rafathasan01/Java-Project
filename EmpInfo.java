class EmpInfo
{
String ename, empJob, empPhone, empEmail, empSal, pass;

public EmpInfo (String ename, String empJob, String empPhone, String empEmail, String empSal, String pass)
{
	this.ename=ename;
	this.empJob=empJob;
	this.empPhone=empPhone;
	this.empEmail=empEmail;
	this.empSal=empSal;
	this.pass=pass;
}

public String getename()
{return ename;}
public String getempJob()
{return empJob;}
public String getempPhone()
{return empPhone;}
public String getempEmail()
{return empEmail;}
public String getempSal()
{return empSal;}
public String getpass()
{return pass;}

}