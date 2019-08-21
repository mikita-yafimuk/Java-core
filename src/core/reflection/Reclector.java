package core.reflection;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Reclector
{

	private static final Set<Class<?>> BASE_CLASSES = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
			Integer.class, int.class, String.class
	)));

	public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException
	{
		User user = new User(18, "Nikita",
				new Address("Minsk", "Green Street"));
		System.out.println(toXml("", "User", user));

/*        Class clazz = Class.forName("java.lang.String");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }*/

	}

	private static String toXml(String spaces, String name, Object object) throws IllegalAccessException
	{
		spaces += "    ";
		Class clazz = object.getClass();
		String result = "<" + name + " type = '" + clazz.getSimpleName() + "'>\n";
		for (Field field : clazz.getDeclaredFields())
		{
			field.setAccessible(true);
			Object fieldValue = field.get(object);
			String fieldName = field.getName();
			if (BASE_CLASSES.contains(fieldValue.getClass()))
			{
				result += spaces + "<" + fieldName + " type = '" + field.getType().getSimpleName() + ">" + fieldValue
						+ "</" + fieldName + ">\n";
			}
			else
			{
				result += spaces + toXml(spaces, fieldName, fieldValue);
			}
		}
		result += "</" + clazz.getSimpleName() + ">\n";
		return result;
	}

}
