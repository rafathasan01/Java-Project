class AdminInfo
{
	String fname,adminEmail,adminPhone,pass;
	
	public AdminInfo(String fname, String adminEmail, String adminPhone, String pass)
	{
		this.fname=fname;
		this.adminEmail=adminEmail;
		this.adminPhone=adminPhone;
		this.pass=pass;
	}
	public String getadminName()
	{return fname;}
	public String getadminEmail()
	{return adminEmail;}
	public String getadminPhone()
	{return adminPhone;}
	public String getpass()
	{return pass;}
}