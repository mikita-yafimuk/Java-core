package core.procedural;

import java.util.Arrays;

public class Permutator
{
	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3 };
		permute(arr, arr.length);
		for (int i = 1; i <= 70000; i++)
		{
			System.out.println(((i & 1) == 0) ? "четное" + i : "нечетное" + i);
		}
	}

	public static void permute(int[] arr, int size)
	{
		if (size < 2)
		{
			System.out.println(Arrays.toString(arr));
		}
		else
		{
			for (int i = 0; i < size; i++)
			{
				swap(arr, i, size - 1);
				permute(arr, size - 1);
			}
		}
	}

	private static void swap(int[] arr, int index0, int index1)
	{
		int temp = arr[index0];
		arr[index0] = arr[index1];
		arr[index1] = temp;
	}
}
