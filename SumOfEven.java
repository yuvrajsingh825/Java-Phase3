import java.util.ArrayList;
import java.util.Arrays;
public class SumOfEven {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,15,25,48,35));
        int sum = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even : " + sum);
    }
}
