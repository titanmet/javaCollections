import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test5LinkedHashMapTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer,String> map) {
        map.put(24,"Bob");
        map.put(3,"Djon");
        map.put(47,"Steven");
        map.put(12,"Slave");
        map.put(120,"Suzy");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
