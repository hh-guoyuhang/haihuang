package haihuang.enums;

import java.io.Serializable;

public enum RoomEnum implements Serializable {
    summon("1"),//召唤
    summoning("0");//召唤中
    private String toString;

    RoomEnum(String toString){
        this.toString = toString;
    }

    public String getToString() {
        return toString;
    }
}
