public class Test {
    public static void main(String[] args) {

        try {
            int arr[] = {1,2,3};
            int result = 10 / 0;  // error 1
            System.out.println(arr[5]); // error 2
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }

        System.out.println("Program continues...");
    }
}