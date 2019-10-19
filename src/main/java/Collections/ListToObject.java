package Collections;

import beans.Person;

import java.util.ArrayList;
import java.util.List;

public class ListToObject {
    
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("a", "b", 11));
        list.add(new Person("c", "d", 11));
        listToObject(list);
    }
    
    private static void listToObject(Object o) {
        for (Person s :
                (List<Person>) o) {
            System.out.println(s.getName());
        }
    }
}
