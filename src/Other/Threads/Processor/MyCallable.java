package Other.Threads.Processor;

import java.util.concurrent.Callable;

class MyCallable implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        Processor p = new Processor();
        return p.process();
    }
}
