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

@Entity
@Table(name = "T_SOMP_Subscriber_Profile")
public class SubscriberProfile implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6157004999850332303L;

    @Id
    @GeneratedValue
    @Column(name = "ProfileID", nullable = false)
    private long profileID;

    @Column(name = "AccountNum", length = 32)
    private String accountNum;

    @ManyToOne(optional = false)
    @JoinColumn(name = "IdpID")
    //@JoinColumn(name = "GovernmentID")
    private Subscriber subscriber;

    @Column(name = "OptinStatus", nullable = false)
    private boolean optinStatus;

    @Column(name = "RemoteControlOptlnStatus", nullable = false)
    private boolean remoteControlOptlnStatus;
    
    @Column(name = "FmvControlOptlnStatus", nullable = false)
    private boolean fmvControlOptlnStatus;

    @Column(name = "Timestamp")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date Timestamp;
    

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public long getProfileID() {
        return profileID;
    }

    public void setProfileID(long profileID) {
        this.profileID = profileID;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public boolean isOptinStatus() {
        return optinStatus;
    }

	public void setOptinStatus(boolean optinStatus) {
        this.optinStatus = optinStatus;
    }

    public boolean isRemoteControlOptlnStatus() {
        return remoteControlOptlnStatus;
    }

    public boolean isFmvControlOptlnStatus() {
		return fmvControlOptlnStatus;
	}

	public void setFmvControlOptlnStatus(boolean fmvControlOptlnStatus) {
		this.fmvControlOptlnStatus = fmvControlOptlnStatus;
	}

	public void setRemoteControlOptlnStatus(boolean remoteControlOptlnStatus) {
        this.remoteControlOptlnStatus = remoteControlOptlnStatus;
    }

    public Date getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Date timestamp) {
        Timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubscriberProfile)) return false;

        SubscriberProfile that = (SubscriberProfile) o;

        if (profileID != that.profileID) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (profileID ^ (profileID >>> 32));
    }
}
