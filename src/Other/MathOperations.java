package Other;

import java.util.Random;

public class MathOperations {
    public static void main(String[] args) {

        double d = Math.random();
        int max = Math.max(7, 9);
        double pow = Math.pow(2, 10);
        double rounded = Math.round(123.456);

        Random generator = new Random();
        int rnd = generator.nextInt(1000000);

        System.out.println(d + " " + max + " " + pow + " " + rounded);
        System.out.println(rnd);

    }
}
