package others;

import beans.Person;

public class BeanTest {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("age=" + person.getAge());
    }
}
