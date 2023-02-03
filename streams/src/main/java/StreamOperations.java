import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,3,4,6,78,43,2,35,2,43,53,35,3,4,5,6,7);

        myList.forEach(new Course()::accept);


        //FILTER
        System.out.println("FILTER");
        myList.stream()
                .filter(i->i%3 == 0)
                .distinct()
                .forEach(System.out::println);

        //LIMIT
        System.out.println("\nLIMIT");
        myList
                .stream()
                .filter(i->i%2==0)
                .limit(1)
                .forEach(System.out::println);

        //SKIP
        System.out.println("\nSKIP");
        myList
                .stream()
                .filter(i->i%2==0)
                .skip(1)
                .forEach(System.out::println);

        //MAP
        System.out.println("\nMAP");
        myList
                .stream()
                .filter(i->i%2==0)
                .map(i-> i*2)
                .forEach(System.out::println);



    }
}
