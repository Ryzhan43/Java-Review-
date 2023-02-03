package task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTask {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Apple", "Honda", "Developer");


        words.stream().forEach(String::length);

        //Task2
        List<Dish> dishesList = Arrays.asList(
                new Dish("pork", false,800, Type.MEAT),
                new Dish("beef", false,700, Type.MEAT),
                new Dish("c chicken", false,400, Type.MEAT),
                new Dish("fries", true,530, Type.OTHER),
                new Dish("d rice", true,350, Type.OTHER),
                new Dish("b fruit", true,120, Type.OTHER),
                new Dish("pizza", true,550, Type.OTHER),
                new Dish("a prawns", false,300, Type.FISH),
                new Dish("salmon", false,450, Type.FISH)
        );


        //FILTER CALS LESS THAN 400
        System.out.println("Dishes less than 400 cals");
        dishesList
                .stream()
                .filter(i->i.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Names length
        System.out.println("\nEach dish name length");
        dishesList
                .stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("\n Sorting by name");
        dishesList
                .stream()
                .sorted(Comparator.comparing(Dish::getName))
                .map(Dish::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("\n 3 high calories dishes >300");
        dishesList.stream()
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .filter(dish -> dish.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("\n Dishes below 400 cals - sorted");
        dishesList.stream()
                .filter(dish -> dish.getCalories()<401)
                .map(Dish::getName)
                .sorted()
                .forEach(System.out::println);



    }
}
