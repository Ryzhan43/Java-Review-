package task;

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




    }

}
