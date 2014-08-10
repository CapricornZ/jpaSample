package com.shanghaionstar.mag.domain;

public enum ManagedContentCategoryType {
	TRUE_STORY,
	ASSISTANT,
	PROMOTION,
	OVD_EMAIL,
    BUICK_CARE,
    BUICK_CARE_JPFW,
    BUICK_CARE_HDXX,
    ONSTAR_ZCXY,
    ONSTAR_FWJS,
    ONSTAR_SYBZ,
    ONSTAR_GNJS,
    ONSTAR_AD,
    ONSTAR_ADVERTISEMENT,
    ONSTAR_SSA,
    BUICK_CARE_YCTS;
	
	public String value() {
        return name();
    }

    public static ManagedContentCategoryType fromValue(String v) {
        return valueOf(v);
    }
	
}
