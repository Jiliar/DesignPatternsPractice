package structurals.facade;

//This class makes complex System's activities
public class Facade {

    private Computer computer;
    public Facade(){
        IKeyboard keyboard = new Keyboard();
        IMouse mouse = new Mouse();

        this.computer = new Computer(keyboard, mouse);
    }

    //Methods make complex activities
    public void turOn(){
        computer.turnOn();
    }
}
