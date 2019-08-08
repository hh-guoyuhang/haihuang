package haihuang.tools;

import java.util.UUID;

public class UUID16 {
    public static String getUUID(){
        int id =1;
        int hashCodev = UUID.randomUUID().toString().hashCode();
        if(hashCodev<0){
            hashCodev = -hashCodev;
        }
        return id + String.format("%015d",hashCodev);
    }
}
