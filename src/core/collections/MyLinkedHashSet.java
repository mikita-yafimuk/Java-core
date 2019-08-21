package core.collections;

import java.util.LinkedHashSet;

public class MyLinkedHashSet
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> set = new LinkedHashSet<String>();

		set.add("one");
		set.add("two");
		set.add("two");
		set.add("three");

		for (String str : set)
		{
			System.out.println(str);
		}
	}
}
