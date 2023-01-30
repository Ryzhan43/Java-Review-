package functionalInterfaces;

import task.Orange;

import java.util.function.Predicate;

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


    }

    }
