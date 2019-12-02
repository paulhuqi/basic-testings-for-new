package array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class ArrayTest {
    static Logger logger = LoggerFactory.getLogger(ArrayTest.class);
    
    public static void main(String[] args) {
        arrpp();
    }
    
    private static void arrpp() {
        Integer[] stats = {0, 0, 0};
        stats[0]++;
        System.out.println(stats[0]);
    }
}
