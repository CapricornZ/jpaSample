package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Andy
 *
 */
@Entity
@Table(name = "T_SOMP_Smartphone_Registration")
public class SmartphoneReg implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -8808988540674571616L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "SmartphoneID")
	private Smartphone smartphone;

	@Column(name = "IMSI",length=32)
	private String IMSI;

	@Column(name = "RegCode", length = 255, nullable = false)
	private String regCode;

	@Column(name = "Timestamp", nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date timestamp;

	@Column(name = "RegistrationStatus", nullable = false)
	private boolean registrationStatus;
	
	@Column(name = "TriedCount", nullable = false)
	private int triedCount = 0;

	public Smartphone getSmartphone() {
		return smartphone;
	}

	public void setSmartphone(Smartphone smartphone) {
		this.smartphone = smartphone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getIMSI() {
		return IMSI;
	}

	public void setIMSI(String iMSI) {
		IMSI = iMSI;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public boolean isRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(boolean registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public int getTriedCount() {
		return triedCount;
	}

	public void setTriedCount(int triedCount) {
		this.triedCount = triedCount;
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
		SmartphoneReg other = (SmartphoneReg) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
