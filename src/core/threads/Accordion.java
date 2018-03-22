package core.threads;

public class Accordion {
    public static void main(String[] args) throws InterruptedException {
        for (int k = 0; k < 10; k++) {
            // A + B
            Runnable printerA = new PrintRunnable("A   .", 100);
            Thread threadA = new Thread(printerA);
            threadA.start();
            Runnable printerB = new PrintRunnable(".   B", 99);
            Thread threadB = new Thread(printerB);
            threadB.start();
            threadA.join();
            threadB.join();
            // C
            threadA.toString();
            System.out.println("-----");
            Runnable printerC = new PrintRunnable("  C", 100);
            System.out.println("-----");
            printerC.run();
        }
    }
}
