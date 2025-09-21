package factory;

import product.Car;
import product.Sedan;

public class SUVFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}