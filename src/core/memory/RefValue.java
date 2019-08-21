package core.memory;

public class RefValue
{
	public static void main(String[] args)
	{
		int x = 0;
		int[] arr = { 20 };
		f(x, arr);
		System.out.println(x + " " + arr[0]);
		g(x, arr);
		System.out.println(x + " " + arr[0]);

		User user = new User(10, "Nikita");
		System.out.println(user.age + " " + user.name);
		changeUser(user);
		System.out.println(user.age + " " + user.name);
		changeUser2(user);
		System.out.println(user.age + " " + user.name);
	}

	private static void f(int x, int[] arr)
	{
		x += 30;
		arr[0] = 40;
	}

	private static void g(int x, int[] arr)
	{
		x = 50;
		arr = new int[] { 60 };
	}

	private static void changeUser(User user)
	{
		user.age = 17;
		user.name = "Katya";
	}

	private static void changeUser2(User user)
	{
		user.age = 19;
		user = new User(1, "GRISHA");
	}

}
