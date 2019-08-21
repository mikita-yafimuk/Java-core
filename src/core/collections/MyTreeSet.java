package core.collections;

import java.util.TreeSet;

public class MyTreeSet
{

	public static void main(String[] args)
	{

		int[] array = new int[] { 0, 1, 2, 3, 4, 5, 6, 7 };
		TreeSet<Integer> treeSet = new TreeSet<>();

		for (int i = 0; i < array.length; i++)
			treeSet.add(array[i]);

		System.out.println("Size of current TreeSet: " + treeSet.size());

		for (int i = 0; i < array.length / 2; i++)
			treeSet.remove(array[i]);

		System.out.println("Tree set after removing: " + treeSet.toString());
	}
}
