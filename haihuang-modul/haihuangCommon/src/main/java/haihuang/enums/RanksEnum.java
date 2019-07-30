package haihuang.enums;

import java.io.Serializable;

public enum RanksEnum implements Serializable {

    POND("1"),//塘王
    RIVER("2"),//河王
    PAMELA("3"),//江王
    SEA("4"),//海王
    SEAKING("5");//海皇


    private String toString;

    RanksEnum(String toString){
        this.toString = toString;
    }

    public String getToString() {
        return toString;
    }

}
