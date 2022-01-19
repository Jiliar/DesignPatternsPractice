package creationals.abstract_factory;

public interface IAbstractFactory {

    //We could define n methods to create objects.
    //If we return an Interface our application must be more flexible
    //Interface indicates which is the object's family.
    IComputer createComputer(int id, String name, int model, double price);
    ITablet createTablet(int id, String name, int model, double price);

}
