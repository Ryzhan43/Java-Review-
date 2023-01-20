import java.util.ArrayList;
import java.util.List;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();

        //Add Elements to ArrayList
        students.add(new Student(101, "Michael"));
        students.add(new Student(102, "Jose"));
        students.add(new Student(103, "Ronny"));
        students.add(new Student(104, "Nick"));

        System.out.println(students);
    }
}
