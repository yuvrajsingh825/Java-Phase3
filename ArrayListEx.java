import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("List: " + list);

        list.remove(2);
        list.remove(Integer.valueOf(3));
        

        System.out.println("After remove: " + list);
        list.add(6);
        System.out.println("After adding 6 :"+ list);;

        
    }
}