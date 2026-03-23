public class Transaction {
    public static void main(String[] args) {
      
        int balance = 1050;

        try {
            if(balance < 1000){
                throw new ArithmeticException("Low balance");
            }
            System.out.println("Eligible");
            
                System.out.println("Transaction successful");
            
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
   
