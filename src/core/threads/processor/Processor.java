package core.threads.processor;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Processor {

    public static final int STR_COUNT = 100;
    public static final int TASK_COUNT = 10000;

    public static void main(String[] args) {
        {
            BigTaskOneThread bt = new BigTaskOneThread();
            long d1 = System.currentTimeMillis();
            Long result = bt.startTask();
            long d2 = System.currentTimeMillis();
            System.out.println(result + ", Time 1:" + (d2 - d1));
        }
        {
            BigTaskManyThreads bt = new BigTaskManyThreads();
            long d1 = System.currentTimeMillis();
            Long result = bt.startTask();
            long d2 = System.currentTimeMillis();
            System.out.println(result + ", Time 2:" + (d2 - d1));
        }
    }

    public Long process() {
        Long summa = 0L;

        SecureRandom random = new SecureRandom();
        for (int i = 0; i < Processor.TASK_COUNT; i++) {
            String g = new BigInteger(500, random).toString(32);
            for (char c : g.toCharArray()) {
                summa += c;
            }
        }
        return summa;
    }
}

