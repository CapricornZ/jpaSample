package com.shanghaionstar.mag.domain;

/**
 * @author SYF
 * 
 */
public enum FunctionType {

    F0101, F0201, F0301, F0401, F0501, F0601, F0701, F0801, F0901, F1001, F1101, F1201, F1301, F1401, F1501, F1601, F1701, F1801, F1901, F2001, F2101, F2201, F2301, F2401, F2501, F2601, F2701, F2801, F2901, F3001, F3101, F3201, F3301;
    public static FunctionType fromValue(String v) {
        return valueOf(v);
    }
}
