package others;

import java.util.Arrays;

public class TestAnything {
    public static void main(String[] args) {
        String[] counts = {"0", "1"};
        counts[counts.length - 1] = Integer.valueOf(counts[counts.length - 1]) + 1 + "";
        System.out.println(String.join(",", counts));
    }
    
    private static void debugOnCondition() {
        for (int i=0; i<14; i++) {
            System.out.println("i="+i);
        }
    }
}
