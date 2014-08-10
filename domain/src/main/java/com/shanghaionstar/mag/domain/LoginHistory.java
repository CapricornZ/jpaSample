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
@Table(name = "T_SOMP_Login_History")
public class LoginHistory implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 7766798098543349886L;
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Column(name = "GovernmentID")
	private String governmentID;
	
    @Column(name = "IdpID")
    private String idpID;

	@Column(name = "Email",length=255)
	private String email;

	@Column(name = "PhoneNumber")
	private String phoneNumber;

	@Column(name = "DeviceID")
	private String  deviceID;

	@Column(name = "OSType")
	@Enumerated(EnumType.STRING)
	private SmartphoneOSType smartphoneOS;

	@Column(name = "IMSI")
	private String IMSI;

	@Column(name="StartTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;

	@Column(name="CompleteTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date completeTime;

	@Column(name = "Role")
	private String  role;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

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


	public String getGovernmentID() {
		return governmentID;
	}

	public void setGovernmentID(String governmentID) {
		this.governmentID = governmentID;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public SmartphoneOSType getSmartphoneOS() {
		return smartphoneOS;
	}

	public void setSmartphoneOS(SmartphoneOSType smartphoneOS) {
		this.smartphoneOS = smartphoneOS;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIMSI() {
		return IMSI;
	}

	public void setIMSI(String iMSI) {
		IMSI = iMSI;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

    public String getIdpID() {
        return idpID;
    }

    public void setIdpID(String idpID) {
        this.idpID = idpID;
    }
}
