package lab3.task1;

public class CustomException extends RuntimeException {
    public CustomException(ErrorCode errorCode, String errorMessage) {
        super(errorMessage);
    }

}
