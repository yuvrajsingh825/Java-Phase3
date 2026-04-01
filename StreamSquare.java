import java.util.*;
public class StreamSquare {
    public static void main(String[]args){
    List<Integer> list = Arrays.asList(1,2,3,4,5,6);   
    
    list.stream()
       .map(x->x*x)
        .forEach(System.out::println);
    }
}
