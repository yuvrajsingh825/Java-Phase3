import java.util.*;

public class WrapperEx {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // auto-boxing
        list.add(20);

        int x = list.get(0); // unboxing

        System.out.println(x);
    }
}