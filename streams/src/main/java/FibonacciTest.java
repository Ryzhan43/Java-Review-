import java.util.stream.Stream;

public class FibonacciTest {
    public static void main(String[] args) {
        Stream.iterate(0,n->n+2).limit(5).forEach(System.out::println);

        Stream.iterate(new int[]{0,1},n->new int[]{n[1],n[0]+n[1]})
                .limit(20)
                .forEach(t -> System.out.println("(" + t[0] +", "+t[1]+")"));


        Stream.iterate(new int[]{0,1},n->new int[]{n[1],n[0]+n[1]})
                .limit(20)
                .map(t ->t[1])
                .forEach(System.out::println);

    }
}
