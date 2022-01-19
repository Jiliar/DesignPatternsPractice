package creationals.abstract_factory;

public class Device {

    private int id;
    private String name;
    private int model;
    private double price;

    public Device(int id, String name, int model, double price) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device "+this.getClass().getSimpleName()+
                " { id = " + id +", name = " + name +", model = " + model + ", price = " + price + "}";
    }
}
