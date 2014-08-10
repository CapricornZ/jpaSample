package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "T_SOMP_Smartphone_Reg_Hst")
public class SmartphoneRegHistory implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -7457727277678037954L;

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private long id;

	@Column(name = "IMSI",length=32)
	private String IMSI;

	@Column(name = "Timestamp", nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date timestamp;

	@Column(name = "DeviceID",length=128,nullable=false)
	private String  deviceID;

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

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

}
