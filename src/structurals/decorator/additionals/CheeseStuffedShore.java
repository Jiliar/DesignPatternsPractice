package structurals.decorator.additionals;

import structurals.decorator.IPizza;

public class CheeseStuffedShore implements IPizza  {

    private IPizza pizza;

    public CheeseStuffedShore(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return this.pizza.description()+" + Cheese Stuffed Shore";
    }

    @Override
    public float price() {
        return this.pizza.price()+4;
    }
}
