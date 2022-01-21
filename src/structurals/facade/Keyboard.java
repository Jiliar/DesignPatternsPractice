package structurals.facade;

public class Keyboard implements IKeyboard{

    @Override
    public void connect() {
        System.out.println("¡Keyboard is connected!");
    }
}
