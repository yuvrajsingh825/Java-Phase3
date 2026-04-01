import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student s){
        return this.name.compareTo(s.name); // ascending


    }

    
}
class AscendingSort{
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 85);
        Student s2 = new Student("Bob", 75);
        Student s3 = new Student("Charlie", 90);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students);

        for(Student s : students){
            System.out.println(s.name + ": " + s.marks);
        }
    }
}
