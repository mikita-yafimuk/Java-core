package Other;

public class InitField {
/*    Первый блок вызывается при создании класса, после установки значений статических свойств при объявлении.
    Второй вызывается во время создания объекта сразу перед конструктором, но после того,
    как будут установлены поля, которым при объявлении присваивается какое-то значение.
    Сразу видно, что секция static вызывается только один раз, а секция для экземпляра
    (инстанса — есть такой термин у программистов. На английском Instance — экземпляр объекта)
    вызывается при создании каждого объекта.         */


    protected static String staticField;
    protected String field;

    // вызывается при загрузке класса в Java-машину
    static {
        staticField = "Static test";
        System.out.println("Static init:" + staticField);
    }

    // вызывается при создании объекта
    {
        field = "Test";
        System.out.println("Object init:" + field);
    }


    public static void main(String[] args)
    {
        InitField init1 = new InitField();
        System.out.println(init1.field);

        InitField init2 = new InitField();
        System.out.println(init2.field);
    }
}
