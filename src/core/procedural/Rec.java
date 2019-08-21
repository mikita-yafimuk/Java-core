package core.procedural;

public class Rec
{

	public static void main(String[] args)
	{
		x(1);
		System.out.println();
		y(1);
		System.out.println();
		Node tail = $(0, 1, 2, 3);
		System.out.println(toStringIter(tail));
		System.out.println(toStringRec(tail));
	}

	public static void x(int arg)
	{
		System.out.print(" " + arg);
		if (arg < 7)
		{
			x(2 * arg);
		}
	}

	public static void y(int arg)
	{
		if (arg < 7)
		{
			y(2 * arg);
		}
		System.out.print(" " + arg);
	}

	public static String toStringIter(Node tail)
	{
		String result = "";
		while (tail != null)
		{
			result += tail.value + "->";
			tail = tail.next;
		}
		return result + "*";
	}

	public static String toStringRec(Node tail)
	{
		return (tail == null) ? "*" : tail.value + "->" + toStringRec(tail.next);
	}

	public static Node $(int... values)
	{
		Node tail = null;
		for (int i = values.length - 1; i >= 0; i--)
		{
			tail = new Node(values[i], tail);
		}
		return tail;
	}

	static class Node
	{
		private int value;
		private Node next;

		public Node(int value, Node next)
		{
			this.value = value;
			this.next = next;
		}

	}
}
