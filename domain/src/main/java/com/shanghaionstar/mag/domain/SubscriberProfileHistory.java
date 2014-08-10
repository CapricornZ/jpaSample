package com.shanghaionstar.mag.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Andy
 *
 */
@Entity
@Table(name = "T_SOMP_Subscriber_Profile_Hst")
public class SubscriberProfileHistory implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 5086102281276818138L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Column(name = "AccountNum",length=32)
	private String accountNum;

	@Column(name = "Email",length=255)
	private String email;

	@Column(name = "PhoneNumber")
	private String phoneNumber;

	@Column(name = "OptinStatus",nullable=false)
	private boolean optinStatus;

	@Column(name = "RemoteControlOptlnStatus",nullable=false)
	private boolean remoteControlOptlnStatus;
	
	@Column(name = "FmvControlOptlnStatus",nullable=false)
	private boolean fmvControlOptlnStatus;

	@Column(name="Timestamp",nullable=false)
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date timestamp;
	
	@Column(name = "Operator")
	private String operator;
	
	@Column(name = "OperatorType")
	private String operatorType;
	
	@Column(name = "ProfileType")
	private String profileType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public boolean isOptinStatus() {
		return optinStatus;
	}

	public void setOptinStatus(boolean optinStatus) {
		this.optinStatus = optinStatus;
	}

	public boolean isRemoteControlOptlnStatus() {
		return remoteControlOptlnStatus;
	}
	
	public boolean isFmvControlOptlnStatus() {
		return fmvControlOptlnStatus;
	}

	public void setFmvControlOptlnStatus(boolean fmvControlOptlnStatus) {
		this.fmvControlOptlnStatus = fmvControlOptlnStatus;
	}

	public void setRemoteControlOptlnStatus(boolean remoteControlOptlnStatus) {
		this.remoteControlOptlnStatus = remoteControlOptlnStatus;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorType() {
		return operatorType;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getProfileType() {
		return profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}
	
	

}
