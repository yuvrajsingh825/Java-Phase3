public class Test3 {
    public static void main(String[] args) {
        try {
    int arr[] = {1,2,3};
    System.out.println(arr[5]);
    int x = 10 / 0;
}
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Index error");
}
catch(ArithmeticException e){
    System.out.println("Divide error");
}
finally{
    System.out.println("This block always executed");
}
    }
}