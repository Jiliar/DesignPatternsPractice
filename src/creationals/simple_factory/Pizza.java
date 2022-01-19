package creationals.simple_factory;

public class Pizza {

    private int slices;

    public Pizza(int slices) {
        this.slices = slices;
    }

    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }

    @Override
    public String toString() {
        return "Pizza{ slices: "+this.slices+" }";
    }
}
