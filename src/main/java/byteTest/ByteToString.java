package byteTest;

import java.util.ArrayList;
import java.util.List;

public class ByteToString {
    public static void main(String[] args) {
        stringToHex();
    }
    
    private static void stringToBytes() {
        String s = "ff";
        byte[] bytes = s.getBytes();
        List bList = new ArrayList<>();
        for (int i = 0; i < bytes.length; i++) {
            if ((i + 1) % 2 == 0) {
                bList.add((bytes[i - 1] << 4) | bytes[i]);
            }
        }
        System.out.println(bList);
    }
    
    private static void stringToHex() {
        String s = "ff";
    
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            String s4 = Integer.toHexString(ch);
            str = str + s4;
        }
        System.out.println(str);
        
    }
}
