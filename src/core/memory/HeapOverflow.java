package core.memory;

public class HeapOverflow
{
	public static void main(String[] args)
	{
		Object[] ref = new Object[1];
		int count = 0;
		while (true)
		{
			ref[0] = new Object[] { ref, ref, new byte[1_000] };
			ref = (Object[]) ref[0];
			System.out.println(count++);
		}
	}
}
