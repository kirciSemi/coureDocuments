package day23exception;

public class InvalidNumberException extends RuntimeException{

    public InvalidNumberException(String message) {
        super(message);
    }
}
