class BusInfo
{
	String busid, busName, fromWhere, toWhere, deptTime, arrTime, totalSeat, fare;
	
	public BusInfo(String busid, String busName, String fromWhere, String toWhere, String deptTime, String arrTime, String totalSeat, String fare)
	{
		this.busid=busid;
		this.busName=busName;
		this.fromWhere=fromWhere;
		this.toWhere=toWhere;
		this.deptTime=deptTime;
		this.arrTime=arrTime;
		this.totalSeat=totalSeat;
		this.fare=fare;
	}
	public String getbusid()
	{return busid;}
	public String getbusName()
	{return busName;}
	public String getfromWhere()
	{return fromWhere;}
	public String gettoWhere()
	{return toWhere;}
	public String getdeptTime()
	{return deptTime;}
	public String getarrTime()
	{return arrTime;}
	public String gettotalSeat()
	{return totalSeat;}
	public String getfare()
	{return fare;}
}