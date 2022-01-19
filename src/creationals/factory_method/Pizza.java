package creationals.factory_method;

public class Pizza {

    private int slices;
    private String type;

    public Pizza(int slices, String type) {
        this.slices = slices;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pizza{ slices: "+this.slices+", type: "+this.type+" }";
    }
}
