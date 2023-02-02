package review;

public class CarFastPredicate implements CarPredicate{

    @Override
    public boolean teat(Car car) {
        return car.getTopSpeed() > 160;
    }
}
