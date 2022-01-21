package behaviors.state.car_states;

import behaviors.state.Car;
import behaviors.state.ICarState;

public class OnCar implements ICarState {

    private final Car car;

    public OnCar(Car car) {
        this.car = car;
    }

    @Override
    public void on() {
        System.out.println("¡Car is ON!");
    }

    @Override
    public void moving() {
        System.out.println("¡Car is moving!");
        car.setCurrent(car.getMoving());
    }

    @Override
    public void off() {
        System.out.println("¡Car is OFF!");
        car.setCurrent(car.getOff());
    }
}
