package core.oop;

public class Boxing {
    public static void main(String[] args) {
        ints();
        System.out.println();
        strs();
    }

    public static void ints() {
        // -128 - 127
        //it use valueOf method
        Integer k0 = 100;
        Integer k1 = 100;
        System.out.println(k0 == k1); //true

        Integer k2 = new Integer(100);
        Integer k3 = new Integer(100);
        System.out.println(k2 == k3); //false

        Integer k4 = 150;
        Integer k5 = 150;
        System.out.println(k2 == k3); //false
    }

    public static void strs() {
        String s0 = new String("Hello");
        String s0In = s0.intern();

        String s1 = "Hell" + (System.currentTimeMillis() > 0 ? "o" : "a");
        String s1In = s1.intern();

        System.out.println(s0 == s1); //false
        System.out.println(s0In == s1In); //true
    }
}
