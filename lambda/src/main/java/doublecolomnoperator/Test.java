package doublecolomnoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Test {


    public static void main(String[] args) {

        //Reference to static method
        Calculate cl = (x,y) -> Calculator.findSum(x,y);
        cl.calculate(10,20);

        Calculate cl2 = Calculator::findSum;
        cl2.calculate(2,2);

        //Reference to instance method
        Calculate m1 = (x,y) -> new Calculator().findMultiply(x,y);
        m1.calculate(2,2);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;

        Calculate m3 = new Calculator()::findMultiply;

        BiFunction<String, Integer, String> fn = (srt,i) -> srt.substring(i);
        System.out.println(fn.apply("Developer", 6));

        BiFunction<String, Integer, String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer", 6));

        Consumer<Integer> display2 = System.out::println;
        display2.accept(50);


    }

}