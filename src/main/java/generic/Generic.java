package generic;

import java.util.Arrays;
import java.util.List;

public class Generic {
    
    public static void main(String[] args) {
        print3(Arrays.asList(new String[]{"11", "22"}));
    }
    
    private static <T> T print(T in) {
        System.out.println("input=" + in);
        return null;
    }
    
    private static void print2(Object in) {
        System.out.println("input=" + in);
    }
    
    private static <T> T print3(T in) {
        if (!(in instanceof List)) {
            System.out.println("input is not the right type.");
            return null;
        }
        List<Object> list = (List<Object>) in;
        System.out.println("input=" + in);
        return null;
    }
}
