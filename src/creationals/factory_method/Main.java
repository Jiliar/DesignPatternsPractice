package creationals.factory_method;

public class Main {

    public static void main (String args[]) {
        PizzaShop pizzaShop = new PizzaShop();
        Pizza peperoni = pizzaShop.makeSmallPizza("Peperoni");
        Pizza hawaiian = pizzaShop.makeMediumPizza("Hawaiian");
        Pizza cheese = pizzaShop.makeLargePizza("Cheese");

        System.out.println(peperoni);
        System.out.println(hawaiian);
        System.out.println(cheese);
    }
}
