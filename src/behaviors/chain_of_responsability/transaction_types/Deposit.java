package behaviors.chain_of_responsability.transaction_types;

import behaviors.chain_of_responsability.ITransaction;
import behaviors.chain_of_responsability.ITransactionManager;
import behaviors.chain_of_responsability.TransactionType;

public class Deposit implements ITransactionManager {
    private ITransactionManager next;

    @Override
    public void setNextManager(ITransactionManager next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(ITransaction transaction) {
        if(transaction.getTransactionType() == TransactionType.DEPOSIT){
            System.out.println(transaction.toString());
            float balance = transaction.getBalance() + transaction.getQuantity();
            transaction.setBalance(balance);
            System.out.println("After "+TransactionType.DEPOSIT+" new balance is "+transaction.getBalance());
        }else{
            this.next.executeTransaction(transaction);
        }
    }
}
