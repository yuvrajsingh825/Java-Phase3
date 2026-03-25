import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[]args){
        LinkedList<Float> list = new LinkedList<>();
        list.add(10.1f);
        list.add(150.24f);
        list.add(14.21f);
        list.add(15.24f);
        list.add(45.24f);
        System.out.println("List:"+ list);
        list.add(2,99.0f);
        System.out.println("After adding 99 at index 2 :"+list);
        list.remove(4);
        System.out.println("After removing element from index 4:"+list);





    }

    }


