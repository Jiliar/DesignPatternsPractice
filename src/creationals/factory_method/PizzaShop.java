package creationals.factory_method;

//This class decide wich class to instantiate
public class PizzaShop implements IPizzaShop{

    @Override
    //Liskov sustitution Application in this Method, ej: Pizza pizza = new PeperoniPizza(...)
    public Pizza makeSmallPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "Peperoni":
                pizza = new PeperoniPizza(6, "Peperoni");
                break;
            case "Hawaiian":
                pizza = new HawaiianPizza(6, "Hawaiian");
                break;
            case "Cheese":
                pizza = new ChessePizza(6, "Cheese");
                break;
        }
        return pizza;
    }


    @Override
    //Liskov sustitution Application in this Method, ej: Pizza pizza = new PeperoniPizza(...)
    public Pizza makeMediumPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "Peperoni":
                pizza = new PeperoniPizza(8, "Peperoni");
                break;
            case "Hawaiian":
                pizza = new HawaiianPizza(8, "Hawaiian");
                break;
            case "Cheese":
                pizza = new ChessePizza(8, "Cheese");
                break;
        }
        return pizza;
    }

    @Override
    //Liskov sustitution Application in this Method, ej: Pizza pizza = new PeperoniPizza(...)
    public Pizza makeLargePizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "Peperoni":
                pizza = new PeperoniPizza(12, "Peperoni");
                break;
            case "Hawaiian":
                pizza = new HawaiianPizza(12, "Hawaiian");
                break;
            case "Cheese":
                pizza = new ChessePizza(12, "Cheese");
                break;
        }
        return pizza;
    }
}
