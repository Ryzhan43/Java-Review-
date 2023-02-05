package task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {

        //ALL MATCH
        boolean isHealthy = DishData.getAll().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        //ANY MATCH
        if(DishData.getAll().anyMatch(Dish::isVegetarian)) {
            "\nThe menu is vegetarian friendly\n".transform(System.out::printf);
        }

        //NONE MATCH
        "\n************ NONE MATCHED ************\n".transform(System.out::printf);
        boolean isHealthy2 = DishData.getAll().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        //FIND ANY
        "\n************ NONE MATCHED ************\n".transform(System.out::printf);
        Optional<Dish> dish =   DishData.getAll()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        //Find first
        "************ FIND FIRST************\n".transform(System.out::printf);
        Optional<Dish> dish2 = DishData.getAll()
                .filter(Dish::isVegetarian)
                .findFirst();
        dish2.stream().forEach(System.out::println);


        //REDUCE
        "************ REDUCE ************\n".transform(System.out::printf);
        List<Integer> list3 = Arrays.asList(1,2,6,7,8,12,4);
        list3.stream().reduce(0,(a,b) -> a+b).toString().transform(System.out::printf);

        //REDUCE
        "************ REDUCE - NO INITIAL VALUE************\n".transform(System.out::printf);
        Optional<Integer> result =  list3.stream().reduce((a,b) -> a+b);
        result.stream().forEach(System.out::println);

        //Integer MIN and MAX with REDUCE METHOD
        Optional<Integer> minInteger = list3.stream().reduce((a,b) -> a < b ? a : b);
        Optional<Integer> maxInteger = list3.stream().reduce((a,b) -> a > b ? a : b);
        System.out.println("Min Integer = " + minInteger.get());
        System.out.println("Max Integer = " + maxInteger.get());

        minInteger = list3.stream().reduce(Integer::min);
        maxInteger = list3.stream().reduce(Integer::max);
        Optional<Integer> sumInt = list3.stream().reduce(Integer::sum);
        System.out.println("2nd coming");
        System.out.println("Min Integer = " + minInteger.get());
        System.out.println("Max Integer = " + maxInteger.get());
        System.out.println("Sum = " + sumInt.get());



    }

}
