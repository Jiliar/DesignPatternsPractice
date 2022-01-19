package creationals.simple_factory;

//This class is the Simple Factory Class
public class PizzaOrder {

    private Pizza pizza;
    private User user;

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PizzaOrder { user = " + user + " pizza = " + pizza +"}";
    }

    public PizzaOrder smallPizza(User user){
        this.setPizza(new Pizza(6));
        this.setUser(user);
        return this;
    }

    public PizzaOrder mediumPizza(User user){
        this.setPizza(new Pizza(8));
        this.setUser(user);
        return this;
    }

    public PizzaOrder largePizza(User user){
        this.setPizza(new Pizza(12));
        this.setUser(user);
        return this;
    }

}
