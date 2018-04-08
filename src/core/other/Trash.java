package core.other;

public class Trash {
    public static void main(String[] args) {
        String test0 = "java";
        String test1 = "ja" + (System.currentTimeMillis() > 0 ? "va" : "sd");
        String test3 = "ja" + "va";
        System.out.println(test0 == test1); //false
        System.out.println(test0 == test3); //true
    }
}
