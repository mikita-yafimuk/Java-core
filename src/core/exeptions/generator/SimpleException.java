package core.exeptions.generator;

public class SimpleException extends Exception {

    private int errorCode;

    public SimpleException(String message) {
        this(0, message);
    }

    public SimpleException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
