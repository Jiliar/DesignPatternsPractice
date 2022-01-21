package behaviors.strategy;

//This class is a context
public class Transaction {

    private IOperation strategy;

    public Transaction(IOperation strategy) {
        this.strategy = strategy;
    }

    public IOperation getStrategy() {
        return strategy;
    }
    public void setStrategy(IOperation strategy) {
        this.strategy = strategy;
    }

    public float execTransaction(float balance, float quantity){
        return this.strategy.make(balance, quantity);
    }

}
