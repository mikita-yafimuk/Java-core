package core.procedural;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lambda
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		String[] months = { "January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December" };
		numbers.forEach(System.out::println);
		System.out.println("Sum: " + sumAll(numbers, number -> true));
		System.out.println("Sum: " + sumAll(numbers, number -> number % 2 == 0));
		System.out.println("Sum: " + sumAll(numbers, number -> number > 3));

		Arrays.sort(months, Comparator.comparingInt(String::length));
		Arrays.sort(months, (o1, o2) -> o1.length() - o2.length());
		System.out.println(Arrays.toString(months));
	}

	public static int sumAll(List<Integer> numbers, Predicate<Integer> predicate)
	{
		int total = 0;
		for (int number : numbers)
		{
			if (predicate.test(number))
			{
				total += number;
			}
		}

		return total;
	}
}
