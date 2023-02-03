package task;

import java.util.Arrays;
import java.util.List;

public class StreamTask {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Apple", "Honda", "Developer");


        words.stream().forEach(String::length);

        //Task2
        List<Dish> dishesList = Arrays.asList(
                new Dish("pork", false,800, Type.MEAT),
                new Dish("beef", false,700, Type.MEAT),
                new Dish("chicken", false,400, Type.MEAT),
                new Dish("fries", true,530, Type.OTHER),
                new Dish("rice", true,350, Type.OTHER),
                new Dish("fruit", true,120, Type.OTHER),
                new Dish("pizza", true,550, Type.OTHER),
                new Dish("prawns", false,300, Type.FISH),
                new Dish("salmon", false,450, Type.FISH)
        );


        //FILTER CALS LESS THAN 400
        System.out.println("Dishes less than 400 cals");
        dishesList.stream().filter(i->i.getCalories()<400).map(Dish::getName).forEach(System.out::println);

        //Names length
        System.out.println("\nEach dish name length");
        dishesList.stream().map(Dish::getName).map(String::length).forEach(System.out::println);



    }
}
