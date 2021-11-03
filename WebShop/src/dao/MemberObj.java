package dao;

public class MemberObj {
	private String cid;
	private String cpassword;
	private String cname;
	private String cgender;
	private String pbirth;
	private String cemail;
	private String cphone;
	private String caddress;
	private String cregiday;
	
	public MemberObj(String cid, String cpassword, String cname, String cgender, String pbirth, String cemail,
			String cphone, String caddress, String cregiday) {
		super();
		this.cid = cid;
		this.cpassword = cpassword;
		this.cname = cname;
		this.cgender = cgender;
		this.pbirth = pbirth;
		this.cemail = cemail;
		this.cphone = cphone;
		this.caddress = caddress;
		this.cregiday = cregiday;
	}
	public String getCid() {
		return this.cid;
	}
	public String getCpassword() {
		return this.cpassword;
	}
	public String getCname() {
		return this.cname;
	}
	public String getCgender() {
		return this.cgender;
	}
	public String getPbirth() {
		return this.pbirth;
	}
	public String getCemail() {
		return this.cemail;
	}
	public String getCphone() {
		return this.cphone;
	}
	public String getCaddress() {
		return this.caddress;
	}
	public String getCregiday() {
		return this.cregiday;
	}
	
	
	
}
