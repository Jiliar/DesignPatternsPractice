package behaviors.state.car_states;

import behaviors.state.Car;
import behaviors.state.ICarState;

public class MovingCar implements ICarState {

    private final Car car;

    public MovingCar(Car car) {
        this.car = car;
    }

    @Override
    public void on() {
        System.out.println("¡Car is ON, You can't turn on the car again!");
    }

    @Override
    public void moving() {
        System.out.println("¡Car is moving from before!");
    }

    @Override
    public void off() {
        System.out.println("¡Car is OFF!");
        car.setCurrent(car.getOff());
    }
}
