package core.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        int[] keys = new int[] {3, 4, 5, 2, 1, 0};
        String[] values = new String[] {"a", "b", "c", "d", "e", "f"};

        for (int i = 0; i < keys.length; i++) {
            treeMap.put(keys[i], values[i]);
        }

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("First half of TreeMap: " + treeMap.headMap(3));
        System.out.println("Second half of TreeMap: " + treeMap.tailMap(3));

        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("A", "AAA");
        map.put("A", "aaa");
        map.put("Z", "ZZZ");
        map.put("C", "CCC");
        Iterator<Map.Entry<String, String>> iter1 = map.entrySet().iterator();
        while (iter1.hasNext()) {
            Map.Entry<String, String> entry = iter1.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
