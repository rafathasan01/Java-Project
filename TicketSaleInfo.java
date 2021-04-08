class TicketSaleInfo
{
	String fname, seat_num, busid, date;
	
	public TicketSaleInfo(String fname, String seat_num, String busid, String date)
	{
		this.fname=fname;
		this.seat_num=seat_num;
		this.busid=busid;
		this.date=date;
	}
	public String getfname()
	{return fname;}
	public String getseat_num()
	{return seat_num;}
	public String getbusid()
	{return busid;}
	public String getdate()
	{return date;}
}