package core.threads;

public class Random {
    private static int counter = 0;
    private static final int LOOP_COUNT = 100_000_000;
    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < LOOP_COUNT; i++) {
                    counter++;
                }
            }
        });
        t0.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < LOOP_COUNT; i++) {
                    counter++;
                }
            }
        });
        t1.start();

        t0.join();
        t1.join();

        System.out.println(counter);
    }

    public synchronized static void inc() {
        counter++;
    }
}
