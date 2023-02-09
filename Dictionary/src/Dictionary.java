import java.util.*;

public class Dictionary {

    private static Map<String, String> map = new LinkedHashMap<>();


    public static void addEntry(String key, String value) {
        try {
            map.put(key, value);
            System.out.println("value added");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void getDefinition(String key) {
        System.out.println("value is: " + map.get(key));
    }

    //3
    public static void editEntry(String key, String value) {
        map.replace(key, value);
        System.out.println(key + " replaced");
    }

    public static void deleteEntry(String key) {
        map.remove(key);
        System.out.println(key + " " + " deleted");
    }

    public static void printAll() {
        System.out.println(map.keySet());
    }

    public static void getEntitiesSorted() {
        Map<String, String> treeMap1 = new TreeMap<>(map);
        for (String sKey : treeMap1.keySet()) {
            System.out.println("Key -> " + sKey + ":::::::: value -> " + map.get(sKey));
        }
        map.clear();
        map.putAll(treeMap1);
    }
}
