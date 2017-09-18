package OOP.MyIdea;

public interface Cry {
    default void cry() {
        System.out.println("Person is crying");
    }
}
