package com.pengyd.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//用户信息
public class Memberinfo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//用户的id
	private Long id;
	
	//用户昵称
	private String nickName;
	//密码
	private String passwd;
	//性别
	private String gender;
	//年龄
	private Long age;
	//电子邮件地址
	private String email;
	//所在省市
	private String provinceCity;
	//详细地址
	private String address;
	//电话
	private String phone;
	//找回密码的提示问题
	private String passwdQuestion;
	//找回密码的提示问题的答案
	private String passwdAnswer;
	//推荐人
	private String recommender;
	//积分(积米)
	private Long point = 0L;
	//注册时间
	@DateTimeFormat
	private Date registerdate;
	//最后一次登录时间
	@DateTimeFormat
	private Date latestdate;
	//用户账户的状态  0:正常 1:注销/冻结 
	private Long status;
	//用户是否在线 0:下线 1:在线
	private Long isonline;
	//等级id
	private Long gradeid;
	//用户的个人空间
	private Memberspace memberSpace;
	//当前用户的等级
	private Graderecord graderecord;
	
	
	
	
	public Long getGradeid() {
		return gradeid;
	}

	public void setGradeid(Long gradeid) {
		this.gradeid = gradeid;
	}

	public Memberinfo() {
	}
	
	public Memberinfo( Graderecord graderecord, String nickName,
			String passwd, String gender, Long age, String email,
			String provinceCity, String address, String phone,
			String passwdQuestion, String passwdAnswer, String recommender,
			Long point, Date registerdate, Date latestdate, Long status,
			Long isonline, Memberspace memberSpace) {
		this.graderecord = graderecord;
		this.nickName = nickName;
		this.passwd = passwd;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.provinceCity = provinceCity;
		this.address = address;
		this.phone = phone;
		this.passwdQuestion = passwdQuestion;
		this.passwdAnswer = passwdAnswer;
		this.recommender = recommender;
		this.point = point;
		this.registerdate = registerdate;
		this.latestdate = latestdate;
		this.status = status;
		this.isonline = isonline;
		this.memberSpace = memberSpace;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Graderecord getGraderecord() {
		return graderecord;
	}

	public void setGraderecord(Graderecord graderecord) {
		this.graderecord = graderecord;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProvinceCity() {
		return provinceCity;
	}

	public void setProvinceCity(String provinceCity) {
		this.provinceCity = provinceCity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPasswdQuestion() {
		return passwdQuestion;
	}

	public void setPasswdQuestion(String passwdQuestion) {
		this.passwdQuestion = passwdQuestion;
	}

	public String getPasswdAnswer() {
		return passwdAnswer;
	}

	public void setPasswdAnswer(String passwdAnswer) {
		this.passwdAnswer = passwdAnswer;
	}

	public String getRecommender() {
		return recommender;
	}

	public void setRecommender(String recommender) {
		this.recommender = recommender;
	}

	public Long getPoint() {
		return point;
	}

	public void setPoint(Long point) {
		this.point = point;
	}

	public Date getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}

	public Date getLatestdate() {
		return latestdate;
	}

	public void setLatestdate(Date latestdate) {
		this.latestdate = latestdate;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getIsonline() {
		return isonline;
	}

	public void setIsonline(Long isonline) {
		this.isonline = isonline;
	}

	public Memberspace getMemberSpace() {
		return memberSpace;
	}

	public void setMemberSpace(Memberspace memberSpace) {
		this.memberSpace = memberSpace;
	}

	@Override
	public String toString() {
		return "Memberinfo [id=" + id + ", nickName=" + nickName + ", passwd="
				+ passwd + ", gender=" + gender + ", age=" + age + ", email="
				+ email + ", provinceCity=" + provinceCity + ", address="
				+ address + ", phone=" + phone + ", passwdQuestion="
				+ passwdQuestion + ", passwdAnswer=" + passwdAnswer
				+ ", recommender=" + recommender + ", point=" + point
				+ ", registerdate=" + registerdate + ", latestdate="
				+ latestdate + ", status=" + status + ", isonline=" + isonline
				+ ", gradeid=" + gradeid + ", memberSpace=" + memberSpace
				+ ", graderecord=" + graderecord + "]";
	}
	
}