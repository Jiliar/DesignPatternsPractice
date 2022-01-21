package behaviors.observer;

public class Courier extends User implements ISubscriber{
    public Courier(String name, String lastname) {
        super(name, lastname);
    }

    public void notification(String message) {
        System.out.println("¡Hello Courier "+this.toString()+" has received message!: "+message);
    }
}
