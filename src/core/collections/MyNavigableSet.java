package core.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class MyNavigableSet
{

	public static void main(String[] args)
	{
		int[] array = new int[] { 0, 1, 2, 3, 4, 5 };

		NavigableSet<Integer> navigableSet = new TreeSet<>();

		for (int navigableArray : array)
			navigableSet.add(navigableArray);

		System.out.println("lower(): " + navigableSet.lower(5));
		System.out.println("higher(): " + navigableSet.higher(3));
		System.out.println("floor(): " + navigableSet.floor(4));

		System.out.println("descendingSet(): " + navigableSet.descendingSet());
		System.out.println("poolFirst(): " + navigableSet.pollFirst());
		System.out.println("poolLast(): " + navigableSet.pollLast());

	}
}
