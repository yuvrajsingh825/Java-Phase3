import java.util.HashMap;

public class StudentMap {
    public static void main(String[] args) {

        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Add students
        studentMarks.put("Alice", 55);
        studentMarks.put("Bhola", 85);
        studentMarks.put("Ram", 84);
        studentMarks.put("Mohan", 87);

        System.out.println("Before update: " + studentMarks);

        // Update marks
        studentMarks.put("Alice", 75); // update value

        // Remove student
        studentMarks.remove("Mohan");

        // Print updated map
        System.out.println("After update: " + studentMarks);

        // Print all keys
        System.out.println("Keys: " + studentMarks.keySet());

        // Print all values
        System.out.println("Values: " + studentMarks.values());
    }
}