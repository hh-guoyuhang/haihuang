package haihuang.enums;

import java.io.Serializable;

public enum MathNumberEnum implements Serializable {
    Zero("0"),
    One("1"),
    Two("2"),
    Three("3"),
    Four("4"),
    Five("5"),
    Six("6"),
    Seven("7"),
    Eight("8"),
    Nine("9");
    private String toString;

    MathNumberEnum(String toString){
        this.toString = toString;
    }

    public String getToString() {
        return toString;
    }
}
