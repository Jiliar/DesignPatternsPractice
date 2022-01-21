package behaviors.state;

import behaviors.state.car_states.MovingCar;
import behaviors.state.car_states.OffCar;
import behaviors.state.car_states.OnCar;

public class Car implements ICarState{

    private ICarState on;
    private ICarState moving;
    private ICarState off;
    private ICarState current;

    public Car(){
        this.on = new OnCar(this);
        this.moving = new MovingCar(this);
        this.off = new OffCar(this);
        this.current = this.off; //Initial state
    }

    @Override
    public void on() {
        this.current.on();
    }
    @Override
    public void moving() {
        this.current.moving();
    }
    @Override
    public void off() {
        this.current.off();
    }

    public ICarState getOn() {
        return on;
    }
    public void setOn(ICarState on) {
        this.on = on;
    }
    public ICarState getMoving() {
        return moving;
    }
    public void setMoving(ICarState moving) {
        this.moving = moving;
    }
    public ICarState getOff() {
        return off;
    }
    public void setOff(ICarState off) {
        this.off = off;
    }
    public ICarState getCurrent() {
        return current;
    }
    public void setCurrent(ICarState current) {
        this.current = current;
    }
}
