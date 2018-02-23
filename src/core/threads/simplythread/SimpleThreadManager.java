package core.threads.simplythread;

public class SimpleThreadManager {

    public static void main(String[] arg) {
        for(int i=0; i<10; i++) {
            Thread first = new SimpleThread();
            first.start();
        }
    }
}
