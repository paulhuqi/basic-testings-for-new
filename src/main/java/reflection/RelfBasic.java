package reflection;

import beans.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RelfBasic {
    public static void main(String[] args) throws Exception {
        set();
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
    
    private static void set() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person p = new Person();
        Class person = Class.forName("beans.Person");
        Field[] fields = person.getDeclaredFields();
        System.out.println("fields size: " + fields.length);
        Object setValue = new String("1");
        for (Field f : fields) {
            String fName = f.getName();
            String upFiledName = fName.substring(0, 1).toUpperCase() + fName.substring(1);
            String setMethod = "set" + upFiledName;
            Method setMd = person.getMethod(setMethod, new Class[]{f.getType()});
//            setMd.invoke(p, setValue);
//            setMd.invoke(p, f.getType().cast(setValue));
            if (f.getType().equals(String.class)) {
                setMd.invoke(p, setValue.toString());
            } else if (f.getType().equals(Long.class)) {
                setMd.invoke(p, Long.valueOf(setValue.toString()));
            } else if (f.getType().equals(Integer.class)) {
                setMd.invoke(p, Integer.valueOf(setValue.toString()));
            }
        }
        System.out.println("person: " + p);
    }
}
