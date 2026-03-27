import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Mango", 30);

        System.out.println(map);

        System.out.println("Price of Apple: " + map.get("Apple"));

        map.remove("Banana");

        System.out.println("After removal: " + map);
    }
}