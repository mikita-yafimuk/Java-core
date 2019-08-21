package core.io.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import core.io.serializable.persons.PersonC;

public class PersonWriterReader
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		ByteArrayOutputStream buff = new ByteArrayOutputStream();
		ObjectOutput out = new ObjectOutputStream(buff);

		out.writeObject(new PersonC("Nikita", 21));
		out.flush();
		out.close();

		byte[] data = buff.toByteArray();
		System.out.println(Arrays.toString(data));
		System.out.println(new String(data, "UTF-8"));

		ObjectInput input = new ObjectInputStream(new ByteArrayInputStream(data));
		PersonC person = (PersonC) input.readObject();
		System.out.println(person);
	}
}
