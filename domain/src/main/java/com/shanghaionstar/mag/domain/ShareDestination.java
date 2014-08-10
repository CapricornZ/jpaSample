package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity
@Table(name = "T_SOMP_SHARE_DESTINATION")
public class ShareDestination implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Column(name = "POIName", length = 255, nullable = false)
	private String POIName;

	@Column(name = "POILongitude", precision = 10, scale = 6, nullable = false)
	private BigDecimal POILongitude;

	@Column(name = "POILatitude", precision = 10, scale = 6, nullable = false)
	private BigDecimal POILatitude;

	@Column(name = "POIDescription", length = 255)
	private String POIDescription;

	@Column(name = "POIAddress", length = 255)
	private String POIAddress;

	@Column(name = "POICategory", length = 64)
	private String POICategory;

	@Column(name = "Province", length = 20)
	private String province;

	@Column(name = "POICity", length = 18)
	private String POICity;

    @Column(name = "POIPhoneNumber", length = 128)
    private String POIPhoneNumber;

	@Column(name = "DeviceID", length = 128)
	private String deviceID;

	@Column(name = "userID", length = 255)
	private String userID;
	
	@Column(name = "PhoneNumber", length = 128)
	private String phoneNumber;

	@Column(name = "publishtime", nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date publishtime;

	@Column(name = "expiretime", nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date expiretime;

	@Column(name = "Status", length = 32, nullable = false)
	@Enumerated(EnumType.STRING)
	private ShareDestinationStatus status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPOIName() {
		return POIName;
	}

	public void setPOIName(String pOIName) {
		POIName = pOIName;
	}

	public BigDecimal getPOILongitude() {
		return POILongitude;
	}

	public void setPOILongitude(BigDecimal pOILongitude) {
		POILongitude = pOILongitude;
	}

	public BigDecimal getPOILatitude() {
		return POILatitude;
	}

	public void setPOILatitude(BigDecimal pOILatitude) {
		POILatitude = pOILatitude;
	}

	public String getPOIDescription() {
		return POIDescription;
	}

	public void setPOIDescription(String pOIDescription) {
		POIDescription = pOIDescription;
	}

	public String getPOIAddress() {
		return POIAddress;
	}

	public void setPOIAddress(String pOIAddress) {
		POIAddress = pOIAddress;
	}

	public String getPOICategory() {
		return POICategory;
	}

	public void setPOICategory(String pOICategory) {
		POICategory = pOICategory;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPOICity() {
		return POICity;
	}

	public void setPOICity(String pOICity) {
		POICity = pOICity;
	}

	public String getPOIPhoneNumber() {
		return POIPhoneNumber;
	}

	public void setPOIPhoneNumber(String pOIPhoneNumber) {
		POIPhoneNumber = pOIPhoneNumber;
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

	public Date getPublishtime() {
		return publishtime;
	}

	public void setPublishtime(Date publishtime) {
		this.publishtime = publishtime;
	}

	public Date getExpiretime() {
		return expiretime;
	}

	public void setExpiretime(Date expiretime) {
		this.expiretime = expiretime;
	}

	public ShareDestinationStatus getStatus() {
		return status;
	}

	public void setStatus(ShareDestinationStatus status) {
		this.status = status;
	}

	public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
		ShareDestination other = (ShareDestination) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
