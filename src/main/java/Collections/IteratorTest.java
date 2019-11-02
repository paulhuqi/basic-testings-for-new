package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List list = Arrays.asList(new String[]{"1", "2"});
        Iterator it = list.iterator();
        iter(it);
        it = list.iterator();
        iter(it);
    }
    
    private static void iter(Iterator it) {
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
