package core.exeptions;

import java.io.IOException;

public class Brainteaser {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception("a");
            } finally {
                if (true) {
                    throw new IOException("b");
                }
                System.err.print("c");
            }
        } catch (IOException e) {
            System.err.print(e.getMessage());
        } catch (Exception e) {
            System.err.print("d");
            System.err.print(e.getMessage());
        }
    }
}
