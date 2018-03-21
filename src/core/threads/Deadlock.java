package core.threads;

public class Deadlock {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
        System.out.println("DEADLOCK");
    }
}
