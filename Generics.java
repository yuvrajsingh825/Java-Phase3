import java.util.ArrayList;
import java.util.Collections;

public class Generics {
    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>();
        list.add("rahul");
        list.add("Kamlesh");
        list.add("ram");
        list.add("monu");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("reversesortinglist: " + list);

        Collections.sort(list);
        System.out.println("normal sorting list: " + list);
    }
}
