package creationals.abstract_factory;

//Each factory decides which object will be returned
public class AppleStore implements IAbstractFactory{

    @Override
    public IComputer createComputer(int id, String name, int model, double price) {
        return new MacBook(id, name, model, price);
    }

    @Override
    public ITablet createTablet(int id, String name, int model, double price) {
        return new IPad(id, name, model, price);
    }

}
