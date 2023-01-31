package comparatorInterface;

import jdk.dynalink.linker.LinkerServices;

import java.util.*;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 0,22,41,123,54);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.sort(((o1, o2) -> o1.compareTo(o2)));

        List<Apple> myInventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(90, Color.RED),
                new Apple(120, Color.RED),
                new Apple(190, Color.GREEN),
                new Apple(90, Color.RED)
        );

        Comparator<Apple> sortApple =  comparing((Apple apple) -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);;

        myInventory.sort(comparing(Apple::getWeight));

        //Reverse
        myInventory.sort(comparing(Apple::getWeight).reversed());

        //
        myInventory
                .sort(comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor));
        System.out.println(myInventory);

    }
}
