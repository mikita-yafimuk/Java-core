package core.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyHashMap
{

	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		// добавление элемента
		map.put("A", "AAA");
		map.put("Z", "ZZZ");
		map.put("z", "zzz");
		map.put("K", "KKK");
		map.put("F", "FFF");
		map.put("O", "OOO");
		// извлечение элемента
		System.out.println(map.get("Z"));
		// удаление элемента
		map.remove("Z");
		// проход по коллекции
		for (String s : map.keySet())
		{
			System.out.print(s + " -> " + map.get(s) + "; ");
		}
		System.out.println();
		// сортировка коллекции
		Map<String, String> tree = new TreeMap<String, String>(map);
		tree.forEach((key, value) -> System.out.print(key + " -> " + value + "; "));
	}
}
