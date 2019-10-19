package json;

import beans.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class ListObj2Json {
    public static void main(String[] args) {
        List<Person> ps = new ArrayList<>();
        for (int i=0; i<1; i++) {
            Person p = new Person("hqb", "m", 10 +i);
            ps.add(p);
        }
        ps.add(new Person());
        GsonBuilder gsonBuilder = new GsonBuilder();
        String json = gsonBuilder.serializeNulls().create().toJson(ps);
//        Gson gson = new Gson();
//        gson.serializeNulls();
        System.out.println("ps: " + json);
    }
}
