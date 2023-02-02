package review;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Honda", 420, 2022));
        carList.add(new Car("Lexus", 400, 2023));
        carList.add(new Car("Toyota", 400, 2021));
        carList.add(new Car("BMW", 400, 1998));
        carList.add(new Car("Infinity", 400, 1999));

        carList.sort(Comparator.comparing(Car::getTopSpeed).reversed().thenComparing(Car::getMake));

        carList.forEach(a -> System.out.println("Car: " + a.getMake() + " Top speed: " + a.getTopSpeed()));

        System.out.println("************************************************");

        carList.forEach(a -> {if(a.getMake().equals("Toyota")) System.out.println("Car: " + a.getMake() + " Top speed: " + a.getTopSpeed());});

        System.out.println("*************************\n");

        int i =0;
        while(i != 200){
            System.out.println("Char n: " + i + " -> " + Character.toString(i++));
        }


        if('A' < 'B') System.out.println("greater " );

    }

}
