import java.util.HashMap;
import java.util.Map;

public class Test4HashMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Один");
        hashMap.put(2, "Два");
        hashMap.put(3, "Три");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }


    }
}
