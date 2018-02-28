package core.memory;

public class InitField {
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

    public InitField() {
        field = "CONSTR";
        System.out.println("Object init:" + field);
    }


    public static void main(String[] args)
    {
        InitField init1 = new InitField();
        System.out.println(init1.field);
    }
}
