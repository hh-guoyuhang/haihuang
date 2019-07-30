package haihuang.enums;

import java.io.Serializable;

public enum SexEnum implements Serializable {
    BOY("1"),
    GIRL("0");
    private String toString;

    SexEnum(String toString){
        this.toString = toString;
    }

    public String getToString() {
        return toString;
    }
}
