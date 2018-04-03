package core.threads;

public class CtrlBreak {
    public static void main(String[] args) {
        Thread[] threads = new Thread[Thread.activeCount()];
        Thread.enumerate(threads);
        for (Thread t : threads) {
            System.out.println(t);
        }

        while (true);

    }
}
