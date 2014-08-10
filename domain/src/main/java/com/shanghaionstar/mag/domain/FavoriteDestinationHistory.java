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
@Table(name="T_SOMP_Favorite_Dest_Hst")
public class FavoriteDestinationHistory  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	
	@Column(name = "POILongitude", precision = 10, scale = 6)
	private BigDecimal POILongitude;
	
	@Column(name = "POILatitude", precision = 10, scale = 6)
	private BigDecimal POILatitude;
	
	@Column(name = "Timestamp", nullable = false)
	private Date timestamp;//create time
	
	@Column(name="PoiAlias")
	private String poiAlias;
	
	@Column(name = "GovernmentID")
    private String governmentID;
	
	@Column(name = "Idpid")
    private String idpid;
	
	public String getIdpid() {
		return idpid;
	}

	public void setIdpid(String idpid) {
		this.idpid = idpid;
	}

	@Column(name = "MobileLongitude", precision = 10, scale = 6)
	private BigDecimal mobileLongitude;
	
	@Column(name = "MobileLatitude", precision = 10, scale = 6)
	private BigDecimal mobileLatitude;
	
	@Column(name="MobileCity")
	private String mobileCity;//Current location city of mobile
	
	@Column(name="Province")
	private String province;//Current location province
	
	@Column(name = "Language")
    @Enumerated(EnumType.STRING)
	private LangCodeType language;//Mobile phone language code
	
	@Column(name="DeviceID")
	private String deviceID;
	
	@Column(name = "LastUpdate")
	private Date lastUpdate;
	
	@Column(name = "LastUpdateBy")
	private String lastUpdateBy;
	
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

	public void setPOIPhoneNumber(String pOIPhoneNumber) {
		POIPhoneNumber = pOIPhoneNumber;
	}

	public String getPOICategory() {
		return POICategory;
	}

	public void setPOICategory(String pOICategory) {
		POICategory = pOICategory;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getPoiAlias() {
		return poiAlias;
	}

	public void setPoiAlias(String poiAlias) {
		this.poiAlias = poiAlias;
	}

	public String getGovernmentID() {
		return governmentID;
	}

	public void setGovernmentID(String governmentID) {
		this.governmentID = governmentID;
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

	public String getPOICity() {
		return POICity;
	}

	public void setPOICity(String pOICity) {
		POICity = pOICity;
	}

	public String getMobileCity() {
		return mobileCity;
	}

	public void setMobileCity(String mobileCity) {
		this.mobileCity = mobileCity;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public LangCodeType getLanguage() {
		return language;
	}

	public void setLanguage(LangCodeType language) {
		this.language = language;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	
}
