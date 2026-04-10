class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

public class Custom {
    public static void main(String[] args) {

        int balance = 500;

        try {
            if(balance < 1000){
                throw new LowBalanceException("Balance is too low!");
            }
            System.out.println("Transaction successful");

        } catch (LowBalanceException e){
            System.out.println(e.getMessage());
        }
        System.out.println("HHello");
    }
}