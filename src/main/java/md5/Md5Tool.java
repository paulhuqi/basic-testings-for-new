package md5;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Tool {
    
    public static void main(String[] args) {
//        String s = "18932471292|1020004";
        String s = "钱露娟|1021902";
        System.out.println(getByteMd5(s.getBytes()).substring(0, 8).concat("|").concat(s));
    }
    
    public static String getByteMd5(byte[] bytes){
        String result = "";
        if(bytes!=null){
            try {
                MessageDigest MD5 = MessageDigest.getInstance("MD5");
                MD5.update(bytes);
                result = bufferToHex(MD5.digest());
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    
    private static String bufferToHex(byte bytes[]) {
        return bufferToHex(bytes, 0, bytes.length);
    }
    
    private static String bufferToHex(byte bytes[], int m, int n) {
        StringBuffer stringbuffer = new StringBuffer(2 * n);
        int k = m + n;
        for (int l = m; l < k; l++) {
            appendHexPair(bytes[l], stringbuffer);
        }
        return stringbuffer.toString();
    }
    
    private static void appendHexPair(byte bt, StringBuffer stringbuffer) {
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' };
        char c0 = hexDigits[(bt & 0xf0) >> 4];
        char c1 = hexDigits[bt & 0xf];
        stringbuffer.append(c0);
        stringbuffer.append(c1);
    }
}
