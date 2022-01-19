package creationals.abstract_factory;

public class IPad extends Device implements ITablet{

    public IPad(int id, String name, int model, double price) {
        super(id, name, model, price);
    }

}
