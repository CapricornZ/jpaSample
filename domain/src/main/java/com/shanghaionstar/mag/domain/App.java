package com.shanghaionstar.mag.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Andy
 *
 */
@Entity
@Table(name = "T_SOMP_App",uniqueConstraints=@UniqueConstraint(columnNames={"AppVersion","OSType","OSVersion"}))
public class App implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6063260735710219378L;

	@Id
	@GeneratedValue
	@Column(name = "AppID")
	private long appID;

	@Column(name = "FileID", nullable = false, unique=true)
	private String fileID;

	@Column(name = "FileName", nullable = false)
	private String fileName;

	@Column(name = "AppVersion", length = 32, nullable = false)
	private String appVersion;

	@Column(name = "OSType", nullable = false)
	@Enumerated(EnumType.STRING)
	private SmartphoneOSType smartphoneOS;

	@Column(name = "OSVersion")
	private String smartphoneOSVersion;

	@Column(name = "Code", length = 64, nullable = false, unique=true)
	private int Code;

	@Column(name = "URLLocation", length = 255, nullable = false)
	private String URLLocation;

	@Column(name = "FileSize", nullable = false)
	private int size;

	@Column(name = "DownloadCount", nullable = false)
	private int downloadCount = 0;

	@OneToOne
	@JoinColumn(name = "CompatibleAppID" ,unique=true)
	private App compatibleApp;

	public App getCompatibleApp() {
		return compatibleApp;
	}

	public void setCompatibleApp(App compatibleApp) {
		this.compatibleApp = compatibleApp;
	}

	public long getAppID() {
		return appID;
	}

	public void setAppID(long appID) {
		this.appID = appID;
	}

	public String getFileID() {
		return fileID;
	}

	public void setFileID(String fileID) {
		this.fileID = fileID;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getURLLocation() {
		return URLLocation;
	}

	public void setURLLocation(String uRLLocation) {
		URLLocation = uRLLocation;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDownloadCount() {
		return downloadCount;
	}

	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (appID ^ (appID >>> 32));
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
		App other = (App) obj;
		if (appID != other.appID)
			return false;
		return true;
	}

}
