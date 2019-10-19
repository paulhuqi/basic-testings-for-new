package others;

import java.util.HashMap;

public class Strings {
    public static void main(String[] args) {
        stringPlusCompareStrArr();
        new HashMap<>();
    }
    
    private static void stringPlusCompareStrArr() {
        String idNo = "idNo";
        String idType = "idType";
        String[] idArr = {idNo, idType};
        int testTimes = 1000000;
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < testTimes; i++) {
            idArr.hashCode();
        }
        System.out.println("idArr.hashCode() time taken: " + (System.currentTimeMillis() - startTime1));
        
        long startTime2 = System.currentTimeMillis();
        String str = null;
        for (int i = 0; i < testTimes; i++) {
            str = idNo + idType;
        }
        System.out.println("idNo + idType time taken: " + (System.currentTimeMillis() - startTime2));
    }
}
