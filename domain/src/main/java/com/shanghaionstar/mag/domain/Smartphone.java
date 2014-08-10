package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "T_SOMP_Smartphone")
public class Smartphone implements Serializable {

   

    /**
	 * 
	 */
	private static final long serialVersionUID = 1969377147862739183L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;

    @Column(name = "DeviceID", nullable = false)
    private String deviceID;

    @Column(name = "OSType", nullable = false)
    @Enumerated(EnumType.STRING)
    private SmartphoneOSType smartphoneOS;


    @Column(name = "OSVersion", nullable = false)
    private String smartphoneOSVersion;


    @Column(name = "IMSI", length = 32, nullable = true)
    private String IMSI;

    @Column(name = "Nickname", length = 32)
    private String nickname;

    @Column(name = "IsEnabled")
    private boolean isEnabled = false;

    @ManyToOne
    @JoinColumn(name = "GovernmentID")
    private Subscriber subscriber;


    @OneToMany(mappedBy = "smartphone", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SmartphoneReg> smartphoneRegistration;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "T_SOMP_Smartphone_App", joinColumns = @JoinColumn(name = "SmartphoneID"), inverseJoinColumns = @JoinColumn(name = "AppID"))
    private Set<App> apps;

    public Smartphone() {
        smartphoneRegistration = new ArrayList<SmartphoneReg>();
        apps = new HashSet<App>();
    }

    public Set<App> getApps() {
        return apps;
    }

    public void setApps(Set<App> apps) {
        this.apps = apps;
    }

    public List<SmartphoneReg> getSmartphoneRegistration() {
        return smartphoneRegistration;
    }

    public void setSmartphoneRegistration(
            List<SmartphoneReg> smartphoneRegistration) {
        this.smartphoneRegistration = smartphoneRegistration;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }


    public long getID() {
        return ID;
    }

    public void setID(long iD) {
        ID = iD;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public SmartphoneOSType getSmartphoneOS() {
        return smartphoneOS;
    }

    public void setSmartphoneOS(SmartphoneOSType smartphoneOS) {
        this.smartphoneOS = smartphoneOS;
    }

    public String getSmartphoneOSVersion() {
        return smartphoneOSVersion;
    }

    public void setSmartphoneOSVersion(String smartphoneOSVersion) {
        this.smartphoneOSVersion = smartphoneOSVersion;
    }


    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getIMSI() {
        return IMSI;
    }

    public void setIMSI(String iMSI) {
        IMSI = iMSI;
    }

    public String getNickname() {

        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) return false;

        Smartphone that = (Smartphone) o;

        if (deviceID != that.deviceID) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (ID ^ (ID >>> 32));
    }


}
