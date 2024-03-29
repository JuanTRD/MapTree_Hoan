import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",31);
        hashMap.put("Anderson", 30);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook",29);
        System.out.println("Display Hashmap");
        System.out.println(hashMap);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display arrangement Map");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith",31);
        linkedHashMap.put("Anderson", 30);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook",29);
        System.out.println(linkedHashMap);
        System.out.println("The age for Lewis is " + linkedHashMap.get("Lewis"));
    }
}