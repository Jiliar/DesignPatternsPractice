package behaviors.visitor;

public class Apple extends Product implements IFruits {

    private final String expiration;

    public Apple(float price, float stock, String expiration) {
        super(price, stock);
        this.expiration = expiration;
    }

    public String getExpiration() {
        return expiration;
    }

    @Override
    public float applyDiscount(IVisitor visitor) {
        return visitor.discount(this);
    }

    @Override
    public String toString() {
        return super.toString()+" Apple { " +"expiration = " + expiration + " }";
    }

}
