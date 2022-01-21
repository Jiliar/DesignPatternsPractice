package behaviors.observer;

public class Customer extends User implements ISubscriber{
    public Customer(String name, String lastname) {
        super(name, lastname);
    }

    public void notification(String message) {
        System.out.println("¡Dear Customer "+this.toString()+" has received message!: "+message);
    }
}
