package haihuang.enums;

import java.io.Serializable;

public enum DynamicTypeEnum implements Serializable {
    picture("0"),//图片
    video("1"),//视频
    voice("2");//录音
    private String toString;

    DynamicTypeEnum(String toString){
        this.toString = toString;
    }

    public String getToString() {
        return toString;
    }
}
