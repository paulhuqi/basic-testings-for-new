package reflection;

import beans.Person;

import java.lang.reflect.Field;

public class RelfBasic {
    public static void main(String[] args) throws ClassNotFoundException {
        typeTest();

    }

    private static void getClassName() {
        String classFullName = new Person().getClass().getName();
        String className = classFullName.substring(classFullName.lastIndexOf(".") + 1, classFullName.length());
        System.out.println("className: " + className);
    }

    private static void typeTest() throws ClassNotFoundException {
//        Person person = new Person();
        Class person = Class.forName("beans.Person");
//        Class person = new Person().getClass();
        Field[] fields = person.getDeclaredFields();
        System.out.println("fields size: " + fields.length);
        for (Field f : fields) {
            System.out.println("field name: " + f.getName() + " , field type: " + f.getType());
            if (f.getType().toString().equals("long")) {
                System.out.println("field type is long");
            }
        }
//        Class type = new Long(100L).getClass();
//        long l = 10L;
//        System.out.println(type.isInstance(Long.class));
//        System.out.println(type.equals(Long.class));
    }
}
