package core.collections;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        int[] array = new int[] {4, 2, 0, 3, 1};

        for (int elements : array)
            queue.add(elements);

        System.out.println("Original queue: " + queue);
        System.out.println("Delete element: " + queue.remove());
        System.out.println("Queue after removing: " + queue);
    }
}
