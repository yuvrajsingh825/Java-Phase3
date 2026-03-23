class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class pass {
    public static void main(String[] args) {

        String password = "123"; 

        try {
            if (password == null || password.length() < 6) {
                throw new InvalidPasswordException("Password must be at least 6 characters long!");
            }

            System.out.println("Login successful");

        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}