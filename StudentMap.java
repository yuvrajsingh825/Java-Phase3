import java.util.HashMap;
public class StudentMap {
    public static void main(String[]args){
        HashMap<String, Integer> studentMarks =new HashMap<>();
        HashMap<String,Integer> map;
        studentMarks.put("Alice",55);
        studentMarks.put("bhola",85);
         studentMarks.put("ram",84);
          studentMarks.put("mohan",87);
          System.out.println("StudentMArks before update:"+studentMarks);

          studentMarks.remove("mohan");

          System.out.println("StudentMarks after update:"+studentMarks);
          




    }
}
