package doublecolomnoperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //Zero-arguments
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());


        //One Argument
        Function<Integer, Car> f1 = make -> new Car(make);
        System.out.println(f1.apply(200).getModel());

        Function<Integer, Car> f2 = Car::new;
        Car bmw2 = f2.apply(2002);
        System.out.println(bmw2.getModel());

        //two arguments
        BiFunction<String, Integer,Car> b1 = (make, model) -> new Car(make, model);
        System.out.println(b1.apply("Honda", 1200));

        BiFunction<String, Integer, Car> b2 = Car::new;
        System.out.println(b1.apply("Honda CRV", 2022).getMake());
    }
}
