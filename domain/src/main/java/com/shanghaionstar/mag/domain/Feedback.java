package com.shanghaionstar.mag.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="T_SOMP_Feedback")
public class Feedback {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	
	@Column(name = "Appversion")
	private String appversion;
	
	@Column(name = "VIN")
	private String VIN;
	
	@Column(name = "Account")
	private String account;
	
	@Column(name = "Mobile")
	private String mobile;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "SubmitDate", nullable = false)
	private Date submitDate;
	
	
	@Column(name = "Comments")
	private String comments;

	
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAppversion() {
		return appversion;
	}


	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}


	public String getVIN() {
		return VIN;
	}


	public void setVIN(String vIN) {
		VIN = vIN;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Date getSubmitDate() {
		return submitDate;
	}


	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}
	


}
