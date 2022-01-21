package behaviors.visitor;

/*This interface applies discounts stipulated from Discount class using IVisitor, also it forces you to modify product
discounts from each category.*/

public interface IVisitable {

    float applyDiscount(IVisitor visitor);
    void setDiscount(float discount);

}
