package json;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class MapToJson {
    
    public static void main(String[] args) {
        mapToJson();
    }
    
    private static void mapToJson() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "hqb");
        map.put("phone", "11,22,33".split(","));
        Gson gson = new Gson();
//        gson.toJson(map);
        System.out.println("json string: " + gson.toJson(map));
        map.put("age", 3);
        System.out.println("json string: " + gson.toJson(map));
    }
}
