public class InvalidNumberException extends Exception {

    public InvalidNumberException() {
        super("Invalid number! Please enter a number between 1 to 10.");
    }

    public InvalidNumberException(String message) {
        super(message);
    }
}
