package structurals.decorator;

public class PeperoniPizza implements IPizza{
    @Override
    public String description() {
        return "Pizza Peperoni";
    }

    @Override
    public float price() {
        return 10;
    }
}
