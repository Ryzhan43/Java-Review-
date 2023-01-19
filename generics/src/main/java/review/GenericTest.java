package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teachersList = new ArrayList<Teacher>();

        teachersList.add(new Teacher("Albus", 201));
        teachersList.add(new Teacher("Severus", 202));

        printInfo(studentList);
        System.out.println("/n");
        printInfo(teachersList);
    }

    public static <T> void printInfo(List<T> items){
        for(T i : items){
            System.out.println(i.toString());
        }
        System.out.println(items.size());
    }
}
