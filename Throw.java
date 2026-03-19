public class Throw {
    public static void main(String[] args) {
        int age = 12;
        if(age>=18){
            System.out.println("You are eligible in Bar ");

        }
        throw new ArithmeticException("yOU ARE NOT ELIGIBLE IN BAR ");
    }
}