package collectors;

import task.Dish;
import task.DishData;
import task.Type;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7, 8);

        //toCollection(Supplier) : is used to create a collection using collector
        System.out.println("************* toCollection()**********");
        System.out.println("************* LIST **********");
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        numberList.forEach(System.out::println);

        System.out.println("***************** SET **********************");
        Set<Integer> numberSet = numbers.stream()
                .filter(x ->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList() : returns a collector interface that gathers the input data into a new list
        System.out.println("**************** toList() *****************");
        System.out.println("*******************************************");

        List<Integer> numberList2 = numbers.stream()
                .filter(x ->x%2==0)
                .collect(Collectors.toList());

        System.out.println(numberList2);

        //toSet() : returns a Collectors interface that gathers the input data into a new set

        System.out.println("***************** toSet() *****************");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toSet());

        //toMap(Function, Function) : returns a Collector interface that gathers the input data into a new app
        Map<String,Integer> mapDish =  DishData.getAll()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        //counting() : returns a Collector that counts the number of the element
        System.out.println("***************** toSet() *****************");
        Long eventCount = numbers.stream()
                .filter(x ->x%2==0)
                .collect(Collectors.counting());

        System.out.println(eventCount);

        //summingInt(ToIntFunction) : returns a Collector that produces the sun of a integer-value func
        System.out.println("***************** summingInt() *****************");
        Integer sun = DishData.getAll()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sun);

        //averagingInt(ToIntFunction) : returns the average of the integer
        System.out.println("***************** ToIntFunction() *****************");
        Double caloriesAvg =  DishData.getAll()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(caloriesAvg);

        //joining() : is used to join various elements of a character or string array into a single string object
        System.out.println("***************** joining() *****************");
        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println(str);

        //partition() : is used to partition a stream of objects(or set of elements) based on a given predicate
        System.out.println("***************** partitionBy() *****************");
        Map<Boolean,List<Dish>> mapDishes = DishData.getAll()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(mapDishes);

        //groupingBy() : is used for grouping objects by some property and storing resaults in a map instance
        System.out.println("***************** groupingBy() *****************");
        Map<Type, List<Dish>> dishGroping = DishData.getAll()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishGroping);



    }

}
