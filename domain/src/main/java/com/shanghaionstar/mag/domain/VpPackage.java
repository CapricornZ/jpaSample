package com.shanghaionstar.mag.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_SOMP_PACKAGE")
public class VpPackage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "PACKAGEID", length = 255)
	private String packageId;

	@Column(name = "PACKAGENNAME", length = 255, nullable = false)
	private String packagenName;

    @Column(name = "REMARK", length = 1000)
    private String remark;
    
    @Column(name = "DESCRIPTION", length = 1000)
    private String description;
    
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(mappedBy = "vpPackage", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<VpFunctionPackage> spFunctionPackages;

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getPackagenName() {
        return packagenName;
    }

    public void setPackagenName(String packagenName) {
        this.packagenName = packagenName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<VpFunctionPackage> getSpFunctionPackages() {
        return spFunctionPackages;
    }

    public void setSpFunctionPackages(List<VpFunctionPackage> spFunctionPackages) {
        this.spFunctionPackages = spFunctionPackages;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((packageId == null) ? 0 : packageId.hashCode());
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
        VpPackage other = (VpPackage) obj;
        if (packageId == null) {
            if (other.packageId != null)
                return false;
        } else if (!packageId.equals(other.packageId))
            return false;
        return true;
    }

}
