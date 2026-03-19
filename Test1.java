public class Test1 {
    public static void main(String[]args){
    try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Divide error");
}

try {
    int arr[] = {1,2,3};
    System.out.println(arr[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index error");
}
}
}
