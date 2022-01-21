package behaviors.state.car_states;

import behaviors.state.Car;
import behaviors.state.ICarState;

public class OffCar implements ICarState {

    private final Car car;

    public OffCar(Car car) {
        this.car = car;
    }

    @Override
    public void on() {
        System.out.println("¡Car is ON!");
        car.setCurrent(car.getOn());
    }

    @Override
    public void moving() {
        System.out.println("¡You can't move the car when it's off!");
    }

    @Override
    public void off() {
        System.out.println("¡Car is OFF from before!");
    }
}
