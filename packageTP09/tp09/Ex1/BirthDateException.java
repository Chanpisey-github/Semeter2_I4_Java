package tp09.Ex1;

public class BirthDateException extends Exception {
    public BirthDateException() {
        super("Invalid date of birth.");
    }

    public BirthDateException(String message) {
        super(message);
    }
}
