package haihuang.enums;

import java.io.Serializable;

public enum loginEnum implements Serializable {
    PHONE("0"),
    THIRDPARTYWX("1"),
    THIRDPARTYQQ("2");
    private String toString;

    loginEnum(String toString){
        this.toString = toString;
    }

    public String getToString() {
        return toString;
    }
}
