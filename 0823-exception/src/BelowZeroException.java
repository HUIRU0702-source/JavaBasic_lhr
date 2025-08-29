public class BelowZeroException extends RuntimeException{
    static final long serialVersionUID = -7034897190745766939L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
