package reflection;

import beans.Person;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectIter {
    
    public static void main(String[] args) throws Exception {
        iterByPropertyDescriptor();
    }
    
    private static void iterByPropertyDescriptor() throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        Person p = new Person("hqb", "m", 21);
        Class<? extends Person> pClass = p.getClass();
        System.out.println("p: " + p);
        Object setValue = new String("1");
        for (Field f :
                pClass.getDeclaredFields()) {
            PropertyDescriptor pd = new PropertyDescriptor(f.getName(), pClass);
            Method writeMethod = pd.getWriteMethod();
            if (f.getType().equals(String.class)) {
                writeMethod.invoke(p, setValue.toString());
            } else if (f.getType().equals(Long.class)) {
                writeMethod.invoke(p, Long.valueOf(setValue.toString()));
            } else if (f.getType().equals(Integer.class)) {
                writeMethod.invoke(p, Integer.valueOf(setValue.toString()));
            }
        }
        
        System.out.println("p: " + p);
    }
}
