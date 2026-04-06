import java.util.ArrayList;

public class WrapperEx2 {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // auto-boxing
        list.add(50);

        int x = Integer.parseInt("100"); // String → int

        System.out.println("Parsed value: " + x);

        int value = list.get(1); // unboxing

        System.out.println("Second element: " + value);
    }
}