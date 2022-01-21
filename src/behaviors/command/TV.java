package behaviors.command;

public class TV implements IDevice{

    private boolean on;

    public TV(){}

    public TV(boolean on){
        this.on = on;
    }

    @Override
    public void on() {
        this.on = true;
        System.out.println("¡TV ON!");
    }

    @Override
    public void off() {
        this.on = false;
        System.out.println("¡TV OFF!");
    }
}
