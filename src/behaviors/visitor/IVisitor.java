package behaviors.visitor;

//This interface generates discounts for each abstraction (products categories)
public interface IVisitor {

    float discount(IFruits fruit);
    float discount(IHomeAppliances homeAppliances);

}
