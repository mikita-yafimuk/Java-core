package core.patterns;

import java.io.Serializable;

/**
 * @author Mikita Yafimuk
 */
public class Singletons
{
	public static void main(String[] args)
	{
		Singleton1 singleton1 = Singleton1.getInstance();
		Singleton1 singleton11 = Singleton1.getInstance();
		Singleton2 singleton2 = Singleton2.getInstance();
		Singleton2 singleton22 = Singleton2.getInstance();
		System.out.println(singleton1 == singleton11);
		System.out.println(singleton2 == singleton22);
	}
}

class Singleton1 implements Serializable
{
	private static Singleton1 INSTANCE = null;

	private Singleton1()
	{
	}

	public static Singleton1 getInstance()
	{
		if (INSTANCE == null)
		{
			INSTANCE = new Singleton1();
		}
		return INSTANCE;
	}
}

class Singleton2
{
	private static class Holder
	{
		private static Singleton2 INSTANCE = new Singleton2();
	}

	private Singleton2()
	{
	}

	public static Singleton2 getInstance()
	{
		return Holder.INSTANCE;
	}
}
