package core.threads;

import java.util.Random;

public class ArrayThread {
    private static int THREAD_COUNT = 10;

    public static void main(String[] args) throws InterruptedException {
        int arrayLenght = 100_000_000;
        int[] array = new int[arrayLenght];
        Random random = new Random();
        int bound = arrayLenght / 2 * 31;
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = random.nextInt(bound);
        }

        MyRunnable[] runnables = new MyRunnable[THREAD_COUNT];
        Thread[] threads = new Thread[THREAD_COUNT];
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++) {
            int len = array.length / THREAD_COUNT;
            runnables[i] = new MyRunnable(array, len * i, len * (i + 1));
            threads[i] = new Thread(runnables[i]);
            threads[i].start();
        }
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i].join();
        }
        long t1 = System.currentTimeMillis();
        System.out.println("dT = " + (t0 - t1));
        for (int i = 0; i < THREAD_COUNT; i++) {
            System.out.println(runnables[i].maxValue);
        }
    }

}

class MyRunnable implements Runnable {
    private final int[] array;
    private final int from;
    private final int to;
    public volatile int maxValue;

    public MyRunnable(int[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        int currentMaxValue = array[from];
        for (int i = from + 1; i < to; i++) {
            currentMaxValue = Math.max(currentMaxValue, array[i]);
        }
        maxValue = currentMaxValue;
    }
}
