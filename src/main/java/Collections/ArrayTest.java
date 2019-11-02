package Collections;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String[] arr = {"0", "1"};
        System.out.println("arr=" + arr + " , " + Arrays.asList(arr));
        arrayRef(arr);
        System.out.println("arr=" + arr + " , " + Arrays.asList(arr));
        
    }
    
    private static void arrayRef(String[] arr) {
        if (arr != null) {
            arr[0] = "new0";
        }
    }
}
