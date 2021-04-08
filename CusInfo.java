class CusInfo
{
	String fname,lname,email,pass;
	
	public CusInfo(String fname, String lname, String email, String pass)
	{
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.pass=pass;
	}
	public String getFname()
	{return fname;}
	public String getLname()
	{return lname;}
	public String getEmail()
	{return email;}
	public String getPass()
	{return pass;}
}