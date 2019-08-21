package core.exeptions;

public class StringSizeWithFinally
{
	public static void main(String[] args)
	{
		System.out.println(stringSize("string"));
		System.out.println(stringSize(null));

	}

	public static int stringSize(Object s)
	{
		try
		{
			return s.toString().length();
		}
		catch (Exception e)
		{
			return 1;
		}
		finally
		{
			return 0;
		}
	}
}
