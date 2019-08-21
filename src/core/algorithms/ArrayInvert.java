package core.algorithms;

import java.util.Arrays;

public class ArrayInvert
{
	public static void main(String[] args)
	{
		int[] array1D = { 0, 1, 2 };
		System.out.println(Arrays.toString(invertArr(array1D)));
	}

	private static int[] invertArr(int[] data)
	{
		for (int k = 0; k < data.length / 2; k++)
		{
			int temp = data[k];
			data[k] = data[data.length - 1 - k];
			data[data.length - 1 - k] = temp;
		}

		return data;
	}
}
