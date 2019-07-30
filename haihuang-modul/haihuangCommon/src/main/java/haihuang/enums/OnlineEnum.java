package haihuang.enums;

import java.io.Serializable;

public enum OnlineEnum implements Serializable {
    IN("1"),//在线
    OUT("0");//离线
    private String toString;

    OnlineEnum(String toString){
        this.toString = toString;
    }

    public String getToString() {
        return toString;
    }
}
