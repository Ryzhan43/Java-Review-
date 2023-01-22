import java.util.List;

public class AppleHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }

    @Override
    public String print(Apple apple) {
        return "An apple of " + apple.getWeight()+ "g";
    }
}
