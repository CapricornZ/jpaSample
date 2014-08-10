/**
 *
 */
package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author Andy
 */
@Entity
@Table(name = "T_SOMP_Subscriber")
public class Subscriber implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7435357374784374314L;

    //20131122 yiruiYuan  GovernmentID-->IdpID
    
	@Column(name = "GovernmentID")
    private String governmentID;
    
	@Id
    @Column(name = "IdpID")
    private String idpID;
    
	
	//20131203 yiruiYuan add new Column : SubscriberID
	@Column(name = "SubscriberID")
    private String subscriberID;
    
    public String getSubscriberID() {
		return subscriberID;
	}

	public void setSubscriberID(String subscriberID) {
		this.subscriberID = subscriberID;
	}

    @Column(name = "SavedAccountNum")
    private String savedAccountNum;

    @Column(name = "SavedModifiedTime")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date savedModifiedTime;

    @Column(name = "IsEnabled")
    private boolean isEnabled = true;
    
/*    @Column(name = "eulaFlag")
    private boolean eulaFlag = false;*/
    
    @Column(name = "Email", length = 255)
    private String email;

    @Column(name = "PhoneNumber")
    private String phoneNumber;
    
    @Column(name = "LangCode", nullable = false)
    @Enumerated(EnumType.STRING)
    private LangCodeType langCode;

    @Column(name = "SessionKey",unique=true)
    private String sessionKey;

    @Column(name = "SessionKeyTimestamp")
    private Date sessionKeyTimestamp;
    
    @Column(name = "PinTriedCount", nullable = false)
	private int pinTriedCount = 0;
    
    @Column(name = "PinTimestamp")
    private Date pinTimestamp;

    @OneToMany(mappedBy = "subscriber", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SubscriberProfile> subscriberProfiles;

    @OneToMany(mappedBy = "subscriber", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Smartphone> smartphones;

    public Subscriber() {
    	smartphones = new ArrayList<Smartphone>();
        subscriberProfiles = new ArrayList<SubscriberProfile>();
    }

    public int getPinTriedCount() {
		return pinTriedCount;
	}

	public void setPinTriedCount(int pinTriedCount) {
		this.pinTriedCount = pinTriedCount;
	}

	public Date getPinTimestamp() {
		return pinTimestamp;
	}

	public void setPinTimestamp(Date pinTimestamp) {
		this.pinTimestamp = pinTimestamp;
	}

	public List<SubscriberProfile> getSubscriberProfiles() {
        return subscriberProfiles;
    }

    public void setSubscriberProfiles(List<SubscriberProfile> subscriberProfile) {
        this.subscriberProfiles = subscriberProfile;
    }

    public List<Smartphone> getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(List<Smartphone> smartphones) {
        this.smartphones = smartphones;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public LangCodeType getLangCode() {
		return langCode;
	}

	public void setLangCode(LangCodeType langCode) {
		this.langCode = langCode;
	}
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getGovernmentID() {
        return governmentID;
    }

    public void setGovernmentID(String governmentID) {
        this.governmentID = governmentID;
    }

    public String getSavedAccountNum() {
        return savedAccountNum;
    }

    public void setSavedAccountNum(String savedAccountNum) {
        this.savedAccountNum = savedAccountNum;
    }

    public Date getSavedModifiedTime() {
        return savedModifiedTime;
    }

    public void setSavedModifiedTime(Date savedModifiedTime) {
        this.savedModifiedTime = savedModifiedTime;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public Date getSessionKeyTimestamp() {
        return sessionKeyTimestamp;
    }

    public void setSessionKeyTimestamp(Date sessionKeyTimestamp) {
        this.sessionKeyTimestamp = sessionKeyTimestamp;
    }


    public boolean isEnabled() {
        return isEnabled;
    }
    
    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
    
/*    public boolean eulaFlag() {
        return eulaFlag;
    }

    public void setEulaFlag(boolean eulaFlag) {
        this.eulaFlag = eulaFlag;
    }*/

    public String getIdpID() {
        return idpID;
    }

    public void setIdpID(String idpID) {
        this.idpID = idpID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + governmentID.hashCode();
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
        Subscriber other = (Subscriber) obj;
        if (governmentID != other.governmentID)
            return false;
        return true;
    }
}

