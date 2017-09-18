package Other.Threads.SimplyThread;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        try {
            long pause = Math.round(Math.random()*2000);
            Thread.sleep(pause);
            System.out.println("Simple Thread - pause="+pause);
        } catch(InterruptedException i_ex) {

        }
    }
}
