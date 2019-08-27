package sort;

import beans.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ListSortTest {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList() {{
            add(new Person("paul", "m", 11));
            add(new Person("max", "m", 13));
            add(new Person("fox", "m", 12));
        }};
//        System.out.println("persons size: "+ persons.size() + " , persons : " + persons.toString());
        System.out.println(persons.toString());

        Collections.sort(persons, (p1, p2)->(p2.getAge()-p1.getAge()));
        System.out.println(persons);

        new HashMap().get("");

    }
}
