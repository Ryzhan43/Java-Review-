import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
        List<Student> students = new ArrayList<>();
        HashMap<String, Student> hashList = new HashMap<>();

        hashList.put("F",new Student(104, "T Nick"));
        hashList.put("C",new Student(104, "T Nick"));
        hashList.put("D",new Student(104, "T Nick"));
        hashList.put("A",new Student(104, "T Nick"));

        System.out.println("Hash list\n" + hashList + "\n");

        //Add Elements to ArrayList
        students.add(new Student(104, "T Nick"));
        students.add(new Student(101, "Y Michael"));
        students.add(new Student(102, "B Jose"));
        students.add(new Student(103, "A Ronny"));

        System.out.println(students);

        //Print Forward
        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //Print backwards
        System.out.println("printing backwards...... ");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

        //for each loop
        System.out.println("\nPrinting with loop");
        for(Student student:students) System.out.println(student);

        //lambda
        System.out.println("\nPrinting with lamda");
        students.forEach(student -> {System.out.println(student);});

        //sorting Elements in List by ID
        System.out.println("\nSorting elements by id...");
        Collections.sort(students, new sortByIdDesc());
        students.forEach(student -> {System.out.println(student.id + " " +  student.name);});

        //sorting Elements in List by Name
        System.out.println("\nSorting elements by id...");
        Collections.sort(students, new sortByNameDesc());
        students.forEach(student -> {System.out.println(student.name);});
    }

    static class sortByIdDesc implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2){

            return s1.id - s2.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2){

            return s1.name.compareToIgnoreCase(s2.name);
        }
    }
}
