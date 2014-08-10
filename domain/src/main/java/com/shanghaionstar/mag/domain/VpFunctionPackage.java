package com.shanghaionstar.mag.domain;

import java.io.Serializable;

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
@Table(name = "T_SOMP_FUNCTION_PACKAGE")
public class VpFunctionPackage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "FUNCTIONID")
    private Function function;
    
	@ManyToOne(optional = false)
	@JoinColumn(name = "PACKAGEID")
    private VpPackage vpPackage;
	
    @Column(name = "STATUS", length = 32, nullable = false)
    @Enumerated(EnumType.STRING)
    private VpFunctionPackageStatus status;
    
    @Column(name = "REMARK", length = 1000)
    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public VpPackage getVpPackage() {
        return vpPackage;
    }

    public void setVpPackage(VpPackage vpPackage) {
        this.vpPackage = vpPackage;
    }

    public VpFunctionPackageStatus getStatus() {
        return status;
    }

    public void setStatus(VpFunctionPackageStatus status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        VpFunctionPackage other = (VpFunctionPackage) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
