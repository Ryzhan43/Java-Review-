package task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DishData {

    public static Stream<Dish> getAll() {
        return Stream.of(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("c chicken", false, 400, Type.MEAT),
                new Dish("fries", true, 530, Type.OTHER),
                new Dish("d rice", true, 350, Type.OTHER),
                new Dish("b fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("a prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );
    }
}

