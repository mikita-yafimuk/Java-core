package core.generics;

public class Main
{
	public static void main(String[] args)
	{
		Box<Integer> intBox = new Box<>();
		intBox.setItem(4);

		Box<String> strBox = new Box<>();
		strBox.setItem("test");

		Box allBox = new Box();
		allBox.setItem(4);
		allBox.setItem("test");
		System.out.println(allBox.getItem());

		BoxNumber<Integer> integerBoxNumber = new BoxNumber<>();
		integerBoxNumber.setItem(4);
		BoxNumber<Float> floatBoxNumber = new BoxNumber<>();
		floatBoxNumber.setItem(8f);
		sum(integerBoxNumber, floatBoxNumber);

	}

	private static void sum(BoxNumber<? extends Number> num1, BoxNumber<? extends Number> num2)
	{

	}

}
