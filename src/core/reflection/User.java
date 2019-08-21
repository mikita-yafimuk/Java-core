package core.reflection;

public class User
{
	private int age = 21;
	private String name = "Nikita";
	private Address address;

	public User(int age, String name, Address address)
	{
		this.age = age;
		this.name = name;
		this.address = address;
	}
}
