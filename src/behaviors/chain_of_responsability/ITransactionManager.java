package behaviors.chain_of_responsability;

public interface ITransactionManager {

    void setNextManager(ITransactionManager next);
    void executeTransaction(ITransaction transaction);

}
