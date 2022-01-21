package behaviors.chain_of_responsability;

import behaviors.chain_of_responsability.transaction_types.Deposit;
import behaviors.chain_of_responsability.transaction_types.Refund;
import behaviors.chain_of_responsability.transaction_types.Retirement;

public class Main {
    public static void main (String args[]){
        /* If transaction DEPOSIT is not valid then trying new RETIREMENT transaction
         *  If transaction RETIREMENT is not valid then trying new REFUND transaction
         * */
        ITransaction transaction = new Transaction(100,200, TransactionType.RETIREMENT);

        ITransactionManager deposit = new Deposit();
        ITransactionManager refund = new Refund();
        ITransactionManager retirement = new Retirement();
        deposit.setNextManager(retirement);
        retirement.setNextManager(refund);

        deposit.executeTransaction(transaction);

    }
}
