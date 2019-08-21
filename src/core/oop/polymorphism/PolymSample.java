package core.oop.polymorphism;

import java.util.ArrayList;
import java.util.List;

interface Figure
{
	int[] getCenter();

	void render();
}

public class PolymSample
{

	public static void main(String[] args)
	{
		List<Figure> figures = new ArrayList<>();
		figures.add(new Square());
		figures.add(new Rectangle());

		render(figures);
	}

	public static void render(List<Figure> figures)
	{
		for (Figure f : figures)
		{
			f.render();
		}
	}

}

class Square implements Figure
{
	@Override
	public int[] getCenter()
	{
		return new int[0];
	}

	@Override
	public void render()
	{

	}
}

class Rectangle implements Figure
{
	@Override
	public int[] getCenter()
	{
		return new int[0];
	}

	@Override
	public void render()
	{

	}
}
