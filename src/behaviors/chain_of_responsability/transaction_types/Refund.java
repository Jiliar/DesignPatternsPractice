package behaviors.chain_of_responsability.transaction_types;

import behaviors.chain_of_responsability.ITransaction;
import behaviors.chain_of_responsability.ITransactionManager;
import behaviors.chain_of_responsability.TransactionType;

public class Refund implements ITransactionManager {
    private ITransactionManager next;

    @Override
    public void setNextManager(ITransactionManager next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(ITransaction transaction) {
        if(transaction.getTransactionType() == TransactionType.REFUND){
            System.out.println(transaction.toString());
            float balance = transaction.getBalance() + transaction.getQuantity();
            transaction.setBalance(balance);
            System.out.println("After "+TransactionType.REFUND+" new balance is "+transaction.getBalance());
        }else{
            System.out.println("¡Transaction not valid!");
        }
    }
}
