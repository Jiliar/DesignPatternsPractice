package creationals.simple_factory;

//Client class: this class doesn't need to know what is the process to get Pizzas
public class Main {

    public static void main(String args[]){

        //Case without Simple Factory
        // In this way, we need to specify what is the number of slices that must have the pizza
        User user0 = new User("Joe", "Biden");
        Pizza pizzaPeperoni = new Pizza(8);
        System.out.println(user0.toString());
        System.out.println(pizzaPeperoni.toString());

        //Cases using Simple Factory
        // In this way, we only realize order according user request us: Small, Medium, Large.
        PizzaOrder pizzaShop = new PizzaOrder();

        //Small Pizza
        User user1 = new User("George", "Bush");
        PizzaOrder smallPizza = pizzaShop.smallPizza(user1);
        System.out.println(smallPizza);

        //Medium Pizza
        User user2 = new User("Barak", "Obama");
        PizzaOrder mediumPizza = pizzaShop.mediumPizza(user2);
        System.out.println(mediumPizza);

        // Two Large Pizza
        User user3 = new User("George", "Washington");
        PizzaOrder largePizza = pizzaShop.largePizza(user3);
        System.out.println(largePizza);

    }
}
