package structurals.decorator.additionals;

import structurals.decorator.IPizza;

public class ExtraCheese implements IPizza {

    private IPizza pizza;

    public ExtraCheese(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return this.pizza.description()+" + Extra Cheese";
    }

    @Override
    public float price() {
        return this.pizza.price()+2;
    }
}
