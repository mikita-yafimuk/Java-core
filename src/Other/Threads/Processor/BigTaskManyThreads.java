package Other.Threads.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class BigTaskManyThreads {

    public Long startTask() {
        int ap = Runtime.getRuntime().availableProcessors();
        ExecutorService es = Executors.newFixedThreadPool(ap);

        Long summa = 0L;
        try {
            List<MyCallable> threads = new ArrayList<MyCallable>();
            for (int i = 0; i < Processor.STR_COUNT; i++) {
                threads.add(new MyCallable());
            }
            List<Future<Long>> result = es.invokeAll(threads);

            for (Future<Long> f : result) {
                summa += f.get();
            }
            es.shutdown();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace(System.out);
        }
        return summa;
    }
}
