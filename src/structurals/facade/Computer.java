package structurals.facade;

public class Computer {

    private IKeyboard keyboard;
    private IMouse mouse;

    public Computer(IKeyboard keyboard, IMouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void turnOn(){
        this.keyboard.connect();
        this.mouse.connect();
    }

}
