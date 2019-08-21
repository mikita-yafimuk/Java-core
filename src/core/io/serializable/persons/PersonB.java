package core.io.serializable.persons;

import java.io.Serializable;

public class PersonB implements Serializable
{
	private String name;
	private int age;

	public PersonB(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}
