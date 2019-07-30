package haihuang.enums;

import java.io.Serializable;

public enum BelongToTheSeaEnum implements Serializable {
    PacificOcean("1"),//太平洋
    Atlantic ("2"),//大西洋
    IndianOcean("3"),//印度洋
    ArcticOcean("4");//印度洋
    private String toString;

    BelongToTheSeaEnum(String toString){
        this.toString = toString;
    }

    public String getToString() {
        return toString;
    }
}
