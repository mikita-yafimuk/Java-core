package Collections;

import java.util.HashMap;

public class MyHashMap {

    public static void main(String[] args) {
        HashMap <Integer, String> hashMap = new HashMap<>();

        hashMap.put(0, "Hello");
        hashMap.put(1, "world");
        hashMap.put(2, "!");
        System.out.println(hashMap);
    }
}
