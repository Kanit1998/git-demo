public class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException() {
    }

    public InvalidPasswordException (String message) {
        super(message);
        System.out.println("hello");
    }

    public static void main(String[] args) {

    }
}

