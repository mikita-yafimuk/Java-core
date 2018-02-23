package core.threads.clock;

public class MyThread extends Thread{

    private SimpleClock clock;

    public MyThread(SimpleClock clock) {
        this.clock = clock;
    }

    @Override
    public void run() {
        while (true) {
            clock.setTime();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
