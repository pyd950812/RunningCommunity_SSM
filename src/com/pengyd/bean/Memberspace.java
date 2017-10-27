package com.pengyd.bean;
//用户所对应的个人空间
public class Memberspace implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	//当前这个个人空间对应的用户
	private Memberinfo memberinfo;
	//个人对跑步的看法
	private String opinion;
	//跑步时间
	private String runtime;
	//跑步地点
	private String runplace;
	//喜欢的跑步明星
	private String runstar;
	//跑步的习惯
	private String runhabit;
	//正在使用的手机类型/号码
	private String cellphone;
	//个人空间中的头像路径
	private String icon;
	//用户的id
	private long memberid;

	// Constructors

	/** default constructor */
	public Memberspace() {
		
	}



	public long getMemberid() {
		return memberid;
	}



	public void setMemberid(long memberid) {
		this.memberid = memberid;
	}



	public Memberspace(Long id, String opinion, String runtime,
			String runplace, String runstar, String runhabit, String cellphone,
			String icon, long memberid) {
		super();
		this.id = id;
		this.opinion = opinion;
		this.runtime = runtime;
		this.runplace = runplace;
		this.runstar = runstar;
		this.runhabit = runhabit;
		this.cellphone = cellphone;
		this.icon = icon;
		this.memberid = memberid;
	}



	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Memberinfo getMemberinfo() {
		return this.memberinfo;
	}

	public void setMemberinfo(Memberinfo memberinfo) {
		this.memberinfo = memberinfo;
	}

	public String getOpinion() {
		return this.opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getRuntime() {
		return this.runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getRunplace() {
		return this.runplace;
	}

	public void setRunplace(String runplace) {
		this.runplace = runplace;
	}

	public String getRunstar() {
		return this.runstar;
	}

	public void setRunstar(String runstar) {
		this.runstar = runstar;
	}

	public String getRunhabit() {
		return this.runhabit;
	}

	public void setRunhabit(String runhabit) {
		this.runhabit = runhabit;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}



	@Override
	public String toString() {
		return "Memberspace [id=" + id + ", opinion=" + opinion + ", runtime="
				+ runtime + ", runplace=" + runplace + ", runstar=" + runstar
				+ ", runhabit=" + runhabit + ", cellphone=" + cellphone
				+ ", icon=" + icon + ", memberid=" + memberid + "]";
	}

}