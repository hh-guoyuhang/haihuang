package haihuang.enums;

import java.io.Serializable;

public enum loginEnum implements Serializable {
    PHONE("0"),//电话
    THIRDPARTYWX("1"),//微信
    THIRDPARTYQQ("2");//qq
    private String toString;

    loginEnum(String toString){
        this.toString = toString;
    }

    public String getToString() {
        return toString;
    }
}
