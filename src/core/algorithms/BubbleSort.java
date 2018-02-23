package core.algorithms;

import java.util.Arrays;

public class BubbleSort {
    private static int[] bubbleSort (int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array [j+1];
                    array [j+1] = temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {9, 3, 4, 7, 2, 0 , 1, 10};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
