package Collections;

import beans.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListUpdate {
    
    public static void main(String[] args) {
        listUpdate();
    }
    
    private static void listUpdate() {
        List<Person> list = new ArrayList<>();
        Person hqb = new Person("hqb", 1);
        list.add(hqb);
        System.out.println(list.get(0));
        hqb.setAge(121);
        System.out.println(list.get(0));
        list.get(0).setAge(232);
        System.out.println(list.get(0));
        
    }
    
    private static void listMapUpdate() {
        Map<String, List<Person>> pMap = new HashMap<>();
        List<Person> list = new ArrayList<>();
        list.add(new Person("hqb", 1));
        list.add(new Person("hqb", 2));
        list.add(new Person("hqb", 3));
        pMap.put("a", list);
        System.out.println("persons: " + pMap.get("a"));
        for (Map.Entry<String, List<Person>> entry :
                pMap.entrySet()) {
            List<Person> list2 = entry.getValue();
            for (Person p :
                    list2) {
                p.setAge(p.getAge() + 1);
            }
        }
        System.out.println("persons: " + pMap.get("a"));
    }
}
