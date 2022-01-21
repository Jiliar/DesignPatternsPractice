package behaviors.observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProductManager implements IPublisher{

    Product product;
    private Set<ISubscriber> subscriberSet;

    public ProductManager(Product product) {
        this.product = product;
        if(subscriberSet == null){
            this.subscriberSet = new LinkedHashSet<>();
        }
    }

    public void sell(int quantity){
        product.setStock(product.getStock()-quantity);
        this.notifySuscriber("¡Product "+product.getName()+" [price: $"+product.getPrice()+"] was sold!" +
                                " New Stock:"+product.getStock());
    }

    @Override
    public void addSubscriber(ISubscriber subscriber) {
        if(subscriberSet != null){
            this.subscriberSet.add(subscriber);
        }
    }

    @Override
    public void removeSubscriber(ISubscriber subscriber) {
        if(subscriberSet != null){
            this.subscriberSet.remove(subscriber);
        }
    }

    @Override
    public void notifySuscriber(String message) {
        if(subscriberSet != null){
           for(ISubscriber subscriber: this.subscriberSet){
               subscriber.notification(message);
           }
        }
    }
}
