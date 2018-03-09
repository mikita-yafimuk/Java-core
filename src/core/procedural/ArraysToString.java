package core.procedural;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        arraysToString();
        loopTest();

        int a = 5;
        int b = 9;
        System.out.println(a);
        System.out.println(b);

        a ^= b;
        b =  a ^ b;
        a ^= b;

        System.out.println(a);
        System.out.println(b);
    }

    private static void arraysToString() {
        int[] array1D = {0, 1, 2};
        int[][] array2D = {{0, 1}, {0, 2}, {0, 3}};

        System.out.println(Arrays.toString(array1D));
        System.out.println(Arrays.deepToString(array2D));
    }

    private static void loopTest() {
        for (int k = 0; k < 10; k++) {
            System.out.println(" " + k);
            k--;
        }
    }

}
