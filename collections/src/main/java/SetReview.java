import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set
        Set<Student> studentSet = new HashSet<>();

        //Add elements
        studentSet.add(new Student(7," b Ibrahim"));
        studentSet.add(new Student(8," c Ahmet"));
        studentSet.add(new Student(9," a Mahbet"));

        System.out.println("Testing Set\n" + studentSet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));
        System.out.println("Testing function: " + firstRepeatingChar("njqeofqonfapsdnqwdn"));


        String str = "Java Developer";
        Set<String> newStr = new HashSet<>();

    }

    public static Character firstRepeatingChar(String str){
        Set<Character> chars = new HashSet<>();
        for(Character ch:str.toCharArray()) if(!chars.add(ch)) return ch;
        return null;
    }
}
