package dao;

public class BoardObj {
	//btitle, bdescription, bfname
	String bid;
	String btitle;
	String bdescription;
	String bfname;
	String bdate;
	
	public BoardObj(String bid, String btitle, String bdescription, String bfname, String bdate) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bdescription = bdescription;
		this.bfname = bfname;
		this.bdate = bdate;
	}

	public BoardObj(String btitle, String bdescription, String bfname) {
		super();
		this.btitle = btitle;
		this.bdescription = bdescription;
		this.bfname = bfname;
	}
	
	public String getBtitle() {
		return btitle;
	}
	public String getBdescription() {
		return bdescription;
	}
	public String getBid() {
		return bid;
	}

	public String getBfname() {
		return bfname;
	}
	
	public String getBdate() {
		return bdate;
	}
}
