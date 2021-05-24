package ex07_jdbc.member;

import java.util.Date;

public class MemberDTO {

	private String userid;
	private String passwd;
	private int birthyear;
	private Date regedate;
	
	public MemberDTO  () {
		super();
	}
	
	public MemberDTO(String userid, String passwd, int birtyear, Date regedate) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.birthyear = birtyear;
		this.regedate = regedate;
	}

	public MemberDTO(String userid, String passwd, int birtyear) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.birthyear = birtyear;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getBirtyear() {
		return birthyear;
	}

	public void setBirtyear(int number) {
		this.birthyear= number;
	}

	public Date getRegedate() {
		return regedate;
	}

	public void setRegedate(Date regedate) {
		this.regedate = regedate;
	}

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + ", birthyear=" + birthyear + ", regedate=" + regedate
				+ "]";
	}
	
	
	
}
