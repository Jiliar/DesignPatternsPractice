package behaviors.visitor;

public class Discount implements IVisitor{

    public float discount(IFruits fruit) {
        return fruit.getPrice() * 0.1f;
    }

    public float discount(IHomeAppliances homeAppliances) {
        return homeAppliances.getPrice() * 0.05f;
    }
}
