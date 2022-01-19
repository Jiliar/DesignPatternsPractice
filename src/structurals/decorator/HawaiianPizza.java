package structurals.decorator;

public class HawaiianPizza implements IPizza{
    @Override
    public String description() {
        return "Pizza Hawaiian";
    }

    @Override
    public float price() {
        return 10;
    }
}
