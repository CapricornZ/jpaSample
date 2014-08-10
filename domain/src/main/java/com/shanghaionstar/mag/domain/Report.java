package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_SOMP_REPORT")
public class Report implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "T_SOMP_REPORT_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @Column(name = "ID")
    private long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "FunctionID")
    private Function function;

    @Column(name = "Timestamp", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date timestamp;

    @Column(name = "DeviceID", length = 128)
    private String deviceID;

    @Column(name = "Vin", length = 128)
    private String vin;

    @Column(name = "AccountID", length = 128)
    private String accountID;

    @Column(name = "AppVersion", length = 32)
    private String appVersion;

    @Column(name = "OSType", length = 255)
    private String osType;

    @Column(name = "DeviceType", length = 255)
    private String deviceType;
    
    @Column(name = "UserID", length = 255)
    private String userID;
    
    @Column(name = "Operation", length = 32)
    private String operation;
    
    @Column(name = "Language")
    @Enumerated(EnumType.STRING)
    private LangCodeType language;
    
    @Column(name = "Starttime")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date starttime;

    @Column(name = "Endtime")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endtime;

    @Column(name = "Content", length = 1024)
    private String content;
    
    @Column(name = "Status", length = 255)
    private String status;
    
    @Column(name = "LastupdateBy", length = 255)
    private String lastupdateBy;

    @Column(name = "Lastupdate")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date lastupdate;

    @Column(name = "Role")
    private String role;

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

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public LangCodeType getLanguage() {
        return language;
    }

    public void setLanguage(LangCodeType language) {
        this.language = language;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastupdateBy() {
        return lastupdateBy;
    }

    public void setLastupdateBy(String lastupdateBy) {
        this.lastupdateBy = lastupdateBy;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Report other = (Report) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
