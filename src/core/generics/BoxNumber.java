package core.generics;

public class BoxNumber<T extends Number>
{
	private T item;

	public T getItem()
	{
		return item;
	}

	public void setItem(T item)
	{
		this.item = item;
	}
}
