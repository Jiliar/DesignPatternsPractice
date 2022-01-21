package behaviors.chain_of_responsability;

public interface ITransaction {
    TransactionType getTransactionType();
    void setTransactionType(TransactionType transactionType);
    float getQuantity();
    void setQuantity(float quantity);
    float getBalance();
    void setBalance(float balance);
}
