class InvalidAgeExcecption extends Exception{
    public InvalidAgeExcecption(String message){
        super(message);
    }
}

public class Age {
    public static void main(String[]age){
        int age1 = 14;
        try{
            if(age1<18){
                throw new InvalidAgeExcecption("Age is not valid!");

            }
            System.out.println("Eligible");
        }
        catch(InvalidAgeExcecption e){
            System.out.println(e.getMessage());
        }
    }
}
