package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Andy
 *
 */
@Entity
@Table(name = "T_SOMP_Service_Transaction")
public class ServiceTransaction implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -3943053433606046860L;

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private long id;
	
	@Column(name = "GovernmentID")
	private String governmentID;
	
	//yiruiYuan 20131125  加入新的字段IDPID
	@Column(name = "IdpID")
	private String idpID;

	public String getIdpID() {
		return idpID;
	}

	public void setIdpID(String idpID) {
		this.idpID = idpID;
	}

	@Column(name = "DeviceID")
	private String deviceID;

	@OneToMany(mappedBy = "serviceTransaction", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<PartnerServiceTransaction> partnerServiceTransaction;

	@Column(name = "StartTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;

	@Column(name = "CompleteTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date completeTime;

	@Column(name = "Duration")
	private long duration;

	@Column(name = "OSType")
	@Enumerated(EnumType.STRING)
	private SmartphoneOSType smartphoneOS;

	@Column(name = "ServiceType")
	@Enumerated(EnumType.STRING)
	private ServiceType serviceType;

	@Column(name = "Status")
	@Enumerated(EnumType.STRING)
	private TransactionStatus status;

	@Column(name = "ErrorLog")
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private String errorLog;

    public ServiceTransaction() {
        partnerServiceTransaction = new HashSet<PartnerServiceTransaction>();
    }

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public SmartphoneOSType getSmartphoneOS() {
		return smartphoneOS;
	}

	public void setSmartphoneOS(SmartphoneOSType smartphoneOS) {
		this.smartphoneOS = smartphoneOS;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	public TransactionStatus getStatus() {
		return status;
	}

	public void setStatus(TransactionStatus status) {
		this.status = status;
	}

	public String getErrorLog() {
		return errorLog;
	}

	public void setErrorLog(String errorLog) {
		this.errorLog = errorLog;
	}

	public Set<PartnerServiceTransaction> getPartnerServiceTransaction() {
		return partnerServiceTransaction;
	}

	public void setPartnerServiceTransaction(
            Set<PartnerServiceTransaction> partnerServiceTransaction) {
		this.partnerServiceTransaction = partnerServiceTransaction;
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
		ServiceTransaction other = (ServiceTransaction) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
