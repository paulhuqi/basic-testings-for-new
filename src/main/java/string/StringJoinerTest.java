package string;

import java.util.StringJoiner;

/**
 * description:
 * creator: Rzxuser
 * create time: 2019/11/14 15:42
 **/
public class StringJoinerTest {
    public static void main(String[] args) {
        joinWithNull();
    }
    
    private static void joinWithNull() {
        StringJoiner sj = new StringJoiner(",");
        sj.add("").add("ab");
        System.out.println(sj.toString());
        String a = null;
        System.out.println();
    }
    
}
