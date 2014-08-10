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
@Table(name = "T_SOMP_FUNCTION")
public class Function implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "FUNCTIONID", length = 255)
	private String functionId;

	@Column(name = "FUNCTIONNAME", length = 255, nullable = false)
	private String functionName;

    @Column(name = "TYPE", length = 30)
    private String type;

    @Column(name = "REMARK", length = 1000)
    private String remark;
    
    @OneToMany(mappedBy = "function", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<VpFunctionPackage> vpFunctionPackages;

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<VpFunctionPackage> getVpFunctionPackages() {
        return vpFunctionPackages;
    }

    public void setVpFunctionPackages(List<VpFunctionPackage> vpFunctionPackages) {
        this.vpFunctionPackages = vpFunctionPackages;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((functionId == null) ? 0 : functionId.hashCode());
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
        Function other = (Function) obj;
        if (functionId == null) {
            if (other.functionId != null)
                return false;
        } else if (!functionId.equals(other.functionId))
            return false;
        return true;
    }

}
