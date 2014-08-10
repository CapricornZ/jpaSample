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

@Entity
@Table(name="T_SOMP_SendToVehicle_History")
public class SendToVehicleHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7964170507553401307L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	
	@Column(name = "POIName")
	private String POIName;//POI Name or Title
	
	@Column(name = "POIAddress")
	private String POIAddress;
	
	@Column(name = "POIPhoneNumber")
	private String POIPhoneNumber;
	
	@Column(name = "POICity")
	private String POICity;
	
	@Column(name = "POICategory")
	private String POICategory;//Destination category
	
	@Column(name = "POILongitude", precision = 10, scale = 6, nullable = false)
	private BigDecimal POILongitude;
	
	@Column(name = "POILatitude", precision = 10, scale = 6, nullable = false)
	private BigDecimal POILatitude;
	
	@Column(name = "Timestamp", nullable = false)
	private Date timestamp;//create time
	
	@Column(name = "GovernmentID", nullable = false)
    private String governmentID;
	
	@Column(name = "Status", nullable = false)
    @Enumerated(EnumType.STRING)
	private SendToVehicleStatusType status;
	
	@Column(name = "VIN", nullable = false)
	private String vin;//Vehicle Identity Number
	
	@Column(name = "MobileLongitude", precision = 10, scale = 6)
	private BigDecimal mobileLongitude;
	
	@Column(name = "MobileLatitude", precision = 10, scale = 6)
	private BigDecimal mobileLatitude;
	
	@Column(name = "Language", nullable = false)
    @Enumerated(EnumType.STRING)
	private LangCodeType language;//Mobile phone language code
	
	@Column(name="ServiceTransactionID", nullable = false)
	private long serviceTransactionID;
	
	@Column(name = "LastUpdate", nullable = false)
	private Date lastUpdate;
	
	@Column(name = "LastUpdateBy", nullable = false)
	private String lastUpdateBy;
	
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
	public String getPOIAddress() {
		return POIAddress;
	}
	public void setPOIAddress(String pOIAddress) {
		POIAddress = pOIAddress;
	}
	public String getPOIPhoneNumber() {
		return POIPhoneNumber;
	}
	public String getPOICategory() {
		return POICategory;
	}
	public void setPOICategory(String pOICategory) {
		POICategory = pOICategory;
	}
	public void setPOIPhoneNumber(String pOIPhoneNumber) {
		POIPhoneNumber = pOIPhoneNumber;
	}
	public BigDecimal getPOILongitude() {
		return POILongitude;
	}
	public void setPOILongitude(BigDecimal pOILongitude) {
		POILongitude = pOILongitude;
	}
	public SendToVehicleStatusType getStatus() {
		return status;
	}
	public void setStatus(SendToVehicleStatusType status) {
		this.status = status;
	}
	public BigDecimal getPOILatitude() {
		return POILatitude;
	}
	public void setPOILatitude(BigDecimal pOILatitude) {
		POILatitude = pOILatitude;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getPOICity() {
		return POICity;
	}
	public void setPOICity(String pOICity) {
		POICity = pOICity;
	}
	public String getGovernmentID() {
		return governmentID;
	}
	public void setGovernmentID(String governmentID) {
		this.governmentID = governmentID;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public BigDecimal getMobileLongitude() {
		return mobileLongitude;
	}
	public void setMobileLongitude(BigDecimal mobileLongitude) {
		this.mobileLongitude = mobileLongitude;
	}
	public BigDecimal getMobileLatitude() {
		return mobileLatitude;
	}
	public void setMobileLatitude(BigDecimal mobileLatitude) {
		this.mobileLatitude = mobileLatitude;
	}
	public LangCodeType getLanguage() {
		return language;
	}
	public void setLanguage(LangCodeType language) {
		this.language = language;
	}
	public long getServiceTransactionID() {
		return serviceTransactionID;
	}
	public void setServiceTransactionID(long serviceTransactionID) {
		this.serviceTransactionID = serviceTransactionID;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	
}
