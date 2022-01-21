package behaviors.visitor;

public class Main {
    public static void main (String args[]){
        //Fruits: Discount 10%
        IVisitor discount = new Discount();
        IFruits apple = new Apple(10, 200, "2022-06-10");
        apple.setDiscount(apple.applyDiscount(discount));
        System.out.println(apple.toString());

        //Home Appliances: Discount 5%
        IHomeAppliances washingMachine = new WashingMachine(1200, 50, "2022");
        washingMachine.setDiscount(washingMachine.applyDiscount(discount));
        System.out.println(washingMachine.toString());

    }
}
