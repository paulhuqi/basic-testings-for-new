package sort;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 4, 1, 5, 10, 22, 11, 8};
        printArr(arr);
        int count = sort(arr);
        printArr(arr);
        System.out.println("count: " + count);
    }
    
    private static int sort(Integer[] arr) {
        Integer k = 0;
        int count = 0;
        for (Integer i = 0; i < arr.length; i++) {
            for (Integer j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                    count++;
//                    swichPosition(arr[j], arr[j + 1], k);
                }
            }
        }
        return count;
    }
    
    private static void swichPosition(Integer a, Integer b, Integer k) {
        k = a;
        a = b;
        b = k;
    }
    
    private static void printArr(Integer[] arr) {
        for (Integer i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
