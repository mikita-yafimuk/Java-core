package OOP.Inheritance;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Nokia phone = new Nokia();
        phone.model = "Nokia Lumia";

        if (Objects.equals(phone.getModel(), "Nokia 3310")) {
            getResult(phone.getErrorMessage());
        } else
            getResult(phone.getSuccessMessage());
    }

    public static void getResult(String text) {
        System.out.println(text);
    }
}
