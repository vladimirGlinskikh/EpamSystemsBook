package part_2.chapter_8.exceptions;

public class CoinLogicException extends Exception {
    public CoinLogicException() {

    }

    public CoinLogicException(String message, Throwable exception) {
        super(message, exception);
    }

    public CoinLogicException(String message) {
        super(message);
    }

    public CoinLogicException(Throwable exception) {
        super(exception);
    }
}
