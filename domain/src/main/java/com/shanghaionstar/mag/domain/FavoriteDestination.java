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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_SOMP_Favorite_Destination")
public class FavoriteDestination implements Serializable{

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
	
	@Column(name = "POILongitude", precision = 10, scale = 6, nullable = false)
	private BigDecimal POILongitude;
	
	@Column(name = "POILatitude", precision = 10, scale = 6, nullable = false)
	private BigDecimal POILatitude;
	
	@Column(name = "Timestamp", nullable = false)
	private Date timestamp;//create time
	
	@Column(name="PoiAlias")
	private String poiAlias;
	
	
	
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
	
	@Column(name = "LastUpdate", nullable = false)
	private Date lastUpdate;
	
	@Column(name = "LastUpdateBy", nullable = false)
	private String lastUpdateBy;

	
	//yiruiYuan 20131122
	//@ManyToOne(optional = false)
	//@JoinColumn(name = "GovernmentID")
	@ManyToOne(optional = false)
	@JoinColumn(name="IdpID")
	private Subscriber subscriber;
	
	@Column(name="GovernmentID")
	private String governmentID;
	
	@Column(name="POIID")
	private String POIID;
	
	public String getFromWhere() {
		return fromWhere;
	}
	public void setFromWhere(String fromWhere) {
		this.fromWhere = fromWhere;
	}
	public String getToWhere() {
		return toWhere;
	}
	public void setToWhere(String toWhere) {
		this.toWhere = toWhere;
	}

	@Column(name="POISource")
	private String POISource;
	
	@Column(name="AccountID")
	private String accountID;
	
	@Column(name="SubscriberID")
	private String subscriberID;
	
	@Column(name="VIN")
	private String vin;
	
	@Column(name="POIPostCode")
	private String POIPostCode;
	
	
	@Column(name="FromWhere")
	private String fromWhere;
	

	@Column(name="ToWhere")
	private String toWhere;
	
	
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

	public String getPOICity() {
		return POICity;
	}

	public void setPOICity(String pOICity) {
		POICity = pOICity;
	}

	public String getPOICategory() {
		return POICategory;
	}

	public void setPOICategory(String pOICategory) {
		POICategory = pOICategory;
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

	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public String getGovernmentID() {
		return governmentID;
	}

	public void setGovernmentID(String governmentID) {
		this.governmentID = governmentID;
	}

	public String getPOIID() {
		return POIID;
	}

	public void setPOIID(String pOIID) {
		POIID = pOIID;
	}

	public String getPOISource() {
		return POISource;
	}

	public void setPOISource(String pOISource) {
		POISource = pOISource;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getSubscriberID() {
		return subscriberID;
	}

	public void setSubscriberID(String subscriberID) {
		this.subscriberID = subscriberID;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getPOIPostCode() {
		return POIPostCode;
	}

	public void setPOIPostCode(String pOIPostCode) {
		POIPostCode = pOIPostCode;
	}

	

}
