package creationals.abstract_factory;


//Each factory decides which object will be returned
public class SamsungStore implements IAbstractFactory {
    @Override
    public IComputer createComputer(int id, String name, int model, double price) {
        return new SamsungComputer(id, name, model, price);
    }

    @Override
    public ITablet createTablet(int id, String name, int model, double price) {
        return new SamsungS3Tab(id, name, model, price);
    }
}
