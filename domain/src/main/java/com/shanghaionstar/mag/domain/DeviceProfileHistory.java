package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Andy
 *
 */
@Entity
@Table(name = "T_SOMP_Device_Profile_History")
public class DeviceProfileHistory implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6767990661483521734L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Column(name = "DeviceID",length=128,nullable=false)
	private String  deviceID;

	@Column(name = "IMSI",length=32)
	private String IMSI;

	@Column(name = "OSType", nullable=false)
	@Enumerated(EnumType.STRING)
	private SmartphoneOSType smartphoneOS;


	@Column(name = "OSVersion")
	private String smartphoneOSVersion;

	@Column(name = "Nickname",length=32)
	private String nickname;

	@Column(name = "GovernmentID")
	private String governmentID;

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

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getIMSI() {
		return IMSI;
	}

	public void setIMSI(String iMSI) {
		IMSI = iMSI;
	}

	public SmartphoneOSType getSmartphoneOS() {
		return smartphoneOS;
	}

	public void setSmartphoneOS(SmartphoneOSType smartphoneOS) {
		this.smartphoneOS = smartphoneOS;
	}

	public String getSmartphoneOSVersion() {
		return smartphoneOSVersion;
	}

	public void setSmartphoneOSVersion(String smartphoneOSVersion) {
		this.smartphoneOSVersion = smartphoneOSVersion;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGovernmentID() {
		return governmentID;
	}

	public void setGovernmentID(String governmentID) {
		this.governmentID = governmentID;
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
