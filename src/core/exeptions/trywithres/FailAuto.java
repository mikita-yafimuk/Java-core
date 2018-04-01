package core.exeptions.trywithres;

public class FailAuto implements AutoCloseable{
    private String msg;

    public FailAuto(String msg) {
        System.err.println("create: " + msg);
        this.msg = msg;
    }

    @Override
    public void close() {
        System.err.println("close: " + msg);
        throw new Error();
    }
}
