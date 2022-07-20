package scopedata;

import java.io.Serializable;

public class Company implements Serializable {
	public int id;
	public String company;
	public int tikuid;
	public String addr;
	public String tel;
	public String url;
	public int capital;
	public String business;
	public int industryid;
	public int welfarid;
	public String salary;
	public int numpeoid;
	public int selmetid;

	public Company( int _id, String _company, int _tikuid,
			String _addr, String _tel, String _url, int _capital,
			String _business, int _industryid, int _welfarid,
			String _salary, int _numpeoid, int _selmetid ) {
		id = _id; company = _company; tikuid = _tikuid; addr = _addr; tel = _tel; url = _url;
		capital = _capital; business = _business; industryid = _industryid; welfarid = _welfarid;
		salary = _salary; numpeoid = _numpeoid; selmetid = _selmetid;
	}
		public void  setId( int  _id ) {
	    	id = _id;
	    }
	    public void  setCompany( String _company ) {
	    	company = _company;
	    }
	    public void setTikuid( int _tikuid ) {
	    	tikuid = _tikuid;
	    }
	    public void setAddr( String _addr ) {
	    	addr = _addr;
	    }
	    public void setTel( String _tel ) {
	    	tel = _tel;
	    }
	    public void setUrl( String _url ) {
	    	url = _url;
	    }
	    public void setCapital( int _capital ) {
	    	capital = _capital;
	    }
	    public void setBusiness( String _business ) {
	    	business = _business;
	    }
	    public void setIndustryid( int _industryid) {
	    	industryid = _industryid;
	    }
	    public void setWelfarid( int _welfarid ) {
	    	welfarid = _welfarid;
	    }
	    public void setSalary( String _salary ) {
	    	salary = _salary;
	    }
	    public void setNumpeoid( int _numpeoid ) {
	    	numpeoid = _numpeoid;
	    }
	    public void setSelmetid( int _selmetid ) {
	    	selmetid = _selmetid;
	    }
		public int getId() { return id; }
		public String getCompany() { return company; }
		public int getTikuid() { return tikuid; }
		public String getAddr() { return addr; }
		public String getTel() { return tel; }
		public String getUrl() { return url; }
		public int getCapital() { return capital; }
		public String getBusiness() { return business; }
		public int getIndustryid() { return industryid; }
		public int getWelfarid() { return welfarid; }
		public String getSalary() { return salary; }
		public int getNumpeoid() { return numpeoid; }
		public int getSelmetid() { return selmetid; }
	}

