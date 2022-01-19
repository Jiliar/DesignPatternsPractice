package structurals.decorator;

import structurals.decorator.additionals.CheeseStuffedShore;
import structurals.decorator.additionals.ExtraCheese;

public class Main {
    public static void main (String args[]){

        IPizza peperoniPizza = new PeperoniPizza();
        System.out.println(peperoniPizza.description());
        System.out.println(peperoniPizza.price());

        IPizza hawaiianPizza = new HawaiianPizza();
        System.out.println(hawaiianPizza.description());
        System.out.println(hawaiianPizza.price());

        //Cheese Additional then 2 USD
        IPizza peperoniPizza2 = new ExtraCheese(new PeperoniPizza());
        System.out.println(peperoniPizza2.description());
        System.out.println(peperoniPizza2.price());

        //Cheese stuffed shore then 4 USD
        IPizza hawaiianPizza2 = new CheeseStuffedShore(new HawaiianPizza());
        System.out.println(hawaiianPizza2.description());
        System.out.println(hawaiianPizza2.price());

        //Cheese stuffed shore + Cheese Additional + peperoniPizza
        IPizza peperoniPizza3 = new CheeseStuffedShore(new ExtraCheese(new HawaiianPizza()));
        System.out.println(peperoniPizza3.description());
        System.out.println(peperoniPizza3.price());
    }
}
