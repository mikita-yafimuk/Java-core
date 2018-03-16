package core.memory;

import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        int number = 10;
        int[] array = {10, 20, 30};
        change(number, array);
        System.out.println("Number: " + number + "; Array: " + Arrays.toString(array));
    }

    private static void change(int number, int[] arg) {
        number = 100;
        arg[0] = 100;
    }
}
