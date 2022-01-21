package structurals.virtual_proxy;

public class Service implements IService {

    @Override
    public void write() {
        System.out.println("¡Service is writing!");
    }

    @Override
    public void read() {
        System.out.println("¡Service is reading!");
    }

    @Override
    public void update() {
        System.out.println("¡Service is updating!");
    }

    @Override
    public void delete() {
        System.out.println("¡Service is deleting!");
    }
}
