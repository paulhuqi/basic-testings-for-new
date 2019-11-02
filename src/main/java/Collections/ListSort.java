package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"face_imsis_profile_20191028", "face_imsis_profile_20191027", "face_imsis_profile_20191023"});
        System.out.println("list:" + list);
//        Collections.sort(list);
        list.sort((a, b) -> a.compareTo(b)>0?-1:1);
        System.out.println("lbist:" + list);
    }
}
