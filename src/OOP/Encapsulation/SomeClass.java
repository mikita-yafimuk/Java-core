package OOP.Encapsulation;

public class SomeClass {
    private String text1, text2;

    public SomeClass(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public String getString() {
        doSometring();
        return text2;
    }

    private void doSometring() {
        text2 += text1;
    }
}
