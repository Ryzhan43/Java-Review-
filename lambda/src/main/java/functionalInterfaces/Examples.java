package functionalInterfaces;

import task.Orange;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {


        //*********************** Predicate *******************//
        Predicate<Integer> lesserThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>18;
            }
        };

        if(!lesserThan.test(20)) System.out.println("False");

        Predicate<Integer> lessThen = integer -> integer>18;


        //*********************** Consumer *******************//
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(12);

        //*********************** BiConsumer *******************//
        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100, 200);

        //*********************** Function*******************//
        Function<String, String > function = s -> "Hello " + s;
        System.out.println(function.apply("Mykyta"));


        //*********************** SUPPLIER *******************//
        Supplier<Integer> randomValue = () -> (int)(Math.random()*1000);
        System.out.println(randomValue.get());


    }



    }
