package behaviors.strategy;

public class Deposit implements IOperation {

    //In this method we should create the algorithm
    @Override
    public float make(float balance, float quantity) {
        return balance + quantity;
    }
}
