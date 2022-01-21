package behaviors.visitor;

public class WashingMachine extends Product implements IHomeAppliances{

    private final String model;

    public WashingMachine(float price, float stock, String model) {
        super(price, stock);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public float applyDiscount(IVisitor visitor) {
        return visitor.discount(this);
    }

    @Override
    public String toString() {
        return super.toString()+" WashingMachine { model = " + model +'}';
    }
}
