package creationals.abstract_factory;

public class SamsungComputer extends Device implements IComputer{

    public SamsungComputer(int id, String name, int model, double price) {
        super(id, name, model, price);
    }

}
