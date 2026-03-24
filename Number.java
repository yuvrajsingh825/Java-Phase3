import java.util.Scanner;
import java.util.InputMismatchException;
class NegativeNumberException extends Exception{
        public NegativeNumberException(String message){
            super(message);
        }
    }

public class Number {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int num = sc.nextInt();

      try{
        if(num<0){
            throw new NegativeNumberException ("Negative number is not allowed");
        }
        System.out.println("You entered " + num);
      } catch (NegativeNumberException e) {
        System.out.println(e.getMessage());
      }
      finally{
        sc.close();
      }

    }
}
