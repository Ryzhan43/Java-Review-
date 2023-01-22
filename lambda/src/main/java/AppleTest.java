import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(300,Color.GREEN));
        appleList.add(new Apple(100, Color.RED));
        appleList.add(new Apple(200,Color.GREEN));
        appleList.add(new Apple(450,Color.RED));
        appleList.add(new Apple(50,Color.GREEN));
        appleList.add(new Apple(350,Color.GREEN));

        List<Apple> heavyApple = filterApples(appleList, new AppleHeavyPredicate());
        List<Apple> colorApple = filterApples(appleList, new AppleGreenColorPredicate());
        System.out.println(heavyApple);
        System.out.println(colorApple);

        prettyPrintApple(appleList, new AppleGreenColorPredicate());
    }

    private static List<Apple> filterApples(List<Apple> appleList, ApplePredicate applePredicate) {

        List<Apple> resault = new ArrayList<>();

        for(Apple apple : appleList) if(applePredicate.test(apple)) resault.add(apple);

        return resault;
    }

    private static void prettyPrintApple(List<Apple> appleList, ApplePredicate applePredicate){
        for(Apple apple : appleList) System.out.println(applePredicate.print(apple));
    }

}
