package behaviors.observer;

public class Main {

    public static void main (String args[]){
        Product product = new Product("Cellphone",100,10);
        ProductManager productManager =new  ProductManager(product);

        ISubscriber user1 = new Courier("Barack", "Obama");
        ISubscriber user2 = new Customer("Joe", "Biden");

        productManager.addSubscriber(user1);
        productManager.addSubscriber(user2);

        productManager.sell(2);

        productManager.removeSubscriber(user2);
        productManager.sell(3);
    }
}
