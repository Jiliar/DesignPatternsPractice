package behaviors.observer;

public interface IPublisher {

    void addSubscriber(ISubscriber subscriber);
    void removeSubscriber(ISubscriber subscriber);
    void notifySuscriber(String message);
}
