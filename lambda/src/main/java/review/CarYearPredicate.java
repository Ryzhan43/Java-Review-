package review;

public class CarYearPredicate implements CarPredicate{

    @Override
    public boolean teat(Car car) {
        return car.getTopSpeed() > 2015;
    }
}