package structurals.facade;

public class Mouse implements IMouse{

    @Override
    public void connect() {
        System.out.println("¡Mouse is connected!");
    }
}
