package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author shine
 * 
 */
@Entity
@Table(name = "T_SOMP_RPO")
public class RPO implements Serializable {
	private static final long serialVersionUID = 2618666027994068266L;

	@Id
	@Column(name = "VIN")
	private String vin;

	@Column(name = "RemoteStartSupport",nullable=false)
	private boolean remoteStartSupport;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public boolean isRemoteStartSupport() {
		return remoteStartSupport;
	}

	public void setRemoteStartSupport(boolean remoteStartSupport) {
		this.remoteStartSupport = remoteStartSupport;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vin.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		RPO other = (RPO) obj;
		if (vin != other.vin){
			return false;
		}
		return true;
	}

}
