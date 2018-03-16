package core.exeptions;

import java.util.Arrays;

public class TrRec {
    public static void main(String[] args) {
        try (
                FailAuto in = new FailAuto("x");
                FailAuto out = new FailAuto("y")
        ) {
            //throw new RuntimeException();
        } catch (Throwable e) {
            System.err.println(e);
            Throwable[] suppressed = e.getSuppressed();
            System.err.println("suppressed: " + Arrays.toString(suppressed));
        }
    }
}
